package chen.study.day08常用API3.Calendar类;

import java.util.Calendar;

/*
* java.util.Calendar类【抽象类】
* Calendar类无法直接创建对象使用，其中有一个静态方法getInstance()，该方法返回了一个Calendar类的子对象
* */
public class Demo01Calendar {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();//父类直接调用子类方法，多态
        System.out.println(instance);
    }

}
