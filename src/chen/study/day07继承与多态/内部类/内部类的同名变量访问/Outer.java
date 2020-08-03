package chen.study.day07继承与多态.内部类.内部类的同名变量访问;
/*
* 如果出现了重名现象
* 外部类成员变量.this.成员变量名
* */
public class Outer {

    int num = 10;//外部类的成员变量

    public class inner{

        int num = 20; //内部类的成员变量

        public void methodInner(){
            int num =30;//内部类方法的局部变量
            System.out.println(num);//局部变量 30 就近原则
            System.out.println(this.num);//内部类的成员变量 20
            System.out.println(Outer.this.num);//外部类的成员变量 10
        }

    }
}
