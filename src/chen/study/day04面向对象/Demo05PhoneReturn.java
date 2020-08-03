package chen.study.day04面向对象;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getphone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);
        System.out.println(two);
    }

    public static Phone getphone() {
        Phone one = new Phone();
        one.color = "玫瑰金";
        one.price = 9999.2;
        one.brand = "iphone";
        return one;
    }
}
