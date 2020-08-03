package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
* 计算一个字符串中的字符出现次数
*
* 分析：
* 1.使用Scanner获取输入的字符串
* 2.创建Map集合，key代表字符串的字符，value是字符的个数
* 3.遍历字符串，获取每一个字符
* 4.使用获取到的字符去Map集合判断是否存在，如果存在 value++，再使用put方法将新的value存储进去，如果字符不存在，则put进去，对应value就为1
* 5.遍历Map集合输出结果
* */
public class Demo07MapPractice {
    public static void main(String[] args) {
        //1.使用Scanner获取输入的字符串
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.创建Map集合，key代表字符串的字符，value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        //3.遍历字符串，获取每一个字符
        for (char c : ch) {
           // 4.使用获取到的字符去Map集合判断是否存在，如果存在 value++，再使用put方法将新的value存储进去，如果字符不存在，则put进去，对应value就为1
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        //5.遍历Map集合输出结果
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        System.out.println("系统自动查询后的结果是：");
        for (Map.Entry<Character, Integer> entry : set) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("字符："+key+"有"+value+"个");
        }
    }
}
