package chen.study.day05常用API1.Random;
/*
* 题目要求：根据int变量n的值来获取随机数字，范围是[1,n]
* */
import java.util.Random;

public class Demo06Random1DaoN {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();


        for (int i = 0; i < 10; i++) {
            int result = r.nextInt(n)+1;//本来范围是0——n-1，现在是1——n；
            System.out.println("随机数为："+result);
        }
    }
}
