package chen.study.day05常用API1.Random;

import java.util.*;

/*
 * 猜数字小游戏
 * 思路：
 * 1.产生一个随机数，一旦产生不再变化。
 * */
public class Demo07RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        for(int i = 0;i<7;i++) {
            System.out.println("请输入你猜测的数字:");
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("猜小了，再来一次");
            } else if (a < b) {
                System.out.println("猜大了，再来一次");
            } else {
                System.out.println("恭喜你猜对了！！！");
                break;
            }
            System.out.println("你还有"+(7-i)+"次机会");
            if(i>=7){
                System.out.println("次数用光，你输了");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
