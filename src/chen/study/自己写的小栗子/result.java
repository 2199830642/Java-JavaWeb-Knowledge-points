package chen.study.自己写的小栗子;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长和宽的值:");
        square a = new square();
        try {
            a.setLength(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("长度输入格式错误");
            return;
        }
        try {
            a.setWigth(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("宽度输入格式错误");
            return;
        }
        System.out.println("构建了长为：" + a.getLength() + "宽为：" +
                a.getWigth() + "面积为:" + a.getArea() + "周长为:" + a.getGirth() + "的矩形");
    }

}


