package chen.study.day16JDBC.JDBC各个类详解;
/*
    Connection:数据库连接对象
        1.功能：
                1.获取执行sql的对象：
                    Statement createStatement();
                    PreparedStatement PreparedStatement(sql);

                2.管理事务：
                    开启事务：setAutoCommit(boolean autoCommit) 调用该方法 设置参数为false，则开启事务
                    提交事务：commit();
                    回滚事务: rollback();
 */
public class Demo02Connection {
}
