package chen.study.day07继承与多态.内部类.局部内部类的定义与使用;

public class MyOuter {

    public void methodMyOuter() {
        int num = 10000;//这个值不可以变 ，隐含一个final
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
        MyInner myInner = new MyInner();
        myInner.methodInner();
    }
}
