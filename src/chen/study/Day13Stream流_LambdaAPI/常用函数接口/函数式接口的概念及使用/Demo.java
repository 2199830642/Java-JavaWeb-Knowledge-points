package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式接口的概念及使用;
/*
    函数式接口的使用，一般可以作为方法的参数和返回值类型来使用
 */
public class Demo {
    //定义一个方法，参数使用函数式接口
    public static void show(MyFunctionalInterface myInterface){
        myInterface.method();
    }

    public static void main(String[] args) {
        //使用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //匿名内部类直接调用接口
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        //使用show方法，方法参数是一个接口，所以我们使用lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口中的方法");
        });
        //简化lambda表达式
        show(()-> System.out.println("使用lambda表达式重写接口中的方法"));
    }
}
