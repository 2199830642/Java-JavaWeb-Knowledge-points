package chen.study.day07继承与多态.继承.继承中成员方法的重写;

public class Zi extends Fu {
    public void methodZi(){
        System.out.println("子类方法调用成功");
    }
    @Override
    public String  method(){
        System.out.println("子类方法调用成功！！！");
        return null;

    }
}
