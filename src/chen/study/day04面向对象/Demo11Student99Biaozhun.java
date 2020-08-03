package chen.study.day04面向对象;

public class Demo11Student99Biaozhun {
    public static void main(String[] args) {
        Student99 stu = new Student99();
        stu.setName("鹿晗");
        stu.setAge(20);
        System.out.println("姓名："+stu.getName()+" , 年龄："+stu.getAge());
        System.out.println("=====================================");
        Student99 stu1 = new Student99("吴亦凡",22);
        stu1.setAge(25);
        System.out.println("姓名："+stu1.getName()+" , 年龄："+stu1.getAge());
    }
}
