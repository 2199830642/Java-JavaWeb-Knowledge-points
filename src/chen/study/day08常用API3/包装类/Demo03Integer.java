package chen.study.day08常用API3.包装类;

/*
 * 基本类型和字符串的相互转化：
 * 1。基本类型的值+""(空字符串)，最简单的方法（工作中常用）
 * 2。包装类的静态方法toString(参数)，不是object类的toString()
 *     static String toStirng(int i)返回一个指定整数的String对象
 * 3。String类的静态方法valueOf(参数)
 *      static String valueOf(int i)返回int参数的字符串表示形式
 *
 * 字符串转化为基本类型
 *  使用包装类的静态方法parseXX("字符串")
 *   Integer类：static int parseInt(String s)
 * */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型-->字符串
        int i = 100;
        String s = 100 + "";
        System.out.println(s + 200);//100200

        String s1 = Integer.toString(200);
        System.out.println(s1 + 200);//200200

        String s2 = String.valueOf(100);
        System.out.println(s2 + 200);//100200

        //字符串-->基本类型
        int i1 = Integer.parseInt(s);
        System.out.println(i1 - 10);//90
    }
}
