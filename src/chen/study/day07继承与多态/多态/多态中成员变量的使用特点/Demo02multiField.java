package chen.study.day07继承与多态.多态.多态中成员变量的使用特点;

public class Demo02multiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//10
        System.out.println(((Zi) obj).num);//20
        System.out.println("==========================");
        obj.showNum();//如果子类对父类方法重写，结果就是子 20
                      //如果没有重新，结果就是父
    }
}
