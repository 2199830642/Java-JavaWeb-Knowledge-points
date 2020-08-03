package chen.study.day10异常与多线程.异常;

import com.sun.deploy.association.RegisterFailedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
* 要求：模拟注册操作，如果用户名已经存在，则抛出异常并提示：亲，该用户名已被注册
*
* 分析：
*    1.使用集合保存已经注册过的用户名
*    2.使用Scanner获取用户输入的注册用户名(前端)
*    3.定义一个方法，对用户输入的注册的用户名进行判断
*      用集合的contains方法
*         true：用户名已经存在，抛出RegisterException ，告知用户名已被注册
*         false：继续遍历比较
*      如果循环结束，还没有找到重复的，则提示恭喜您注册成功
* */
public class Demo08RegisterExceptionPractice {
    //创建一个成员变量
   static ArrayList<String> usernames = new ArrayList<>();

    public static void main(String[] args) /*throws Exception*/ {
        //1.使用集合保存已经注册过的用户名
        Collections.addAll(usernames,"张三","李四","王五");
        //2.使用Scanner获取用户输入的注册用户名(前端)
        System.out.println("请输入您需要注册的用户名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        judgeName(name);
    }

    //3.定义一个方法，对用户输入的注册的用户名进行判断
    public static void judgeName(String name) /*throws Exception*/ {
        if (usernames.contains(name)){
            try {
                throw new RegisterFailedException("亲，用户名已被注册");
            } catch (RegisterFailedException e) {
                System.out.println("亲，该用户名已被注册");
                return;
            }
        }
        usernames.add(name);
        System.out.println("恭喜您注册成功");
    }
}
