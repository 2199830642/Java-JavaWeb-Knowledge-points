package chen.study.day07继承与多态.内部类.发红包含手气红包;
/*
* 案例分析：
*     红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己
*
* 1。普通红包（平均）：totalmoney/totalcount 余数放在最后一个红包
* 2。手气红包（随机）：最少1分钱，最多不超过平均数的二倍
* */
public class BootStrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("小陈的手气红包案例");
    }
}
