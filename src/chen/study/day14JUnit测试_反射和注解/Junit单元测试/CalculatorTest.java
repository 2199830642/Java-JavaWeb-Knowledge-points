package chen.study.day14JUnit测试_反射和注解.Junit单元测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
    测试：
        1.黑盒测试：不需要写代码，只需要输入值，看系统能否输出期望值

        2.白盒测试：需要去写代码，看代码具体的执行流程（更有含量）

    Junit使用步骤(白盒测试)：
        1.定义一个测试类，
            建议：
            类名为被测试的类名加text
            包名：最后放在一个text包中
        2.定义测试方法：可以独立运行
            建议：
            方法名：text_测试的方法名：textAdd()
            返回值：void
            参数列表：空餐
        3.给方法加@Text
        4.导入Junit依赖环境
 */
public class CalculatorTest {
    /*
    初始化方法
    用于资源申请，所有测试方法在执行前都会执行此方法
    只需要加一个@Before
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /*
        释放资源方法
        在所有测试方法执行完后都会执行的方法
        只需要加一个@After
     */
    @After
    public void end(){
        System.out.println("end...");
    }

    /*
        测试add方法
     */
    @Test
    public void textAdd(){
        //System.out.println("我被执行了");
        Calculator c = new Calculator();
        int sum = c.sum(6, 10);
        /*System.out.println(sum);
            一般在测试类里是不会去输出的

            3.断言 我断言这个结果是16
         */
        Assert.assertEquals(16,sum);
    }

    @Test
    public void testSub(){
        Calculator c= new Calculator();
        int sub = c.sub(10, 4);
        Assert.assertEquals(6,sub);
    }
}
