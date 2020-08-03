package chen.study.day03数组;

/*
 * 遍历数组就是对数组中每个元素进行逐一挨个处理
 * 默认的处理方式是打印输出*/
public class Demo05ArrayBianLi {
    public static void main(String[] args) {
        int[] array = new int[]{10, 15, 2, 22, 55, 33};

        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println("=====================");

        //使用循环
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================");

        //利用length方法进行循环
        for(int j = 0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}