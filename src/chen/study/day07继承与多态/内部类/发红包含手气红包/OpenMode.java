package chen.study.day07继承与多态.内部类.发红包含手气红包;

import java.util.ArrayList;

public interface OpenMode {
    ArrayList<Integer> divide(int totalMoney, int count);
    /*
    * 请将totalmoney分为count份，保存到ArrayList<Integer>中，返回即可
    *
    * @param totalmoney    总金额数为方便计算已转化为正数，单位为分
    * @param totalcount    红包个数
    * @return  ArrayList<Integer>   元素为各个红包的金额
    * */

}
