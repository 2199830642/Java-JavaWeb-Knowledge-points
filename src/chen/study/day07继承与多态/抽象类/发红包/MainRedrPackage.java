package chen.study.day07继承与多态.抽象类.发红包;

import java.util.ArrayList;

public class MainRedrPackage {

    public static void main(String[] args){
        Manager manager = new Manager("群主",100);
        Member one = new Member("A",0);
        Member two = new Member("B",0);
        Member Three = new Member("C",0);

        manager.show();
        one.show();
        two.show();
        Three.show();
        System.out.println("======================");

        //群主总共发20块钱一共分三份
        ArrayList<Integer> redlist = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redlist);
        two.receive(redlist);
        Three.receive(redlist);

        manager.show();//80
        //6,6,8随机分给三个人
        one.show();
        two.show();
        Three.show();
    }
}
