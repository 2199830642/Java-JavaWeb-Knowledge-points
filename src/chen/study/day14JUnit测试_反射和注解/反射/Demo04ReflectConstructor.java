package chen.study.day14JUnit测试_反射和注解.反射;

import java.lang.reflect.Constructor;


/*
    方法和field的类似
    1.创建对象：T newInstance
            如果使用空参构造 可以直接用类对象直接调用newInstance方法
 */
public class Demo04ReflectConstructor {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;

        //2.获取构造方法们
        //          （1）Constructor<?>[] getConstructors(),
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);//public cn.itcast.day14基础加强.反射.Person(java.lang.String,int)
        }
        System.out.println("==================");
        //            (2)Constructor<T> getConstructor()
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Person person = constructor.newInstance("张三", 19);
        System.out.println(person);

        Person person1 = personClass.newInstance();
        System.out.println(person1);
    }
}
