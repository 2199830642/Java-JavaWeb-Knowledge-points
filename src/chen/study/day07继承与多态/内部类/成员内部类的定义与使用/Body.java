package chen.study.day07继承与多态.内部类.成员内部类的定义与使用;

public class Body {//外

    public class heart{//成员内部类

        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+getName());
        }

    }

    //外部类的成员变量
    private String name;
    //外部类的方法
    public void method(){
        System.out.println("外部类的方法");
        heart heart = new heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
