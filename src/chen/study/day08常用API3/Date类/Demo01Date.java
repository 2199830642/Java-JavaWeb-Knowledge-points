package chen.study.day08常用API3.Date类;

/*
 * java.util.Date表示日期和时间类
 * 类Date表示特定的瞬间，精确到毫秒
 * 毫秒值的作用：可以对日期和时间进行计算
 * 2019-05-28到2099-05-28一共有多少天，结果值为毫秒
 *
 * 毫秒如何转化为日期
 * 1天= 24*60*60=86400秒*1000=86400000毫秒
 * 注意：
 * 中国属于东八区，会把时间增加八个小时
 * */
public class Demo01Date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间到1970年1月1日00：00：00（英国格林威治时间）经历了多少毫秒
        //1586787958562
    }

}
