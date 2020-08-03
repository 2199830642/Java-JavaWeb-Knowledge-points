package chen.study.自己写的小栗子;

public class choosePaixu {
    public static void main(String[] args) {
        int[] a = {2, 35, 56, 1, 23, 35, 2, 34, 43, 65234, 23, 4, 22};
        System.out.println("排序完成的数组：");
        for (int i = 1; i < a.length; i++) {
            int index = 0;
            for (int j = 0; j <= a.length - i; j++) {
                if (a[index] < a[j]) {
                    index = j;
                }
            }
            int temp = a[a.length - i];
            a[a.length - i] = a[index];
            a[index] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
