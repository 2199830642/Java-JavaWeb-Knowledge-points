package chen.study.day06常用API2.Math;

/*
 * 题目：计算一下-10.8到5.9之间绝对值是大于6或者小于2.1的整数有多少个
 * */
public class Demo02MathPractice {
    public static void main(String[] args) {
        int j = 0;
        for (int i = (int) Math.ceil(-10.8); i < Math.ceil(5.9); i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i + "满足条件");
                j++;
            }
        }
        System.out.println("-10.8到5.9之间绝对值是大于6或者小于2.1的整数有" + j + "个 ");
    }
}
