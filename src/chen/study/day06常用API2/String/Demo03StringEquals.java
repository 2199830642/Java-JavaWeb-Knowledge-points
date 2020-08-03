package chen.study.day06常用API2.String;
/*
* ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
* 1.public boolean equals（Object obj），参数可以是任何对象,只有参数是一个字符串并且内容相同，才会给true，否则是false
* ps：任何对象都可以用Object进行接收,
*注意，如果是一个常量与一个变量比较，建议"abc".equals(str),不推荐str.equals("abc")
*
* 2.public boolean equalsIgnorecase(String str);忽略大小写，进行内容的比较
* */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));

        String str4 ="abc";//如果str4=null，那么第一种方法结果为false，第二种方法会报错，空指针异常，NullPointException
        System.out.println("abc".equals(str4));
        System.out.println(str4.equals("abc"));

        String stra="java";
        String strb = "JAVA";
        System.out.println(stra.equals(strb));
        System.out.println(stra.equalsIgnoreCase(strb));
    }
}
