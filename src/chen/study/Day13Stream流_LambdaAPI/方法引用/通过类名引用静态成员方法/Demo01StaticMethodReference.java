package chen.study.Day13Stream流_LambdaAPI.方法引用.通过类名引用静态成员方法;
/*
    通过类名引用静态成员方法
 */
public class Demo01StaticMethodReference {
    public static int method(int number,Calculate cal){
        return cal.calculateAbs(number);
    }

    public static void main(String[] args) {
        int num = method(-10, number -> Math.abs(number));
        System.out.println(num);//10

        //方法引用进行优化
        method(-10,Math::abs);//10
    }
}
