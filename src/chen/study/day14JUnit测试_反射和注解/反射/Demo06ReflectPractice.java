package chen.study.day14JUnit测试_反射和注解.反射;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习：写一个"框架"可以帮我们去创建任意类的对象，并且去执行其中任意方法
    可以创建任意类的对象，执行任意方法

        前提：框架不能改变该类任何代码，可以创建任意类的对象，执行其中任意方法

        实现需要的技术：
            1.配置文件
            2.反射

        实现步骤：1.将需要创建的对象的全类名和需要执行的方法，定义在配置文件中
                 2.在程序中加载读取配置文件
                 3.使用反射技术来加载类文件进内存
                 4.创建对象
                 5.执行方法

 */
public class Demo06ReflectPractice {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1 创建Properties对象
        Properties pro = new Properties();
        //1.2 加载配置文件，转换为一个集合
        //1.2.1 获取class目录下的配置文件®
        ClassLoader classLoader = Demo06ReflectPractice.class.getClassLoader();//类加载器将类加载进内存
        InputStream is = classLoader.getResourceAsStream("wink.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建类对象
        Object obj = cls.newInstance();
        //5.创建方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
