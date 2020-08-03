package chen.study.Day13Stream流_LambdaAPI.方法引用.通过super引用父类成员方法;

public class Zi extends Fu {
    //重写父类sayHello的方法

    @Override
    public void sayHello() {
        System.out.println("你好，我是你儿子");
    }

    public void method(GreetAble ga){
        ga.greet();
    }

    public void show(){
        /*greet(()->
        {
            Fu fu = new Fu();
            fu.sayHello();
        });*/
        //优化
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Zi().show();
    }
}
