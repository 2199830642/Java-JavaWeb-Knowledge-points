package chen.study.day02方法使用的简单例子;

public class demo01 {
    public static void main(String[] args) {
      opps(55,100);
      wow();
    }

    //做乘法必须要有参数
    public static int opps(int a,int b){
        int c = a*b;
        System.out.println("c="+c);
        return c;
    }

    //无参数方法，例如打印固定输出十次文本字符串
    public static void wow(){
        for(int i =0;i<10;i++){
        System.out.println("hello,world!");
        }
    }
}
