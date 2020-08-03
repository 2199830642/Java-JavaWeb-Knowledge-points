package chen.study.day05常用API1.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
* 用一个大集合存入20个随机数字，然后筛选其中的偶数元素存入小集合
* 要求使用自定义的方法来实现筛选
* */
public class Demo15ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(50);
            list.add(num);
        }
        System.out.println("list里的值是"+list);
        System.out.println("===============================");
        ArrayList<Integer> smallList = getSmallList(list);
        System.out.println("smallList的值为："+smallList);
    }

    public static ArrayList<Integer>  getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                arr.add(list.get(i));
            }
        }
        return arr;
    }
}
