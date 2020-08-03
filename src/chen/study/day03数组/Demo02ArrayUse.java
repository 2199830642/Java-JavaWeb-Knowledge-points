package chen.study.day03数组;

/*
* s使用动态初始化数组时，其中的元素将会自动拥有一个默认值，其规则如下：
* 如果是整数类型(byte short int long)，则默认为0；
* 如果是浮点类型(double float)，则默认为0.0;
* 如果是字符类型（char），则默认为'\u0000';
* 如果是布尔类型（boolean），则默认为false;
* 如果是引用类型（String），则默认为NULL*/
public class Demo02ArrayUse {
    public static void main(String[] args) {
        //动态初始化数组的赋值
        int[] array01 = new int[3];
        System.out.println(array01);//地址内存
        System.out.println(array01[0]);//0
        System.out.println(array01[1]);//0
        System.out.println(array01[2]);//0
        System.out.println("=============");

        //将数值100交给数组中的1号元素
        array01[1]=100;
        System.out.println(array01[0]);//0
        System.out.println(array01[1]);//0
        System.out.println(array01[2]);//0
    }
}
