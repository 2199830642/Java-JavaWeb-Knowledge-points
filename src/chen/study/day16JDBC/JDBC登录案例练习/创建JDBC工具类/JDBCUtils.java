package chen.study.day16JDBC.JDBC登录案例练习.创建JDBC工具类;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
    JDBC工具类
    目的：简化书写
    1.注册驱动也抽取
    2.创建一个方法获取连接对象
            需求：不想传递参数（麻烦），还得保证工具的通用性
            解决方案 ： 配置文件
                jdbc.properties
                    url =
                    user =
                    password =
    3.创建一个方法释放资源
 */
public class JDBCUtils {
    //声明三个成员变量,之所以标记静态 是因为只有静态才能被静态代码块访问 才能被静态方法访问
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    //只需要文件的读取，读取一次即可拿到连接所需要的参数，使用静态代码块，静态代码块会随着类的加载而加载
    static{
        try {
            //读取资源文件，获取值

            //创建Properties集合
            Properties pro = new Properties();

            //获取src路径下文件的方式---->ClassLoader 类加载器
            /*ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("JDBC.properties");
            String path = res.getPath();
            System.out.println(path);*/

            //加载文件
            pro.load(new FileReader("/Users/chen/Desktop/IdeaProjects/src/JDBC.properties"));
            //pro.load(new FileReader(path));
            url = pro.getProperty(url);
            user = pro.getProperty(user);
            password = pro.getProperty(password);
            driver = pro.getProperty(driver);

            //注册驱动
                Class.forName(driver);
        } catch (IOException e) {
            System.out.println(e);
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    //获取连接方法
    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * @param state
     * @param conn
     * @param rs
     */
    public static void close(ResultSet rs,Statement state , Connection conn){
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(state!=null) {
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
