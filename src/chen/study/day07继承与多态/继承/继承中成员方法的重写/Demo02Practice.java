package chen.study.day07继承与多态.继承.继承中成员方法的重写;

public class Demo02Practice {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.call();
        ph.sendMessage();
        ph.show();
        System.out.println("===================");

        NewPhone p = new NewPhone();
        p.call();
        p.sendMessage();
        p.show();
    }
}
