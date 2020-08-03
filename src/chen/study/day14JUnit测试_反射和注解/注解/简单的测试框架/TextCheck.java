package chen.study.day14JUnit测试_反射和注解.注解.简单的测试框架;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * 当主方法执行后，会自动会执行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，然后记录到文件中
 */
public class TextCheck {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        //1.创建一个计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class<? extends Calculator> cls = c.getClass();
        //3.获取所有方法
        Method[] method = cls.getMethods();
        for (Method method1 : method) {
            //4.检测是否有@Check注释
            if (method1.isAnnotationPresent(Check.class)){
                try {
                    //5.有，执行
                    method1.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常,记录到文件中
                    num++;
                    bw.write(method1.getName()+"方法出异常了!!");
                    bw.newLine();
                    bw.write("异常的名称是："+ e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是："+ e.getCause().getMessage());
                    bw.newLine();
                    bw.write("=========================");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试中一共出现了"+num+"次异常");
        bw.close();
    }
}
