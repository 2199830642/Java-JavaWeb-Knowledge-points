package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Consumer;

/*
    练习：
        字符串数组中存储多条信息，请按照格式"姓名：xx,性别：xx。"的格式打印出来
        要求将打印姓名的动作作为第一个Consumer接口的lambda实例
        打印性别的动作作为第二个Consumer接口的lambda实例
        再将其拼接在一起
 */
public class Demo05ConsumerPractice {
    public static void printfInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] a = {"古力娜扎，女", "迪丽热巴，女", "马尔扎哈，男"};
        printfInfo(a,
                (s) -> {
                    String name = s.split("，")[0];
                    System.out.print("姓名：" + name + ",");
                },
                (s) -> {
                    String sex = s.split("，")[1];
                    System.out.println("性别:" + sex + "。");
                });
    }
}
