package chen.study.day03数组;

public class Demo01Array {
    public static void main(String[] args) {
        //创建动态数组
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];

        //创建静态数组
        int[] arrayC = new int[]{5, 15, 25};
        String[] arrayD = new String[]{"hello", "world"};

        //使用静态初始化时，格式还可以省略一下
        String[] arrayE = {"hello", "world"};

        /*
        * 直接打印数组名称时，得到的是数组内存地址的哈希值*/
        System.out.println(arrayA);//[I@4554617c

        //访问数组元素的格式：
        System.out.println(arrayE[0]);//hello


        int num = arrayC[1];
        System.out.println(num);//15

    }
}
