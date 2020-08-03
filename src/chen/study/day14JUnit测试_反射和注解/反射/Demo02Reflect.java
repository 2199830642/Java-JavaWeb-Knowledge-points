package chen.study.day14JUnit测试_反射和注解.反射;

public class Demo02Reflect {
    //获取class对象的方式：
    //     1.class.forName("全类名")，将字节码文件加载进内存，返回class对象
    //     2.类名.class：通过类名的属性class获取
    //     3.对象.getClass(),getClass()方法在object类中定义
    public static void main(String[] args) throws Exception {
        //1.class.forName("全类名")，将字节码文件加载进内存，返回class对象
        Class cls1 = Class.forName("chen.study.day14JUnit测试_反射和注解.反射.Person");
        System.out.println(cls1);
        //2.类名class：通过类名的属性class获取
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass(),getClass()方法在object类中定义
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true
    }
}
