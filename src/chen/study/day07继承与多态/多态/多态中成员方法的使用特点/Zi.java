package chen.study.day07继承与多态.多态.多态中成员方法的使用特点;


public class Zi extends Fu {
    int num = 20;
    int b = 100;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodzi(){
        System.out.println("子类特有方法");
    }
}
