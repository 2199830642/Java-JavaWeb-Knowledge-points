package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习：集合信息筛选
    数组有多条姓名+性别的信息如下：
    String[] Array = {"迪丽热巴，女"，"古力娜扎,女"，"马尔扎哈，男"，""赵丽颖，女"}
    请通过Predicate接口的拼装将符合要求的信息存入ArrayList集合中
    1.姓名为四个字
    2.女性
 */
public class Demo08PredicatePractice {
    public static ArrayList<String> checkInformation(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] a = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = checkInformation(a,
                (s) -> s.split(",")[0].length() == 4,
                (s) -> s.split(",")[1].equals("女"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
