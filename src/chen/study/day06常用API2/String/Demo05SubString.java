package chen.study.day06常用API2.String;
/*
* 字符串的截取方法：
* public String subString（int index）；截取从参数位置一直到字符串末尾
* public String subString（int begin，int end）；截取从begin开始，end结束的内容 左闭右开区间
* */
public class Demo05SubString {
    public static void main(String[] args) {
        String str = "610324199710084123";
        String a = str.substring(6,14);
        String b = str.substring(6);
        System.out.println(a);
        System.out.println(b);

    }
}
