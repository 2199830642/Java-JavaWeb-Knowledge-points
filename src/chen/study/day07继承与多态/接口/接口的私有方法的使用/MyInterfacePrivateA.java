package chen.study.day07继承与多态.接口.接口的私有方法的使用;


/*
 *问题描述：我们应该抽取一个公有方法，用了解决两个默认方法之间重复代码的问题
 * 但是这个共有方法，不应该让实现类来使用，应该是私有化的
 *
 * 解决方法：从java9开始，接口允许定义私有方法
 * 1.普通私有方法：解决多个代码中的重复代码问题
 * private 返回值类型 方法名称（参数列表）{
 *    方法体
 * }
 *
 * 2.静态私有方法：解决多个静态方法间的重复代码问题
 * private static 返回值类型 方法名称（参数列表）{
 *    方法体
 * }
 * */
public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
       // methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        //methodCommon();
    }

    //不是jdk9私有方法报错
     /*private void methodCommon(){
        System.out.println("aaa");
        System.out.println("bbb");
    }*/
}
