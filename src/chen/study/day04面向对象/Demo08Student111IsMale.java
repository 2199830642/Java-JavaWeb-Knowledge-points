package chen.study.day04面向对象;

public class Demo08Student111IsMale {

    public static void main(String[] args) {
        Student111 stu = new Student111();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名为:"+stu.getName());
        System.out.println("年龄为:"+stu.getAge());
        System.out.println("是不是爷们儿:"+stu.isMale());
    }
}
