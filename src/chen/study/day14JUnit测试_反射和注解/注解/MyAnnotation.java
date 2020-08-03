package chen.study.day14JUnit测试_反射和注解.注解;

public @interface MyAnnotation {
    int age();
    Person p1();
    String[] strs();
    MyAnnotation2 ann();
}
