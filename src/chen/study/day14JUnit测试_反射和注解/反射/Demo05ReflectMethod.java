package chen.study.day14JUnit测试_反射和注解.反射;

import java.lang.reflect.Method;

/*
    获取成员方法们
        Method[] getMethods();
        Method getMethod(String name,类<?>...parameterTypes);
        Method[] getDeclaredMethods();
        Method getDeclaredMethod(String name,类<?>...parameterTypes);

    如何执行方法呢：
        Object invoke(Object obj,Object...args)
        获取方法名：String getName();

    获取类名：getName();
 */
public class Demo05ReflectMethod {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        // 1.Method[] getMethods();获取所有public方法
        Method[] method = personClass.getMethods();
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i]);
            String name = method[i].getName();
            System.out.println(name);
        }

        //2.Method getMethod(String name,类<?>...parameterTypes);获取指定public方法
        Method eat = personClass.getMethod("eat");//无参数方法
//如何执行方法呢：需要创建一个对象
        Person p = new Person();
        eat.invoke(p);//吃饭饭

        Method eat2 = personClass.getMethod("eat2", String.class);//有参数方法
        eat2.invoke(p,"饭");//eat...饭

        //获取类名
        String className = personClass.getName();
        System.out.println(className);//cn.itcast.day14基础加强.反射.Person
    }
}
