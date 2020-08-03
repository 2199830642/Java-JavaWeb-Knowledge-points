package chen.study.Day13Stream流_LambdaAPI.方法引用.方法引用基本介绍;

public class Demo01Printable {
    //定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable pa){
        pa.print("helloWorld");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数是一个函数式接口
        printString(s-> System.out.println(s));//helloWorld

        /*
        分析：
            lambda表达式的目的，打印参数传递的字符串
            把参数s传递给了System.out对象，然后对象调用了println方法对字符串进行了输出
            注意：
                1.System,out对象是已经存在了
                2.print方法也已经存在了
             所以我们可以使用方法引用来优化lambda表达式
             双冒号：：为引用运算符，它的表达式被称作方法引用
         */
        printString(System.out::println);////helloWorld
    }
}
