package chen.study.day07继承与多态.多态.笔记本USB接口案例;

//键盘就是一种USB设备
public class KeyBoards implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void qiao(){
        System.out.println("敲击键盘");
    }
}
