package chen.study.自己写的小栗子.发红包;

import java.util.ArrayList;
import java.util.Random;

public class qunyuan extends people{
    public qunyuan() {
    }

    public qunyuan(String name, int money) {
        super(name, money);
    }

    public void receiveRed(ArrayList<Integer> red){
        int num = new Random().nextInt(red.size());
        Integer remove = red.remove(num);
        super.setMoney(getMoney()+remove);
    }
}
