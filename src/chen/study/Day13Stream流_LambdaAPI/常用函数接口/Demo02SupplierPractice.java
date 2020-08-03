package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Supplier;

/*
    练习：
    求数组元素的最大值
        使用Supplier接口作为方法类型的参数，通过lambda表达式求出int数组中的最大值
 */
public class Demo02SupplierPractice {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {20,10,30,-2,99,-100,2323};
        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max<arr[i]){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
