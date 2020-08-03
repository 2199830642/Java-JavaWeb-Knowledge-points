package chen.study.day05常用API1.Random;

import java.util.Random;

/*
* Random用来产生随机数
* 1.导包：import java.util.Random;
* 2.创建：Random r = new Random(); 小括号里留空即可。
* 3.使用：
* （1）获取一个随机的int数字，int num = r.nextInt();
* （2）获取一个随机的int数字（参数代表了范围，左闭右开区间），int num = r.nextInt(3),代表[0,3);
* */
public class Demo05Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        for (int i = 0; i < 10; i++) {
            int a =r.nextInt(10);
            System.out.println("10以内的随机数是"+a);
        }
        System.out.println("随机数是："+num);
    }
}
