package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Function;

/*
    请使用Function进行函数的拼接，按照顺序需要，执行的多个函数操作为：
        String str = "赵丽颖,20";
        1.将字符串截取年龄部分得到字符串
        2.将上一步的字符串转换为int类型的数字
        3.将上一步的数字加100得到结果
 */
public class Demo10FunctionPractice {
    public static void change(String str, Function<String,Integer> fun){
        int a = fun.apply(str);
        System.out.println(a);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        change(str,
                (s)->{
            return Integer.parseInt(str.substring(4))+100;
                });
    }
}
