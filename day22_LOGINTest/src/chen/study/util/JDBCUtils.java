package chen.study.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类
 * 使用Druid数据库连接池
 */
public class JDBCUtils {
    private static DataSource ds;
    //同步代码块
    static {
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //2.初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
     * 获取连接池对象
     */
    public static DataSource getDataSource(){
        return ds;
    }

    /**
     * 获取连接对象 Connection对象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
