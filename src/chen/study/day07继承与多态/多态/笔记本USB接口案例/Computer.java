package chen.study.day07继承与多态.多态.笔记本USB接口案例;

public class Computer {

    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void UseDevice(USB usb) {
        usb.open();//打开设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoards) {
            KeyBoards keyBoards = (KeyBoards) usb;
            keyBoards.qiao();
        }
        usb.close();//关闭设备
    }
}
