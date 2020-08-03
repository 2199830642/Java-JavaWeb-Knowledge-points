package chen.study.day07继承与多态.抽象类.发红包陈;

import java.util.ArrayList;
import java.util.Random;

public class Qunyuan extends People {
    public Qunyuan() {
    }

    public Qunyuan(String name, int money) {
        super(name, money);
    }

    //定义一个收红包的方法
    public void receiveRed(ArrayList<Integer> list) {
        //如何获得一个随机红包，创建一个数组随机生成的指针，使用random的匿名方法
        int index = new Random().nextInt(list.size());
        //然后从数组里移除这个红包,查看这个红包的金额
        Integer remove = list.remove(index);
        //群员自己本来的钱
        int num = super.getMoney();
        //获得这个红包里的钱，并加入余额
        super.setMoney(num + remove);
    }
}
