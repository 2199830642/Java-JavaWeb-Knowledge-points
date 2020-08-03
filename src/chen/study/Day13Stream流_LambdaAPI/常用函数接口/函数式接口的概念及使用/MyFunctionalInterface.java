package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式接口的概念及使用;
/*
    函数式接口：有且只有一个抽象方法的接口
    当然接口中可以包含其他方法（静态，私有，默认）

    @FunctionalInterface注解
    作用：检测接口是否为一个函数式接口
        是：编译成功
        否：编译失败（没有或者抽象方法多于1个也报错）
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}
