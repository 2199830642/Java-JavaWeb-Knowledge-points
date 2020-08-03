package chen.study.day07继承与多态.继承.继承中构造方法的访问特点;

public class Zi extends Fu {
    public Zi(){
//        super();//调用父类无参构造方法
        super(10);//调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }
    public void method(){
//        super();//错误，只有子类构造方法才能调用父类构造方法
    }
}
