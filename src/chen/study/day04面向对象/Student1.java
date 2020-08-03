package chen.study.day04面向对象;

/*
 * 构造方法：是专门用来创建对象的方法，当我们通过一个关键字new来创建对象时，实际上就是在调用构造方法
 * 格式：
 * public 类名称（参数类型 参数名称）{
 *       方法体
 * }
 *注意！！！构造方法必须与所在类名称一摸一样，大小写也一样
 * 构造名称不写返回值类型，连void都不写。
 * 构造方法中不能return一个返回值
 * 如果没有编写任何构造方法，编译器将默认赠送一个构造方法，没有参数，方法体什么都不做 public student（）{}。
 * 一旦编写了至少一个构造方法，那么编译器将不再赠送
 * 构造方法也是可以进行重载的
 *方法名称相同，参数列表不同。
 * */
public class Student1 {
    private String name;
    private int age;

    //构造无参
    public Student1() {
        System.out.println("调用无参构造方法成功");
    }

    //构造有参(可以直接给private的变量赋值，可代替setter方法，但是set方法可以改变数据)
    public Student1(String name, int age) {
        System.out.println("构造有参方法成功");
        this.name = name;
        this.age = age;
    }

    //setter，getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
