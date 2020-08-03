package chen.study.day03数组;

public class Demo06ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 1, 5, 20, 44, 3, 66, 6, 34};

        int max = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {

                if (array[i]<max) {
                    System.out.println("挑战失败，下一个");
                }
                if (array[i]>max) {
                    max = array[i];
                    System.out.println("挑战成功，目前擂主为："+max);
                    continue;
                }
                if (max == array[i]) {
                    System.out.println("打平下一个");
            }
        }
        System.out.println("比武招亲获胜者是" + max);
    }
}