package chen.study.day07继承与多态.抽象类.发红包;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //从多个红包中，随机抽取一个给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());//运用匿名对象的方法
        //根据索引，从集合当中删除，并且得到被删除的红包给自己
        int remove = list.remove(index);
        // 当前成员自己本来的钱
        int num = super.getMoney();
        //收红包
        super.setMoney(num + remove);

    }
}