package chen.study.day07继承与多态.内部类.局部内部类的定义与使用;
/*
* 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
* 只有当前所属的方法才可以使用他，出了这个方法外就不能用了
*
* 定义格式：
* 修饰符 calss 外部类名称{
*  修饰符 返回值类型 外部类方法名称(){
*       class 局部类名称(){
*       }
*    }
* }
*
* 小结一下类的权限修饰符
* public>protected>(default)>private
* 定义一个类的时候，权限修饰符规则
* 1.外部类：public/（default）
* 2.成员内部类：都可以
* 3.局部内部类：什么都不能写
* */
public class Outer {


    public void methodOuter(){

        class Inner{//局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }

}
