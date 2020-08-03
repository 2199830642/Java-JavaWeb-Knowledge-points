package chen.study.day03数组;

public class Demo11Choose {
    public static void main(String[] args) {
        int index;
        System.out.println("选择排序的结果是：");
        int[] a = {2,6,1,2,9,7,10,66,99,13,45,23,51};
        for (int i =1;i<a.length;i++){
            index = 0;
            for(int j = 1;j<=a.length-i;j++){
                if(a[index]<a[j]){
                    index = j;
                }
            }
            int temp = a[a.length-i];
            a[a.length-i] = a[index];
            a[index] = temp;
        }
        for (int k = 0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
