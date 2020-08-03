package chen.study.day04面向对象;

public class Demo10Student1Gouzao {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();

        System.out.println("============");

        Student1 stu2 = new Student1("鹿晗",20);

        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
