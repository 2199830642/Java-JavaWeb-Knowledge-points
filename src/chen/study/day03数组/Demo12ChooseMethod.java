package chen.study.day03数组;

public class Demo12ChooseMethod {
    public static void main(String[] args) {
        int[] array = {999, 100, 400, 7777, 5555, 2222, 3333, 6758, 6735, 7543};
        choose(array);
    }

    public static void choose(int[] array) {
        int index;
        for (int i = 1; i < array.length ; i++) {
            index = 0;
            for (int j = 0; j <= array.length - i; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
        }
        System.out.println("选择排序从大到小的结果是：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
