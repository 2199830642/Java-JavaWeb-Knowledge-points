package chen.study.day05常用API1.ArrayList;

/*
* 自定义四个学生对象，添加到集合并遍历。
* */

import chen.study.day05常用API1.Person;

import java.util.ArrayList;

public class Demo13ArraylistStudent {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<>();
        Person stu1 = new Person("张三",20);
        Person stu2 = new Person("李四",19);
        Person stu3 = new Person("王五",18);
        Person stu4 = new Person("陈六",17);
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("姓名："+arr.get(i).getName()+",年龄："+arr.get(i).getAge());
        }
    }
}
