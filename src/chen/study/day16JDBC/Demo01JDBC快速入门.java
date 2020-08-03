package chen.study.day16JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    今日内容：
        1.JDBC基本概念
        2.快速入门
        3.对JDBC中各个接口和类详解
            1.DriverManager：驱动管理对象
            2.Connection：数据库连接对象
            3.Statement：执行sql的对象
            4.ResultSet：结果集对象
            5.PreparedStatement：执行sql的对象

    JDBC：
        1.概念：Java DataBase Connectivity  Java语言操作数据库
        JDBC的本质： sun公司的程序员写了一套适用于操作所有关系型数据库的规范（接口），
                    各个数据库产品的厂商写好了实现类，即提供了数据库驱动jar包，
                    我们只需要使用这套接口（JDBC）编程，真正执行的代码是驱动jar包中的实现类

        2.快速入门：
                    步骤：
                         1.导入驱动jar包
                            1.复制jar包到项目的libs目录下
                            2.add as library  右键libs文件夹 然后 add as library(添加为库)
                         2.注册驱动
                         3.获取数据库连接对象 Connection
                         4.定义SQL
                         5.获取执行SQL语句的对象 Statement
                         6.执行SQL，接收返回的结果
                         7.处理结果
                         8.释放资源
 */
public class Demo01JDBC快速入门 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动 即 用class类加载进内存  jar包5以后 可以不用注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "1nianzhijian");
        //4.定义一个sql语句
        String sql = "update account set balance = 500 where id =1";
        //5.获取执行sql的对象 statement
        Statement state = conn.createStatement();
        //6.执行sql
        int count = state.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        state.close();
        conn.close();
    }
}
