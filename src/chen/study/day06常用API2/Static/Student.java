package chen.study.day06常用API2.Static;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idcounter = 0;//学号自动累加器

    public Student() {
        idcounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idcounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
