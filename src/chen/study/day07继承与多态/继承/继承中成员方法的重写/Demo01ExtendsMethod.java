package chen.study.day07继承与多态.继承.继承中成员方法的重写;

/*
 * 在父子类的继承关系中，创建子类对象，访问成员方法的规则：
 * 创建对象是谁，就优先用谁，如果没有则向上找
 *
 * 重写（override）也叫方法的覆盖
 * 概念：在继承关系当中，方法名称一样，参数列表也一样，
 * 特点：创建的是子类对象，则优先用子类方法
 *
 * 方法重写的注意事项：
 * 1.必须保证父子类之间方法名称相同，参数列表也相同
 * @Override：写在方法前面，用来检测是不是有效的正确覆盖重写
 * 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写
 *
 * 2.子类方法的返回值必须小于等于父类的返回值范围
 * Object类是所有类的公共最高父类 java.lang.String就是Object的子类
 *
 * 3.子类方法的权限必须大于等于父类方法的权限修饰符
 * 小扩展：public>protected>(default)>private
 * (default)不是关键字default而是什么都不写，留空
 * */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();
    }
}
