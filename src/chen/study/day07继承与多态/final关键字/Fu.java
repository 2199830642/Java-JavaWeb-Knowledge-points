package chen.study.day07继承与多态.final关键字;

/*
 * 当final关键字修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
 * 格式：
 * 修饰符 final 返回值类型 方法名称（参数列表）{}
 *
 * 注意：
 * 对于类，方法来说abstract关键字和final关键字不能同时使用
 * */
public class Fu {
    public final void method(){
        System.out.println("父类方法执行");
    }
}
