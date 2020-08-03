package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式编程;
/*
    性能浪费的日志案例

    发现以下代码存在性能浪费的问题
    调用showLog方法，传递的第二个参数是一个拼接后的字符串
    先把字符串拼接好，然后再调用showLog方法
    showLog方法中传递的登记如果不是1
    那么就不会输出拼接后的字符串，所以字符串就白拼接了，就造成了浪费
 */
public class Demo01Logger {
    //定义一个根据日志级别显示日志信息的方法
    private static void showLog(int level,String message){
        //对日志登记进行判断，如果是1级别，那么输出日志信息
        if (level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="Hello";
        String msg2="World";
        String msg3="JAVA";

        //调用showLog方法，传递级别和信息
        showLog(1,msg1+msg2+msg3);
    }
}
