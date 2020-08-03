package chen.study.day09集合.Collection集合.斗地主案例单列;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 斗地主综合案例
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的集合，泛型使用String
        ArrayList<String> poke = new ArrayList<>();
        //定义两个数组来组装牌，一个数组存花色，一个存序号
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大王小王存储到poke集合中
        poke.add("大王");
        poke.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for (String color : colors) {
            for (String number : numbers) {
                //System.out.println(color+number);
                //把组装好的牌加入poke集合中
                poke.add(color + number);
            }
        }
       /*遍历一下poke看牌装好了没有
        for (String poker:poke) {
            System.out.println(poker);
        }*/

        /*
         * 2.洗牌
         * 使用集合工具类Collections中的方法
         * static shuffle(list<?> list)，使用默认随机源对指定列表进行置换
         * */
        Collections.shuffle(poke);
        //遍历一下看牌是否洗均匀 
        //System.out.println(poke);

        /*
         * 3.发牌
         * 定义四个集合用来存储玩家的牌和底牌
         * */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> Dipai = new ArrayList<>();
        //遍历poke集合，获取每一张牌
        //使用poke集合的索引%3给每个玩家轮流发牌，最后剩余三张，给底牌
        for (int i = 0; i < poke.size(); i++) {
            //获取每一张牌
            String s = poke.get(i);
            if (i % 3 == 0) {
                player01.add(s);
            } else if (i % 3 == 1) {
                player02.add(s);
            } else if (i % 3 == 2) {
                player03.add(s);
            }
            if (i >= 51) {
                Dipai.add(s);
            }
        }
        System.out.println("玩家1的牌：" + player01);
        System.out.println("玩家2的牌：" + player02);
        System.out.println("玩家3的牌：" + player03);
        System.out.println("底牌：" + Dipai);
    }
}
