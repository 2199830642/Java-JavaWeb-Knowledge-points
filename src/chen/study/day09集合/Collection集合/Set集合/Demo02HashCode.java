package chen.study.day09集合.Collection集合.Set集合;

/*
 *哈希值：是一个十进制的整数，由系统随机给出，其实就是对象的地址值，是一个逻辑地址，模拟出来得到的地址，不是数据实际存储的物理地址
 *在Object类中有一个方法可以获取对象的哈希值
 *  int hashCode();返回该对象的哈希码值
 *  hashCode的源码：
 *   public native int hashCode();
 *   native表示该方法调用的是本地操作系统的方法
 *
 * String类重写了hashCode方法，创建对象的返回值都是 ：96354
 * 特殊情况：
 *       "重地"和"通话"的哈希码是相等的
 * */
public class Demo02HashCode {
}
