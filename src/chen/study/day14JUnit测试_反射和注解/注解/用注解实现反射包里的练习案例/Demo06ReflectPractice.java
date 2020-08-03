package chen.study.day14JUnit测试_反射和注解.注解.用注解实现反射包里的练习案例;

import java.lang.reflect.Method;

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
@wink(className = "cn.itcast.day14基础加强.注解.用注解实现反射包里的练习案例.Student1",methodName = "show1")
public class Demo06ReflectPractice {
    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo06ReflectPractice> reflectClass = Demo06ReflectPractice.class;
        //2.获取上面的注解对象
        wink an = reflectClass.getAnnotation(wink.class);//其实就是在内存中生成一个该注解接口的子类实现对象
        //3.调用注解对象中的抽象方法获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);//cn.itcast.day14基础加强.注解.用注解实现反射包里的练习案例.Student1
        System.out.println(methodName);//show1

        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
