package chen.study.day07继承与多态.内部类.匿名内部类的定义与使用;

/*
 * 如果接口的实现类，或者父类的子类只需要使用一次
 * 那么这种情况下，就可以省略掉该类的定义，而改为使用【匿名内部类】
 *
 * 匿名内部类的格式：
 * 接口名称 对象名 = new 接口名称(){
 *    //覆盖重写接口中的各种抽象方法
 * }
 *
 * 对格式 "接口名称(){...}"进行解析：
 * 1。new代表创建对象的动作
 * 2。接口名称就是匿名内部类需要实现那个接口
 * 3。{...}这才是匿名内部类的内容
 *
 * 注意：
 * 1。匿名内部类在创建对象的时候只能使用唯一一次
 * 2。匿名内部类是省略了【实现类/子类】，匿名对象是省略了【对象名称】
 * */
public class Demo04main {

    public static void main(String[] args) {
        //MyInterFaceIMPL myInterFaceIMPL = new MyInterFaceIMPL();
        //myInterFaceIMPL.method();

        MyInterFace obj = new MyInterFace() {
            @Override
            public void method2() {
                System.out.println("第二个方法也被重新成功");
            }

            @Override
            public void method1() {
                System.out.println("匿名内部类使用成功");
            }
        };
        obj.method1();
        obj.method2();
        System.out.println("==============");

        new MyInterFace() {
            @Override
            public void method2() {
                System.out.println("第二个方法也被重新成功");
            }

            @Override
            public void method1() {
                System.out.println("匿名内部类使用成功LALALAALALLA");
            }
        }.method1();
    }

}
