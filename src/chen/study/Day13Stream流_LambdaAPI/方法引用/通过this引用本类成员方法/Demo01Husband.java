package chen.study.Day13Stream流_LambdaAPI.方法引用.通过this引用本类成员方法;
/*
    通过this调用本类的成员方法
 */
public class Demo01Husband {
    //定义一个买房子的方法
    public  void buyHouse(){
        System.out.println("北京买一套四合院");
    }
    //定义一个结婚的方法，参数传递接口
    public  void Marry(RichAble r){
        r.buy();
    }
    //定义一个非常高兴地方法
    public  void soHappy(){
        //Marry(()->this.buyHouse());
        //优化
        Marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Demo01Husband().soHappy();
    }
}
