package chen.study.day14JUnit测试_反射和注解.反射;

public class Person {
    private String name;
    private int age;
    public String a;
    public String b;
    public String c;
    public String d;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("吃饭饭");
    }
    public void eat2(String food){
        System.out.println("eat..."+food);
    }
}
