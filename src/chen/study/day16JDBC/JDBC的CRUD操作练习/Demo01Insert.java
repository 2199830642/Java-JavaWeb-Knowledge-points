package chen.study.day16JDBC.JDBC的CRUD操作练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    给db2的account表添加一条记录
    account表修改一条记录
    account表删除一条记录
 */
public class Demo01Insert {
    public static void main(String[] args) {
        //不这样写 finally中会找不到对象关闭
        Connection conn = null;
        Statement state = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db2", "root", "1nianzhijian");
            //3.获取执行sql的对象Statement对象
            state = conn.createStatement();
            //4.定义sql语句
            String sql = "insert into account(NAME,balance) values('wangwu',2000)";
            //5.执行sql
            int i = state.executeUpdate(sql);
            //6.处理结果
            System.out.println(i);
            if (i > 0) {
                System.out.println("添加成功");
            } else System.out.println("添加失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //避免空指针异常
            if(state!=null){
                try {
                    state.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
