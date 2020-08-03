package chen.study.day06常用API2.数组工具类Arrays;

import java.util.Arrays;

/*
* 题目要求：请使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒叙打印
* */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "19828172y4jijiusiad8913yrsajhdu213";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for(int i = 0 ; i<ch.length;i++){
            System.out.print(ch[(ch.length-1)-i]);
        }

    }
}
