package chen.study.day06常用API2.String;
/*
* Java.lang.String类代表字符串。
* API当中说，Java程序中所有的字符串面值（如“abc”）都作为此类的实例实现。
* 其实就是说，程序中所有的双引号字符串，其实都是String类的对象。（就算没有new）
* 字符串是常量，他们的值在创建后不可更改
* 正是因为字符串不可改变，所以字符串是可以共享使用的
* 字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组
*
* 创建字符串的常见3+1种方式：
* 三种构造方法：
* （1）public String（）；创建一个空白字符串，不含任何内容
* （2）public String（char[] array）;根据字符数组的内容，创建相应的字符串
* （3）public String（byte[] array）;根据字节数组的内容，创建相应的字符串
* 一种直接创建：
* String str =“abc”；
*
* 注意：直接写上双引号，就是字符串的对象
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串是什么:"+str1);

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C',' ','a'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串："+str3);

    }
}
