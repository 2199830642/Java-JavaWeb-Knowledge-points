package chen.study.day16JDBC.JDBC各个类详解;
/*
    PreparedStatement:执行sql的对象
        1.SQL注入问题:在拼接sql时，有一些sql的特殊关键字参与字符串的拼接，会造成安全性问题
            随便输入用户名，输入密码 a' or 'a' = 'a，就可以直接登录

        2.解决sql注入问题： 利用PreparedStatement对象解决

        3.预编译的sql：参数使用？作为占位符，在执行sql时需要给？赋值即可

            所以在定义sql语句的时候需要注意：sql的参数用？作为占位符
                如：select * from user where username = ? and password = ?;
            然后获取执行sql语句的对象PreparedStatement
                如：conn.PreparedStatement(String sql); *****注意  这里和前面不一样 需要传参，之前学的简单不用
            然后给？赋值
                如：setXXX(参数1，参数2)，参数1是？的位置编号 从1开始   参数2 是？的值
            执行sql
                如：这里和前面不一样的是，前面需要传递参数，这个不用传递 state.executeUpdate();

       4. 后期就不用Statement，就一直用PreparedStatement执行增删改查
            因为1.可以防止SQL语句注入
                2.效率更高
 */
public class Demo05PreparedStatement {
}
