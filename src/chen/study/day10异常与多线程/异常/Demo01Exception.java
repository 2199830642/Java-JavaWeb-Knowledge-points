package chen.study.day10异常与多线程.异常;

/*
*  java.lang.Throwable类是java语言中所有错误或异常的超类
*       Exception：编译期异常，进行编译（写代码）时期Java程序出现的问题
*            RunTimeException：运行期异常，就是java程序在运行过程中出现的异常
*       Error：错误
* */
public class Demo01Exception {
    public static void main(String[] args) {
        //Exception：编译期异常，进行编译（写代码）时期Java程序出现的问题
        //创建一个日期格式化的对象
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;//把字符串格式的日期转化为Date格式的日期
        try {
            date = sdf.parse("1999-1008");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("hello");//不打断程序，该输出还是可以输出*/



        //RunTimeException：运行期异常，就是java程序在运行过程中出现的异常
        /*int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsExceptions数组越界异常
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("hello");*/


        //Error：错误
        int[] arr = new int[1024*1024];//java.lang.OutOfMemoryError: Java heap space创建的数组太大了，超出了给jvm分配的内存
        System.out.println("hello");
    }
}
