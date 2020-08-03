package chen.study.day10异常与多线程.Lambda表达式;
//无参数无返回值的
public class Demo02LambdaCook {
    public static void main(String[] args) {
        invokeCook(new cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        invokeCook(()->{
            System.out.println("吃饭啦");
        });
    }

    public static void invokeCook(cook cook){
        cook.makeFood();
    }
}
