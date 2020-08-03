package chen.study.day06常用API2.String;
/*
* 字符串常量池：程序当中直接写上双引号的字符串，就在字符串常量池中，new的不在池中直接就在堆里
*
* 对于基本类型 == 是数值的比较，
* 对于引用类型 == 是对地址值的比较
* */
public class Demo02Stringpool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str2);//false
    }
}
