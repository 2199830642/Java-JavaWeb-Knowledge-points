package chen.study.day16JDBC.JDBC登录案例练习;

import java.sql.*;
import java.util.Scanner;

public class Demo02登录案例优化 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        boolean a =  new Demo02登录案例优化().login(username, password);
        if (a==true){
            System.out.println("登陆成功！");
        }else System.out.println("账号或密码错误");
    }

    /*
        方法体
     */
    public boolean login(String username,String password){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (username==null||password==null){
            return false;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "1nianzhijian");
            String sql = "Select * from user where username = ? and password = ?";
            ps = conn.prepareStatement(sql);
            //给？代表的占位符赋值
            ps.setNString(1,username);
            ps.setNString(2,password);
            rs = ps.executeQuery();
            return rs.next();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
