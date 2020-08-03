package chen.study.day05常用API1.ArrayList;

import java.util.ArrayList;

/*定义以指定格式打印集合的方法（Arraylist 为参数），使用{}括起集合，使用@分隔每个元素类似于{1@2@3}
* */
public class Demo14ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.println(list);

        ArrayListPrint(list);
    }
    /*
    * 定义方法的三要素：
    * 返回值类型：只是进行打印而已，不需要返回值，所以用void
    * 方法名称：ArrayListPrint
    * 参数列表（Arraylist list）
    * */
    public static void ArrayListPrint(ArrayList<Character> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(i==list.size()-1){
                System.out.print(num+"}");
            }else{
                System.out.print(num+"@");
            }
        }
    }
}
