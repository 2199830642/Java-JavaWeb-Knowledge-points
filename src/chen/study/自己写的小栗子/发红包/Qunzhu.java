package chen.study.自己写的小栗子.发红包;

import java.util.ArrayList;

public class Qunzhu extends people {
    public Qunzhu() {
    }

    public Qunzhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendRed(int sendMoney, int spilt) {
        int myMoney = super.getMoney();
        ArrayList<Integer> list = new ArrayList<>();
        if (myMoney < sendMoney) {
            System.out.println("您的余额不足");
            return list;
        }
        super.setMoney(myMoney - sendMoney);
        int avgmoney = sendMoney / spilt;
        int lastmoney = sendMoney % spilt;
        for (int i = 0; i < spilt - 1; i++) {
            list.add(avgmoney);
        }
        list.add(avgmoney + lastmoney);
        return list;
    }
}
