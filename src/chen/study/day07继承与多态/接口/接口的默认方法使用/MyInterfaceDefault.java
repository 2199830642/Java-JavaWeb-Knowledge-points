package chen.study.day07继承与多态.接口.接口的默认方法使用;
/*
* 从java8开始没借口允许定义默认方法
* 格式;
* public default 返回值类型 方法名称（参数列表）{
*    方法体
* }
*
* ps：接口当中的默认方法，可以解决接口升级的问题
*     默认方法会直接被实现类继承下去
*     接口的默认方法也可以被接口的实现类覆盖重写
* */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();
    //新添加了一个抽象方法
    //public abstract void methodAbs2();

    //新添加的方法改为默认方法
    public default void methodDefault(){
        //这是新添加的默认方法
        System.out.println("这是我新添加的默认方法");
    }
}
