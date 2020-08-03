package chen.study.day04面向对象;

public class Demo07PersonPrivate {

    public static void main(String[] args) {
        Person per = new Person();
        per.show();

        per.name = "张三";
       // per.age = 18;//直接访问private内容是错误写法！！
        per.setAge(20);
        per.show();
    }
}
