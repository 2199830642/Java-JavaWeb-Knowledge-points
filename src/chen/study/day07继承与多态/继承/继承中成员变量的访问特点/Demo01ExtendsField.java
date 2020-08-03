package chen.study.day07继承与多态.继承.继承中成员变量的访问特点;
/*
* 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问规则：
* 1.直接：直接通过子类对象访问成员变量
*         等号左边是谁，就优先谁，没有则向上找
* 2.间接：间接通过成员方法访问成员变量
*         该方法属于谁，就用谁的成员变量，没有则向上找
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);//25
        System.out.println(zi.numZi);//20
        System.out.println("=========================");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//优先子类 200
        //System.out.println(zi.abc);//父类子类都没有这个变量就会直接编译报错
        System.out.println("===========================");

        zi.methodZi();//200
        zi.methodFu();//100
    }
}
