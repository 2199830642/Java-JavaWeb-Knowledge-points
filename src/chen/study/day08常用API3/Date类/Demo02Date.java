package chen.study.day08常用API3.Date类;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
/*
* 获取当前时间到1970年1月1日00：00：00（英国格林威治时间）经历了多少毫秒
* */
    private static void demo03() {
        Date date3 = new Date();
        long time = date3.getTime();
        System.out.println(time);//1586788263485
    }

    /*
* Date类的带参数方法
* Date(long date)：传递毫秒值，把毫秒转化为日期
* */
    private static void demo02() {
        Date date1 = new Date(0l);
        Date date2 = new Date(1586787958562l);
        System.out.println(date1);//Thu Jan 01 08:00:00 CST 1970
        System.out.println(date2);//Mon Apr 13 22:27:35 CST 2020
    }

    /*
* Date类的空参数构造方法
* Date()获取当前系统的日期时间
* */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date.toString());//Mon Apr 13 22:24:46 CST 2020
    }

}
