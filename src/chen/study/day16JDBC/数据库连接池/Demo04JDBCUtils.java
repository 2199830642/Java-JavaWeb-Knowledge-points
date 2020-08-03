package chen.study.day16JDBC.数据库连接池;
/*
    定义工具类
        1.定义一个类
        2.提供静态代码块加载配置文件，初始化连接池对象
        3.提供方法：
                1.获取连接方法：通过数据库连接池获取连接
                2.释放资源
                3.获取连接池的方法
 */

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 连接池的工具类
 */
public class Demo04JDBCUtils {
    //1.定义一个成员变量
    private static DataSource ds;

    //定义一个静态代码块
    static {
        try {
            //加载配置文件
            Properties pro = new Properties();
            InputStream is = Demo04JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //获取连接对象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
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

    /**
     * 释放资源方法的重载
     * @param stmt
     * @param conn
     */
    public static void close( Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
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

    /**
     * 获取连接池的方法
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
