package chen.study.day07继承与多态.抽象类.发红包陈;

public class People {
    private String name;
    private int money;

    public People() {
    }

    public People(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("我是：" + name + "  我还有" + money + "元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
