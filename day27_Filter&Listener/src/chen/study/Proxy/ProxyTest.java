package chen.study.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //1.创建真是对象
        Lenovo lenovo = new Lenovo();

        //动态代理增强Lenovo对象 固定格式
        /*
            三个参数：
                1.类加载器 如：lenovo.getClass().getClassLoader()
                2.接口数组 如：lenovo.getClass().getInterfaces()
                3.处理器 如： new InvocationHandler()

         */
        saleComputer proxy_lenovo = (saleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法，代理对象调用的所有方法都会触发该方法执行
                    参数：
                        1.proxy:代理对象
                        2.method:代理对象调用的方法被封装为的对象
                        3.args:代理对象调用方法时，传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //System.out.println("该方法执行了");

                //判断是否为sale方法
                if(method.getName().equals("sale")){
                    //1.增强参数
                    double money = (double)args[0];
                    money=money*0.85;
                    //使用真实对象调用该方法
                    String obj = (String)method.invoke(lenovo, money);
                    //2.增强返回值类型
                    return obj+"_鼠标垫";
                }else {
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }

            }
        });

        //2.调用方法
        String sale = proxy_lenovo.sale(8000);
        System.out.println(sale);
    }
}
