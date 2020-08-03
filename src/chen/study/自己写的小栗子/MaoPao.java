package chen.study.自己写的小栗子;

public class MaoPao {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 712, 35, 6633, 357, 8};
        demo01(a);
    }

    private static void demo01(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int s : a) {
            System.out.print(s+" ");
        }
    }
}
