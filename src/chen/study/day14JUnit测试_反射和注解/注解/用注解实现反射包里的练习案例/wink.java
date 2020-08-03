package chen.study.day14JUnit测试_反射和注解.注解.用注解实现反射包里的练习案例;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  描述需要执行的类名、方法名
 */
@Target(value={ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface wink {
    String className();
    String methodName();
}
