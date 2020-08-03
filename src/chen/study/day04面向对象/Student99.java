package chen.study.day04面向对象;
/*
* 定义一个标准的类，一个标准的类通常要满足下列四个组成部分：
* 1.所有的成员变量都需要用private关键字进行私有化修饰
* 2.为每一个成员变量编写一对setter/getter方法。
* 3.编写一个无参数的构造方法
* 4.编写一个全参数的构造方法
*
* 这样标准的类又被称作Java Bean
* */
public class Student99 {
    private String name;//姓名
    private int age;//年龄

    public Student99() {
    }

    public Student99(String name, int age) {
        this.name = name;
        this.age = age;
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
