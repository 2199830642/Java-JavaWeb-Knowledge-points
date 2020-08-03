package chen.study.day14JUnit测试_反射和注解.注解;

import java.lang.annotation.*;

/*
               元注解：用于描述注解的注解
                    @Target:描述注解能够作用的位置
                    @Retention：描述注解被保留的阶段：源码，class，RunTime三个阶段
                    @Documented：描述注解是否被抽取到API文档中
                    @Inherited：描述注解是否被子类继承
 */
@Target(value={ElementType.TYPE,ElementType.METHOD})//表示MyAnnotation3这个注解只能作用域类上
@Retention(RetentionPolicy.RUNTIME)//表示当前这个注解注解的那个类时，那个类在运行期时，jvm虚拟机会读取到这个注解
@Documented//表示当前这个注解是否可以一起出现在API文档中
@Inherited//表示这个注解会自动被子类继承
public @interface MyAnnotation3 {
}
