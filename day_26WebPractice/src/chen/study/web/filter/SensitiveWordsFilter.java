package chen.study.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 敏感词过滤器
 */
@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.创建代理对象增强getParameter方法
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                //判断是否是getParameter
                if (method.getName().equals("getParameter")){
                    //增强返回值
                    //获取返回值
                    String value = (String)method.invoke(req, args);
                    if (value!=null){
                        for (String s : list) {
                            if (value.contains(s)){
                                value = value.replaceAll(s,"***");
                            }
                        }
                    }
                    return value;
                }
                //判断方法名是否是getParameterMap
                if (method.getName().equals("getParameterMap")){
                    //增强返回值
                    //获取返回值
                    Map<String,String> value = (Map<String, String>) method.invoke(req, args);
                    if (value!=null){
                        Set<Map.Entry<String, String>> entries = value.entrySet();
                        for (Map.Entry<String, String> entry : entries) {
                            for (String s : list) {
                                if (entry.getValue().contains(s)){
                                    entry.getValue().replace(s,"***");
                                }
                            }
                        }
                    }
                    return value;
                }
                //判断方法名是否为getParameterValue
                if (method.getName().equals("getParameterValue")){
                    //增强返回值
                    //获取返回值
                    String[] value = (String[])method.invoke(req, args);
                    if (value!=null){
                        for (String str : value) {
                            for (String s : list) {
                                if (str.contains(s)) {
                                    str = str.replaceAll(s, "***");
                                }
                            }
                        }
                    }
                    return value;
                }
                return method.invoke(req,args);
            }
        });
        //2.放行
        chain.doFilter(proxy_req, resp);
    }
    //敏感词汇list集合
    private List<String> list = new ArrayList<>();
    public void init(FilterConfig config) throws ServletException {
        try {
            //1.加载文件
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            //2.读取文件
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            //3.将文件的每一行数据添加到list中
            String line = null;
            while((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
