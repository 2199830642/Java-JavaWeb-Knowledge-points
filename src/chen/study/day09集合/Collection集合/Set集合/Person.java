package chen.study.day09集合.Collection集合.Set集合;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private long IDnumber;

    public Person() {
    }

    public Person(String name, int age, long IDnum) {
        this.name = name;
        this.age = age;
        this.IDnumber = IDnum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", IDnum=" + IDnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                IDnumber == person.IDnumber &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, IDnumber);
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

    public long getIDnumber() {
        return IDnumber;
    }

    public void setIDnum(long IDnum) {
        this.IDnumber = IDnum;
    }
}
