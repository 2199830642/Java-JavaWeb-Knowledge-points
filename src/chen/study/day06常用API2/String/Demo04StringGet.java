package chen.study.day06常用API2.String;
/*
* String当中与获取相关的方法有
*
* public int length();获取字符串长度
* public String concat（String str）；将当前字符串与参数字符串拼接成为返回值
* public char charAt（int index）；    获取指定索引位置的单个字符
* public int indexOf(String str); 查找参数字符串在本字符串中首次出现的位置，如果没有，则返回-1
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "dsjhaiudhoiuasjdoijasdao".length();
        System.out.println("字符串的长度为："+length);

        //拼接字符串
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        System.out.println("=====================");

        //获取指定索引位置的字符
        char ch = "hello".charAt(2);
        System.out.println(ch);

        //查找参数字符串在本字符串中首次出现的位置，如果没有，则返回-1
        String a = "helloworld";
        int b = a.indexOf("e");
        System.out.println(b);

    }
}
