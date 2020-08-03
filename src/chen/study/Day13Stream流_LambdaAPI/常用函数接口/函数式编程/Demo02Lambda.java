package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式编程;
/*
    使用lambda优化日志案例
    lambda的特点：延迟加载
    lambda的适用前提，必须存在函数式接口
 */
public class Demo02Lambda {
    public static void showLog(int level,MessageUser mu){
        if (level==1){
            System.out.println(mu.BuilderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="Hello";
        String msg2="World";
        String msg3="JAVA";

        showLog(1,()-> msg1+msg2+msg3);
        /*
        使用lambda表达式作为参数传递，仅仅是将参数传递到showLog方法中
        只要满足条件即日志登记满足
        才会调用接口的方法
        才会进行字符串的拼接

        如果条件不满足，那么messageUser中的方法也不会执行
        所以拼接字符串的代码也不会执行，也就不会有性能浪费
         */
    }
}
