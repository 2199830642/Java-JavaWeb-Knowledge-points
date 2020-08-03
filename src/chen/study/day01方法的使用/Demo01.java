package chen.study.day01方法的使用;

public class Demo01 {
    public static void main(String[] args) {
        wow();
    }

    public static void wow() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
