package chen.study.day04面向对象;
/*
* 当方法的局部变量与成员变量重名时，根据就近原则优先使用局部变量
* 如果需要访问本类的成员变量，需要使用格式：
* this.成员变量名
*
*
* 注意！！！：谁调用了这个方法，谁就是this.
* */
public class Person1 {
    String name;//我自己的名字

    //参数name是对方的名字
    //成员变量name是自己的名字
    public void sayHello(String name){
        System.out.println(name+",你好。我是"+this.name);
    }
}
