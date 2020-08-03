package chen.study.day11File类和IO流.递归;

import java.util.Scanner;

/*
   使用递归求0-n的和
 */
public class Demo02Sum {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = printSum(num);
        System.out.println("和为："+i);
    }

    /*
   定义一个方法求和
     */
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }
}
