package chen.study.day07继承与多态.多态.笔记本USB接口案例;

public class Demo06main {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();

        //打开电脑
        computer.powerOn();


        //准备一个鼠标供电脑使用
        //多态，向上转型
        USB usbmouse = new Mouse();
        computer.UseDevice(usbmouse);

        //准备一个键盘给电脑使用
        KeyBoards keyBoards = new KeyBoards();
        //方法参数是接口类型，传递进去的参数是USB类型完全可以
        computer.UseDevice(keyBoards);//正确写法!也发生了向上转型


        //关闭电脑
        computer.powerOff();
    }

}
