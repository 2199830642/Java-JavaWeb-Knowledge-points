package chen.study.Day13Stream流_LambdaAPI.方法引用.类的构造器引用;

public class person {
    private String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
