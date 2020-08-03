package chen.study.day16JDBC.JDBC各个类详解;

import java.sql.*;

/*
    ResultSet:结果集对象，封装查询结果
        next():游标向下移动一行,游标默认在表头
        getXXX(参数):获取数据   获取的是某一行的某一列的一个数据
                xxx:指的是数据类型 如想要获得ID 那可以用getInt();
                参数：两种情况
                    Int:代表列的编号 getInt(1)获取第一列的值
                    String:代表列名称  getDouble(balance)
        使用步骤：
                1.游标向下移动一行
                2.判断是否有数据
                3.获取数据
 */
public class Demo04ResultSet {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db2", "root", "1nianzhijian");
            //3.创建执行sql语句的对象
            statement = conn.createStatement();
            //4.定义sql语句
            String sql = "select * from db2.account";
            //5.执行SQL语句
            rs = statement.executeQuery(sql);
            //6.处理结果
            //6.1 游标向下移动一行
            //rs.next();
            //6.2 获取数据
            //先判断是否有数据
            //遍历获取数据
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");

                System.out.println("序号为" + id + "的" + name + "的钱有" + balance + "元");
            }


            /*if(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");

                System.out.println("序号为" + id + "的" + name + "的钱有" + balance + "元");
            }*/
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
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
