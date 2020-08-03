package chen.study.day07继承与多态.内部类.类作为成员变量类型;

public class Demo05main {
    public static void main(String[] args) {
        //创建英雄角色
        Hero a = new Hero();
        a.setName("盖伦");
        a.setAge(20);

        //创建武器对象
        Weapen weapen = new Weapen("霜之哀伤");
        a.setWeapen(weapen);
        a.attack();


    }
}
