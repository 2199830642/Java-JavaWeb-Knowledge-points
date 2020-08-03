package chen.study.day16JDBC.JDBC各个类详解;
/*
    DriverManger:驱动管理对象
        1.功能：
                1.注册驱动：告诉程序该使用哪一个数据库驱动jar包
                    static void registerDriver(Driver driver):注册与给定的驱动程序 DriverManger
                    写代码使用：Class.forName("com.mysql.cj.jdbc.Driver");

                        通过查看源码发现com.mysql.cj.jdbc.Driver类中有一个静态代码块
                        static {
                                try {
                                    DriverManager.registerDriver(new Driver());
                                } catch (SQLException var1) {
                                    throw new RuntimeException("Can't register driver!");
                                }
                            }
                   注意：mysql5之后的驱动jar包可以省略注册驱动这一步

                2.获取数据库连接
                    方法：
                    static Connection getConnection(String url , String user , String password);
                    参数：
                        url：指定连接的路径
                                        语法：jdbc:mysql://IP地址(域名):端口号/数据库名称
                                        例子：jdbc:mysql://127.0.0.1:3306/db3
                                        小知识：如果连接的是本机的一个mysql服务器，并且mysql服务默认端口是3306，
                                               则url可以简写jdbc:mysql:///数据库名称
                        user：用户名
                        password：密码
 */
public class Demo01DriverManager {
}
