package chen.study.day03数组;
/*
* 数组可以作为方法的参数
* 当调用方法的时候，向方法的小括号中传参，传输的其实是数组的地址值*/
public class Demo08ArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arrayPrint(arr);
    }

    public static void arrayPrint(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
