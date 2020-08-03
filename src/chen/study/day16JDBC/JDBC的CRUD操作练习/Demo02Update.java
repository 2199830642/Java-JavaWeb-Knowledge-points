package chen.study.day16JDBC.JDBC的CRUD操作练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02Update {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db2", "root", "1nianzhijian");
            //3.创建执行sql语句的对象
            statement = conn.createStatement();
            //4.定义sql语句
            String sql = "update account set balance = 500 where id = 3";
            //5.执行SQL语句
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i > 0) {
                System.out.println("执行成功");
            } else System.out.println("执行失败");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
