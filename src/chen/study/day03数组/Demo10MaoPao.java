package chen.study.day03数组;

/*从大到小的冒泡排序*/
public class Demo10MaoPao {
    public static void main(String[] args) {
        System.out.println("数组从大到小的排序为");
        int[] array = {5, 4, 7, 9, 2, 3, 6, 1, 10, 2, 45, 99};
        maoPao(array);
    }

    public static void maoPao(int[] array) {
        int temp;
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1 - k; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
