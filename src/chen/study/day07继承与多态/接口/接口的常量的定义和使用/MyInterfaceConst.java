package chen.study.day07继承与多态.接口.接口的常量的定义和使用;
/*
* 接口当中也可以定义成员变量 ，但是必须使用public static final三个关键字进行修饰
* 从效果上看，这就是接口的常量
* 格式：
* public static final 数据类型 常量名称 = 数据值
* 备注;
* 一旦使用final关键字进行修饰，说明不可以改变
*
*
* 注意事项：
* 1.接口当中的常量可以省略public static final。注意：不写也是这样
* 2.接口当中的常量必须进行赋值
* 3.接口中的常量的名称使用完全大写的字母，而且用下划线进行分隔，这是推荐的命名规则
* */
public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM_OF_MYCLASS = 10;
}
