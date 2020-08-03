package chen.study.day07继承与多态.final关键字;
/*
 * final代表最终的，不可改变的，
 *
 * 常见的四种用法：
 * 1.用来修饰类
 * 2.修饰方法
 * 3.修饰局部变量
 * 4.修饰成员变量
 * */

public class Demo01final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        num1 = 20;
        System.out.println(num1);//20

        //这个变量无法进行更改，一次赋值终生不变
        final int num2 = 200;
        System.out.println(num2);
        //错误写法，不能改变
        // num2 = 100;

        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 300;

        //对于基本类型来说，不可变说的是变量当中的数值不可改变
        //对于引用类型来水，不可变说的是变量当中的地址值不可变
    }
}
