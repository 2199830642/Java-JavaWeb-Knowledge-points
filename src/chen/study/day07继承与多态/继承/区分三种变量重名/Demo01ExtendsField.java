package chen.study.day07继承与多态.继承.区分三种变量重名;
/*
* 局部变量：  直接写变量名
* 本类的成员变量：this.成员变量名
* 父类的成员变量：super.成员变量名
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.method();
    }
}
