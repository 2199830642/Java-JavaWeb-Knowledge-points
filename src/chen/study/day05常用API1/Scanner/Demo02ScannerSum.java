package chen.study.day05常用API1.Scanner;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        System.out.println("请输入要求和的两个数字");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("你所选的两数字之和为："+sum);
    }
}
