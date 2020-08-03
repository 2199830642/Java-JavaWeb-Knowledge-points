package chen.study.自己写的小栗子.发红包;

public class people {
    private String name;
    private int money;

    public void show() {
        System.out.println("我是：" + name + "，我现在有：" + money + "元");
    }

    public people() {
    }

    public people(String name, int money) {
        this.name = name;
        this.money = money;
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
