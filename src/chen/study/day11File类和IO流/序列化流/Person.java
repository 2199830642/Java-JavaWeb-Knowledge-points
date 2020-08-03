package chen.study.day11File类和IO流.序列化流;

import java.io.Serializable;
/*
    static：静态关键字
        静态优先于非静态加载到内存中（静态优先于对象加载入内存中）
        被static修饰的成员变量是不能被序列化的，序列化的都是对象

    transient:瞬态关键字
        被transient修饰的成员变量不能被序列化，作用和static一样
        Person{name='小陈', age=0}，被修饰的age就成了默认值0
        如果不想成员变量静态也不想序列化就可使用transient

    给类定义一个序列号，那么类不管怎么改动 都可以反序列化不会报出InvalidClassException
 */
public class Person implements Serializable {
    //定义一个序列号
    private static  final long serialVersionUID = 1L;
    private String name;
    //private transient int age;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
