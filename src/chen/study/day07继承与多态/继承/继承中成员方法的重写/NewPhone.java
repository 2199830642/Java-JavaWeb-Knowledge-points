package chen.study.day07继承与多态.继承.继承中成员方法的重写;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
