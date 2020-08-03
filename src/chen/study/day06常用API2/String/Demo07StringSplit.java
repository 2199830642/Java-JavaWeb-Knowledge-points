package chen.study.day06常用API2.String;
/*
* 分割字符串的方法：
* public String[] split(String regex);按照参数的规则将字符串分割成若干部分
*
* 注意事项：
* split方法的参数其实是一个正则表达式（今后学习）
* 今天注意：如果要按照.进行切分那必须写成"\\."
* */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] a = str.split(",");
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("===============");

        String str1 = "192.169.20.0";
        String[] b = str1.split(".");
        System.out.println(b.length);//0
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);//无值
        }
        String[] c = str1.split("\\.");
        System.out.println(c.length);//4
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
