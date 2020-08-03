package chen.study.Day13Stream流_LambdaAPI.方法引用.通过类名引用静态成员方法;

@FunctionalInterface
public interface Calculate {
    //定义一个抽象方法 ，传递一个整数，对整数进行绝对值计算并返回
    public abstract int calculateAbs(int number);
}
