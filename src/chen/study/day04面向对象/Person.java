package chen.study.day04面向对象;

/*
 * 问题描述：描述person的年龄时无法阻止不合理的年龄被设置
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 * 一旦使用private关键字进行修饰，那么本类中还可以随意访问
 * 但是！超出本类范围之外就不能直接访问
 * 间接访问private成员方法就是定义一对getter/setter方法
 *
 * set方法：必须有参数，无返回，参数类型必须与要set的成员变量保持一致 格式：set什么什么，什么什么的首字母必须大写
 * get方法：必须无参数，有返回值，返回值类型与成员变量对应    格式：get什么什么，什么什么的首字母必须大写
 *
 * 注意： 对于布尔类型的比如判断性别；若用private保护， 则setMale不变 getMale要变为isMale。！！！！！
 * */
public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我的名字叫:" + name + ",年龄:" + age);
    }

    //这个方法用来设置age的数据
    public void setAge(int num) {
        if (num < 100 && num >= 9 ) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    //这个方法用来私语获得age的数据
    public int getAge() {
        return age;
    }
}
