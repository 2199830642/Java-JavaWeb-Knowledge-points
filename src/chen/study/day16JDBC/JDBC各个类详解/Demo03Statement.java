package chen.study.day16JDBC.JDBC各个类详解;
/*
    Statement:执行sql的对象
        1.方法：
                1. boolean execute(String sql):可以执行任意的sql  了解即可
                2. int executeUpdate(String sql):执行DML(insert,delete,update)语句,DDL(对表和库的操作)语句
                    返回值：影响的行数  如果只操作了一行 那就是返回1
                           可以通过返回值判断语句是否执行成功，如果大于0则成功
                           但是 如果执行的是DDL语句 执行成功返回的是0
                3.ResultSet executeQuery(String sql):执行DQL(select)语句的
                    返回一个结果集对象
 */
public class Demo03Statement {
}
