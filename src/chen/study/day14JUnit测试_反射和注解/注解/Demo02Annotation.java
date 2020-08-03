package chen.study.day14JUnit测试_反射和注解.注解;

/**
 * 1.JDK里预定义的一些注解
 * （1）@Override:用来检测被该注解标注的方法是否是继承自父类/接口的
 * （2）@Deprecated：该注解标注的内容已过时
 * （3）@SuppressWarnings：压制警告
 * 一般传递参数all @SuppressWarnings("all")//压制所有警告
 */
@SuppressWarnings("all")//压制所有警告
public class Demo02Annotation {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        //已过时 为什么不直接删掉show1方法呢  如果直接删掉 那做的软件可能就不兼容低版本了
    }

    @MyAnnotation(age = 12, p1 = Person.p1, strs = {"a", "b"}, ann = @MyAnnotation2)
    public void show2() {
        //替代show1
    }


}
