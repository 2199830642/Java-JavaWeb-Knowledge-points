package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Predicate;

/*
    逻辑表达式：可以连接多个判断的条件
    &&：与运算符，有false则false
    ||：或运算符，有true则true
    ！：取反，非真则假，非假则真
 */
public class Demo07Predicate_and {
    //且
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return  pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String str = "helloWorld";
        boolean a = checkString(str,
                (s) -> s.length() > 5,
                (s -> s.contains("a"))
        );
        System.out.println(a);//false
    }
}
