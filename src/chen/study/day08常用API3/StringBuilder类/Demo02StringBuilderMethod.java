package chen.study.day08常用API3.StringBuilder类;
/*
* StringBuilder的常用方法
* append();添加任意类型的数据的字符串形式，并返回当前对象自身
*
* */
public class Demo02StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        //使用append方法向其中添加数据
        StringBuilder bu2 = bu1.append(1234);
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);

        /*
        * String和StringBuilder的相互转换
        * */
        String str = "hello";
        System.out.println("str："+str);
        StringBuilder BU = new StringBuilder(str);
        BU.append(" WORLD");
        System.out.println("BU:"+BU);
        String s = BU.toString();
        System.out.println("s："+s);
    }
}
