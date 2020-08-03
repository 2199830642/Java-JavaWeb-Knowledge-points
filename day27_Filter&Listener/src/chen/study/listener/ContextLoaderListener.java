package chen.study.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * 监听ServletContext创建的，其实服务器启动后自动创建
     * 在服务器启动后自动调用
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext被创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
