package chen.study.自己写的小栗子;

import java.util.Scanner;

//判断一个字符串是否为回文字符串
public class Huiwen {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串进行判断");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        printStr(s, 0, length - 1);
    }

    public static void printStr(String str, int i, int j) {
        if (str.length() == 0) {
            System.out.println(str + "是回文字符串");
        }
        if (str.charAt(i) == str.charAt(j)) {
            if (i == j || j - i == 1) {
                System.out.println(str + "是回文字符串");
            } else {
                printStr(str, ++i, --j);
            }
        } else {
            System.out.println(str + "不是回文字符串");
        }
    }
}
