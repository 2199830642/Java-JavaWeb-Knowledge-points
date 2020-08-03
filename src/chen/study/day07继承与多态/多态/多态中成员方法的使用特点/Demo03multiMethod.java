package chen.study.day07继承与多态.多态.多态中成员方法的使用特点;
/*
* 在多态的代码中，成员方法的访问规则是：
* new的是谁就优先用谁，没有则向上找
*
* 口诀：编译看左边，运行看右边
* 对比：
* 成员变量：编译看左边，运行还看左边
* 成员方法：编译看左边，运行看右边
* */
public class Demo03multiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        int c = obj.num;
        int e = obj.a;
        System.out.println(c);
        //int d = obj.b;错误写法

    /*   对比：
* 成员变量：编译看左边，运行还看左边
  成员方法：编译看左边，运行看右边*/
        obj.method();
        obj.methodfu();
        ((Zi)obj).methodzi();
    }

}
