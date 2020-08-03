package chen.study.day16JDBC.数据库连接池;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    C3P0：数据库连接池技术
        使用步骤：
            1.导入jar包 c3p0-0.9.5.2.jar 和 mchange-commons-java-0.2.12.jar
                        不要忘记导入数据库的驱动jar包

            2.定义配置文件：
                名称：c3p0.properties 或者 c3p0-config.xml
                路径：直接将文件放在src目录下即可
            3.创建核心对象：
                数据库连接池对象 ComboPooledDataSource
            4.获取连接：
                getConnection
 */
public class Demo02C3P0 {
    public static void main(String[] args){
        Connection conn = null;
        try {
            //创建数据库连接池对象，使用默认配置
            //DataSource ds = new ComboPooledDataSource();
            //创建数据库连接池对象，使用指定名称的配置
            DataSource ds = new ComboPooledDataSource("otherc3p0");
            //获取连接对象
            conn = ds.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            //归还连接
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
