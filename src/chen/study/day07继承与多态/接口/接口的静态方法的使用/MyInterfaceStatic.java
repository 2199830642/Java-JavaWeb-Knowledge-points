package chen.study.day07继承与多态.接口.接口的静态方法的使用;
/*
* 从java8开始，接口中允许定义静态方法
* 格式：
* public static 返回值类型 方法名称（参数列表）{
*    方法体
* }
* 提示：就是将abstract或者default换成static即可
*
* 不能通过接口实现类的对象来调用接口中的静态方法
* 正确用法：通过接口名称直接调用其中的静态方法
* */
public interface MyInterfaceStatic {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
