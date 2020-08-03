package chen.study.day08常用API3.Date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 计算一个人已经出生了多少天
 *
 * 分析：
 * 1.先用Scanner类中的next方法获取出生日期
 * 2.再使用DateFormat类中的prase方法将字符串日期转换为日期
 * 3.将日期转换为毫秒
 * 4.获取当前日期，并将其转化为毫秒值
 * 5.相减
 * 6.把毫秒的差值转化为天（S/1000/3600/24）
 * */
public class Demo04pratice {
    public static void main(String[] args) throws ParseException {
        Demo01();
    }

    private static void Demo01() throws ParseException {
        //1.先用Scanner类中的next方法获取出生日期
        System.out.println("请按照xxxx年xx月xx日的格式输入您的出生日期：");
        Scanner sc = new Scanner(System.in);
        String birth = sc.next();
        //2.再使用DateFormat类中的prase方法将字符串日期转换为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = sdf.parse(birth);
        //3.将日期转换为毫秒
        long birthtime = birthdayDate.getTime();
        //4.获取当前系统日期
        Long todaytime = new Date().getTime();
        //5.减法
        long time = todaytime - birthtime;
        //6。转化为天
        System.out.println("您已经出生："+time/1000/3600/24+"天，也就是"+time/1000/3600/24/30+"月，也就是"+time/1000/3600/24/30/12+"岁了");
    }
}
