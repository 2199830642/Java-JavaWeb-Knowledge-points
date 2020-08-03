package chen.study.day03数组;

/*
 * 数组索引编号从0开始，一直到数组长度-1为止
 * */
public class Demo04ArrayIndex {
    public static void main(String[] args) {
        int[] array = {10, 15, 20};
        System.out.println(array[0]);//10
        System.out.println(array[1]);//15
        System.out.println(array[2]);//20

        System.out.println(array[3]);//会引发数组索引越界异常ArrayIndexOuyOfBoundsException


        /*所有的引用类型都可以赋值一个NULL，但是代表其中什么都没有
        * 数组必须进行new初始化才能使用其中的元素
        * 如果只是赋值了一个null，并未null
        * 会引发空指针异常*/
        int[] arrayA = null;
        System.out.println(arrayA[0]);//会引发NullPointerExpection
    }
}
