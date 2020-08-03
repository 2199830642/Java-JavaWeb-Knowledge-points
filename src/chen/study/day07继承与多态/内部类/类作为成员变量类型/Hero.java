package chen.study.day07继承与多态.内部类.类作为成员变量类型;

//英雄角色类
public class Hero {
    private String name;//英雄名字
    private int age;//年龄
    private Weapen weapen;//武器

    public Hero() {
    }
    public void attack(){
        System.out.println(age+"岁的"+name+"拿着"+weapen.getCode()+"打人啦");
    }

    public Hero(String name, int age, Weapen weapen) {
        this.name = name;
        this.age = age;
        this.weapen = weapen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapen getWeapen() {
        return weapen;
    }

    public void setWeapen(Weapen weapen) {
        this.weapen = weapen;
    }
}
