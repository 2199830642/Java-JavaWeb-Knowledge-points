package chen.study.day07继承与多态.抽象类.发红包陈;

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        //创建对象
        Qunzhu chen = new Qunzhu("小陈", 824648561);
        Qunyuan a = new Qunyuan("小a", 19812);
        Qunyuan b = new Qunyuan("小b", 9999928);
        Qunyuan c = new Qunyuan("小c", 72837);
        Qunyuan d = new Qunyuan("小d", 123123);
        Qunyuan e = new Qunyuan("小e", 22);
        Qunyuan f = new Qunyuan("小f", 256);

        chen.show();
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
        System.out.println("=======================================");

        //创建发红包的数组，以及群员调用方法
        ArrayList<Integer> redpackage = chen.sendRed(200000, 6);
        a.receiveRed(redpackage);
        b.receiveRed(redpackage);
        c.receiveRed(redpackage);
        d.receiveRed(redpackage);
        e.receiveRed(redpackage);
        f.receiveRed(redpackage);

        chen.show();
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
    }
}
