package chen.study.day06常用API2.String;
/*
* String中与转换的相关方法有：
* public char[] toCharArray();将当前字符串拆分为字符数组作为返回值。
* public byte[] getBytes();获得当前字符串底层的字节数据。
* public String replace（charSequence oldString，charSequence newString）；将所得出现的老字符串全部替换为新字符串
* ps:charSequence意思就是说可以接受字符串类型
* */
public class Demo06StringConvert {
    public static void main(String[] args) {
        //转化为字符数组
        char[] chars ="hello".toCharArray();
        System.out.println(chars[0]);//h

        //转化为字节数组
        byte[] a = "abc".getBytes();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        String str1 ="你好菜，你大爷的";
        String str2 = str1.replace("你大爷的","****");
        System.out.println(str2);

    }
}
