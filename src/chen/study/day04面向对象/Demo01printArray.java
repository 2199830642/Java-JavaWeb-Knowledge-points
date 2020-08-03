package chen.study.day04面向对象;

import java.util.Arrays;

public class Demo01printArray {
    public static void main(String[] args) {
        int[] array ={0,1,2,3,4,5};

        //要求打印格式为[0, 1, 2, 3, 4, 5]
        //先用面向过程的方法
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.print(array[i]+"]\n");
            }else{
                System.out.print(array[i]+", ");
            }
        }

        System.out.println("==============================");
        //使用面向对象的方法
        System.out.println(Arrays.toString(array));
    }
}
