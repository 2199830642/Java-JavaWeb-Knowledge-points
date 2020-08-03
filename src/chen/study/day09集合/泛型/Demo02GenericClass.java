package chen.study.day09集合.泛型;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("张三");
        Object obj = gc.getName();
        System.out.println(obj);

        //写泛型，使用Integer
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(222);
        Integer in = gc1.getName();
        System.out.println(in);
    }
}
