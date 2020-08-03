package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

public class person {
    private String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
