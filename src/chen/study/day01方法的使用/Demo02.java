package chen.study.day01方法的使用;


public class Demo02 {
    public static void main(String[] args) {
        //单独调用
        Opps(10, 30);
        System.out.println("==========");


        //打印调用
        System.out.println(Opps(10, 20));
        System.out.println("===========");

        //复制调用
        int c = Opps(50, 20);
        System.out.println("c=" + c);
    }


    public static int Opps(int a, int b) {
        int result = a + b;
        return result;
    }
}
