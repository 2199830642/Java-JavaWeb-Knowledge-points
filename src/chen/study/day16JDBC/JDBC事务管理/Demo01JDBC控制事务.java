package chen.study.day16JDBC.JDBC事务管理;
/*
    JDBC控制事务
        1.事务：一个包含多个步骤的业务操作，如果这个业务操作被事务管理，那么这多个操作要么同时成功，要么同时失败

        2.操作：
                1.开启事务 setAutoCommit(boolean autoCommit) 调用该方法 设置参数为false 开启事务
                    在执行sql前开启事务，即获得连接对象就可开启事务
                2.提交事务 commit();
                    在所有sql执行完毕后，提交事务
                3.回滚事务 rollback();
                    在catch中回滚事务

        3.使用Connection对象来管理事务

 */
public class Demo01JDBC控制事务 {
}
