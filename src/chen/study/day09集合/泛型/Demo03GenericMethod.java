package chen.study.day09集合.泛型;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        /*
        * 调用含有泛型的方法
        * */
        gm.method01(3);
        gm.method01("abc");
        gm.method01(8.9);
        gm.method01(true);

        gm.method02("静态方法，不推荐创建对象使用");

        //静态方法，通过类名.方法名()
        GenericMethod.method02("静态方法");
    }
}
