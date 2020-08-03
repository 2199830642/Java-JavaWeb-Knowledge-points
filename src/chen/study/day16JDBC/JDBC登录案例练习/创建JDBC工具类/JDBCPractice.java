package chen.study.day16JDBC.JDBC登录案例练习.创建JDBC工具类;

import java.sql.*;
import java.util.Scanner;

/*
    需求：
        通过键盘录入用户名和密码
        判断用户是否登陆成功
        如果成功则提示登陆成功，失败则提示失败

    步骤：1.创建一个user表
         2.创建一个类
 */
@SuppressWarnings("all")
public class JDBCPractice {

    /*
        主方法
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String username = sc.nextLine();
        System.out.println("请输入你的密码");
        String password = sc.nextLine();

        boolean b = new JDBCPractice().login(username, password);
        if (b == true){
            System.out.println("登陆成功");
        }else System.out.println("登录失败");
    }

    /*
        登录方法
     */
    public boolean login(String username, String password) {
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }
        //连接数据库
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "1nianzhijian");
            state = conn.createStatement();
            rs = state.executeQuery("select * from user where username = '"+username+"' and password ='"+password+"'");
            //如果下一行有值 则说明登陆成功

            /*if(rs.next()){
                System.out.println("yes");
            }else System.out.println("no");*/
            return rs.next();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
        return false;
    }
}
