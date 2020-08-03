package chen.study.day07继承与多态.抽象类.发红包陈;

import java.util.ArrayList;

public class Qunzhu extends People {
    public Qunzhu() {
    }

    public Qunzhu(String name, int money) {
        super(name, money);
    }

    //定义一个发红包的方法
    public ArrayList<Integer> sendRed(int sendmoney, int split) {
        //创建一个集合，用于存放红包
        ArrayList<Integer> arr = new ArrayList<>();
        //定义群主的总金额
        int allmoney = super.getMoney();
        //判断群主的余额能否满足发红包金额，如果不能则返回空数组，结束方法
        if (allmoney < sendmoney) {
            System.out.println("余额不足！，无法发红包，请充值");
            return arr;
        }
        //扣钱，就是发完红包后群主所剩的钱
        super.setMoney(allmoney - sendmoney);
        //定义每个红包里要装的钱
        int avgMoney = sendmoney / split;
        //如果除不尽，定义一个余数
        int lastmoney = sendmoney % split;

        //定义一个循环，往红包里塞钱，如果有余数，将余数加至最后一个红包中
        for (int i = 0; i < split - 1; i++) {
            arr.add(avgMoney);
        }
        arr.add(avgMoney + lastmoney);
        return arr;
    }
}
