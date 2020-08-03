package chen.study.day06常用API2.String;

import java.util.*;

/*
 * 题目：从键盘输入一个字符串，并且统计其中各种字符出现的次数
 * 种类有 大写字母，小写字母，数字，其他
 * */
public class Demo09StringCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' < ch && ch < 'Z') {
                countUpper++;
            } else if ('a' < ch && ch < 'z') {
                countLower++;
            } else if ('1' <= ch && ch <= '9') {
                countNum++;
            } else {
                countOther++;
            }
        }
        System.out.println("你输入的字符串中大写字母有" + countUpper + "个");
        System.out.println("你输入的字符串中小写字母有" + countLower + "个");
        System.out.println("你输入的字符串中数字有" + countNum + "个");
        System.out.println("你输入的字符串中其他字符有" + countOther + "个");
    }
}
