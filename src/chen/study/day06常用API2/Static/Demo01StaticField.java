package chen.study.day06常用API2.Static;
/*
* 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
*
* 注意：根据类名称访问静态成员变量时，全程和对象就没关系，只和类有关
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",20);
        Student stu2 = new Student("黄蓉",18);
        Student.room = "101教室";


        System.out.println("姓名："+stu1.getName()+
                ",年龄："+stu1.getAge()+",教室："+Student.room+",学号："+stu1.getId());
        System.out.println("姓名："+stu2.getName()+
                ",年龄："+stu2.getAge()+",教室："+Student.room+",学号："+stu2.getId());
    }

}
