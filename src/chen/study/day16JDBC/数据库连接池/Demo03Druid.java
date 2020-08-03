package chen.study.day16JDBC.数据库连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*
    Druid:数据库连接池实现技术，由阿里巴巴提供
        步骤：
            1.导入jar包
                druid-1.0.9和数据库驱动

            2.导入配置文件
                properties形式的
                可以叫任意名称，可以放在任意的目录下

            3.加载配置文件：Properties

            4.获取数据库连接对象：通过一个工厂类来获取DruidDataSourceFactory
            5.获取连接
 */
public class Demo03Druid {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = Demo03Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //获取数据库连接对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
        conn.close();
    }
}
