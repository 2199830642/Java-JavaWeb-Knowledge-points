package chen.study.Day13Stream流_LambdaAPI.方法引用.类的构造器引用;

public class Demo01 {
    public static void printName(String name,PeopleAble pa){
        person person = pa.peopleName(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //printName("张三",(s)->new person(s));//张三
        //优化
        printName("李四",person::new);
    }
}
