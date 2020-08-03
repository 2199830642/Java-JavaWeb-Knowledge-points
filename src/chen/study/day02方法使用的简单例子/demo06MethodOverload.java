package chen.study.day02方法使用的简单例子;

/*定义一个方法判断两个数据是否相等
 * 参数类型分别为两个byte型，两个double型，两个long型，两个xint型*/
public class demo06MethodOverload {
    public static void main(String[] args) {
        System.out.println(isEqual(10,9.1));
        System.out.println(isEqual(1,1));
    }

    public static boolean isEqual(byte a, byte b) {
        boolean equal = a == b ? true : false;
        return equal;
    }

    public static boolean isEqual(double a,double b){
        boolean equal = a == b ? true : false;
        return equal;
    }
    public static boolean isEqual(int a,double b){
        boolean equal = a == b ? true : false;
        return equal;
    }
    public static boolean isEqual(int a,int b){
        boolean equal = a == b ? true : false;
        return equal;
    }
}
