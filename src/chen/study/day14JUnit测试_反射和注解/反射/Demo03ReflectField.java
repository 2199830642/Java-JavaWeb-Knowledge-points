package chen.study.day14JUnit测试_反射和注解.反射;

import java.lang.reflect.Field;
/*
        在反射面前 没有什么公有或者私有

        Field对象
        1.设置值  void set(Object obj,object value)
        2.获取值  get(Object obj)
        3.忽略访问权限修饰符的安全检查  setAccessible(true),暴力反射
 */


public class Demo03ReflectField {
    public static void main(String[] args) throws Exception {
        //0.获取Person类的Class对象
        Class<Person> personClass = Person.class;


        //1.获取成员变量
        //      (1)Field[] getFields  获取所有public 修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);//public java.lang.String cn.itcast.day14基础加强.反射.Person.a
        }
        System.out.println("=====================");


        //       (2)Field getField(String name) 获取指定名称的public修饰的成员变量
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);//null
        //设置a的值
        a.set(p,"张三");
        System.out.println(a);
        System.out.println("=====================");


        //      (3)Field[] getDeclaredFields  获取所有的成员变量  在反射面前 没有什么公有或者私有
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);//暴力反射
            System.out.println(declaredField);
        }
        System.out.println("==================");

        //      (4)Field getDeclaredField(String name) 获取指定的成员变量
        Field c = personClass.getDeclaredField("c");
        //忽略访问权限修饰符的安全检查
        c.setAccessible(true);//暴力反射
        System.out.println(c);
    }
}
