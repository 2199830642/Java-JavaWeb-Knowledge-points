package chen.study.day05常用API1.ArrayList;

import java.util.ArrayList;
/*
* 如果希望往ArrayList中存储基本类型数据，那必须使用基本类型所对应的包装类
* 基本类型      包装类（引用类型，包装类都位于java.lang包下）
* byte          Byte
* short         Short
* int           Integer    【特殊】
* long          Long
* float         Float
* double        Double
* char          Character  【特殊】
* boolean       Boolean
*
* 从Jdk1.5+ ，支持自动装箱，自动拆箱
* 自动装箱：基本类型-->包装类型
* 自动拆箱：包装类型-->基本类型
* */
public class Demo11ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //错误写法！ 泛型只能是引用类型，不能是基本类型
        //ArrayList<int> listB = new ArrayList<>();

        //正确写法
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
