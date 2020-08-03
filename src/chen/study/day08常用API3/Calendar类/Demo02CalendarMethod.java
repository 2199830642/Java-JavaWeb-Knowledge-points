package chen.study.day08常用API3.Calendar类;

import java.util.Calendar;
import java.util.Date;

public class Demo02CalendarMethod {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }
/*
* public date getTime();将日历转化为日期
* */
    private static void demo04() {
        Calendar instance = Calendar.getInstance();
        Date i = instance.getTime();
        System.out.println(i);//Tue Apr 14 12:26:31 CST 2020
    }

    /*
    * public abstrac void add（int field，int amount）；根据日历的规则，给指定的日期增加或减少指定的时间量
    * */
    private static void demo03() {
        Calendar b = Calendar.getInstance();

        b.add(Calendar.YEAR,80);

        int i = b.get(Calendar.YEAR);
        System.out.println(i);

        int i1 = b.get(Calendar.MONTH);
        System.out.println(i1);

        int i2 = b.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);
    }

    /*
* public void set(int field， int value)；将给定的日历字段设定为指定值
* */
    private static void demo02() {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR,9999);
        int i = a.get(Calendar.YEAR);
        System.out.println(i);

    }

    /*
     * publc int get（int field）;返回给定日历字段的值
     * 参数：传递指定的日历字段（YEAR,MONTH...）
     * 返回值：日历字段代表的具体的值
     * */
    private static void demo01() {
        //使用getInstance方法，获取Calendar对象
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        System.out.println(i);

        int i1 = c.get(Calendar.MONTH);
        System.out.println(i1);

        int i2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);

    }

}
