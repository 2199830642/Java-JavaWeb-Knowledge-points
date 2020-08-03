package chen.study.day07继承与多态.继承.区分三种变量重名;

public class Zi extends Fu {

    int num = 20;
    public void method(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类的成员变量
    }
}
