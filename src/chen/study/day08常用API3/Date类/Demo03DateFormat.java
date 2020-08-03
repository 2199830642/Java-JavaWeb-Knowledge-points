package chen.study.day08常用API3.Date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.DateFormat：是日期/时间格式化子类的【抽象类】
 * 作用：
 * 格式化（也就是日期-->文本）,解析（文本-->日期）
 * 成员方法：
 * String format（Date date）按照指定的模式，把date日期格式化为符合模式的字符串
 * Date prase（String str）把符合模式的字符串解析为日期
 * DateFormat类是一个抽象类，无法直接创建对象使用，需创建子类对象
 *
 * java.text.SimpleDateFormat extends DateFormat
 *
 * 构造方法：
 * SimpleDateFormat（String pattern）
 * 参数：pattern代表指定的模式
 *     y 年，M 月，d 日，H 时，m 分，s 秒
 * eg：yyyy-MM-dd HH:mm：ss
 *    yyyy年MM月dd日 HH时mm分ss秒
 * */
public class Demo03DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    * 使用prase方法
    * */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = sdf.parse("28173812467162");
        System.out.println(parse);
    }

    /*
* 使用DateFormat类中的format方法
* 步骤：
* 创建SimpeDateFormat对象，构造方法中传递指定的模式
* 调用format方法
* */
    private static void demo01() {
        SimpleDateFormat sds = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sds.format(date);
        System.out.println(date);//Mon Apr 13 23:04:13 CST 2020
        System.out.println(d);//2020年04月13日 23时04分13秒
    }

}
