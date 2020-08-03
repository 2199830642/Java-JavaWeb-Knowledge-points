package chen.study.day05常用API1;

import java.util.Scanner;

/*
 *匿名对象只能使用一次
 * */
public class Demo04NiMing {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();

        //匿名对象的方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("输入的是"+num);

        //使用普通方式传递参数
        //Scanner sc = new Scanner(System.in);
        //Method(sc);

        //使用匿名对象进行传递参数
        // Method(new Scanner(System.in));


        Scanner a = MethodReturn();
        int num = a.nextInt();
        System.out.println("输入的是"+num);

    }

    public static void Method(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static Scanner MethodReturn(){
        //普通方式返回参数
        //Scanner sc = new Scanner(System.in);
        //return sc;

        //使用匿名对象做返回值
        return new Scanner(System.in);
    }
}
