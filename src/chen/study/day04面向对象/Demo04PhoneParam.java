package chen.study.day04面向对象;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "华为";
        one.price = 10000.1;
        one.color = "黑色";
        Method(one);
    }

    public static void Method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param);
    }
}
