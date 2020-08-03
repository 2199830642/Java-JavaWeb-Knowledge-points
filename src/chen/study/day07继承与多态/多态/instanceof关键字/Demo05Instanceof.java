package chen.study.day07继承与多态.多态.instanceof关键字;

/*
 * 如何才能知道一个父类引用的对象本来是什么子类？
 * 格式：
 * 对象名 instanceof 类名称
 * 这将会得到一个boolean值，来判断前面的对象能不能做后面类型的实例
 *  */
public class Demo05Instanceof {

    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();//猫吃鱼
        if(ani instanceof Cat){
            Cat mimi = (Cat)ani;
            mimi.catchMouse();
        }
    }


}
