package chen.study.day05常用API1.ArrayList;
/*
* 生成6个1-33之间的随机整数并添加到arraylist中进行遍历输出
*
* */
import java.util.ArrayList;
import java.util.Random;

public class Demo12ArraylistRandom {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random a = new Random();
        for (int i = 0; i < 6; i++) {
            int num = a.nextInt(33)+1;
            arr.add(num);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
