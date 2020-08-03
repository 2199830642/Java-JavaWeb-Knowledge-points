package chen.study.day16JDBC.JDBC事务管理;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//银行转账案例展示JDBC如何管理事务
public class Demo02Practice {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 = null,ps2 = null;
        //1.获取连接
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "1nianzhijian");

            //开启事务
            conn.setAutoCommit(false);

            //2.定义sql
            //2.1 zhangsan - 500
            //2.2 lisi + 500
            String sql1 = "update account set balance =balance - ? where id = ?";
            String sql2 = "update account set balance =balance + ? where id = ?";

            //3.获取执行sql对象
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);

            //4.给？赋值
            ps1.setDouble(1,500);
            ps1.setInt(2,1);
            ps2.setDouble(1,500);
            ps2.setInt(2,2);

            //5.执行sql
            ps1.executeUpdate();
            ps2.executeUpdate();

            //提交事务
            conn.commit();
        } catch (Exception e) {
            //如果出现异常 事务回滚
            //conn有可能为null，先进行判断
            if(conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println(e);
                }
            }
            System.out.println(e);
        } finally {
            if (ps1 != null){
                try {
                    ps1.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (ps2 != null){
                try {
                    ps2.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
