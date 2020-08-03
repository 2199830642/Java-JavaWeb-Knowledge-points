package chen.study.day02方法使用的简单例子;

/*
题目要求：定义一个方法，用来求出两数字之和。（有返回值）
题目变形：定义一个方法，用来打印两数字之和。（无返回值）
 */
public class demo02MethodReturn {
    public static void main(String[] args) {
        int num = opps(10, 20);
        System.out.println("num=" + num);
        System.out.println("===========");
        wow(20, 40);

    }

    //我是一个方法，有返回值，谁调用，我就把值返回给谁。
    public static int opps(int a, int b) {
        int c = a + b;
        return c;
    }

    //我的返回值类型为void ， 所以我只自己知道我的计算结果
    public static void wow(int d, int e) {
        int f = d + e;
        System.out.println("f=" + f);
    }
}

