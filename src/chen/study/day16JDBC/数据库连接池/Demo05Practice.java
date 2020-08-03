package chen.study.day16JDBC.数据库连接池;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    使用新的工具类
 */
public class Demo05Practice {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        //完成添加操作
        //1.获取连接
        try {
            conn = Demo04JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取执行对象
            ps = conn.prepareStatement(sql);
            //4.给？赋值
            ps.setString(1,"赵六");
            ps.setDouble(2,5000);
            //5.执行sql
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            Demo04JDBCUtils.close(ps,conn);
        }
    }
}
