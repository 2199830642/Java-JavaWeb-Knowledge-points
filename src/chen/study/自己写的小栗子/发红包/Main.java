package chen.study.自己写的小栗子.发红包;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Qunzhu qunzhu = new Qunzhu("小陈",200);
        qunyuan player01 = new qunyuan("张三",20);
        qunyuan player02 = new qunyuan("张三",20);
        qunyuan player03 = new qunyuan("张三",20);

        qunzhu.show();
        player01.show();
        player02.show();
        player03.show();
        System.out.println("================");
        ArrayList<Integer> red = qunzhu.sendRed(100,3);

        player01.receiveRed(red);
        player02.receiveRed(red);
        player03.receiveRed(red);
        qunzhu.show();
        player01.show();
        player02.show();
        player03.show();

    }
}
