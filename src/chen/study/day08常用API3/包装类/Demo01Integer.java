package chen.study.day08常用API3.包装类;
/*
* 装箱：把基本类型的数据，包装到包装类中
* 拆箱：在包装类中取出基本的数据（包装类-->基本类型的数据）
* */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer a = new Integer(1);
        System.out.println(a);

        Integer b = new Integer("1");
        System.out.println(b);

        //静态方法
        Integer C = Integer.valueOf(1);
        System.out.println(C);

        Integer d = Integer.valueOf("1");
        System.out.println(d);


        //拆箱
        int i = a.intValue();
        System.out.println(i);
    }
}
