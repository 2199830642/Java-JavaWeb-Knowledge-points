package chen.study.day05常用API1.ArrayList;

import chen.study.day05常用API1.Person;

/*
 * 题目：定义一个数组，用来存储三个person对象
 *
 * 数组的缺点，一旦运行，运行过程中长度不可改变
 * */
public class Demo08Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组；
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 19);
        Person three = new Person("玛尔扎哈", 300);
        //将one中的地址赋值到array[0]中
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println("姓名：" + array[0].getName() + " 年龄：" + array[0].getAge());
    }
}
