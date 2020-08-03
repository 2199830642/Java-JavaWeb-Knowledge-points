package chen.study.day16JDBC.JDBCTemplate;

import chen.study.day16JDBC.数据库连接池.Demo04JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    Spring JDBC
        Spring框架对JDBC的简单封装。提供了一个JDBCTemplate对象简化JDBC的开发

        步骤：
            1.导入jar包
            2.创建JdbcTemplate对象，依赖于数据源DataSource
                JdbcTemplate jt = new JdbcTemplate(ds);
            3.调用jt的方法，完成CRUD的操作
                update();执行DML语句，增删改
                queryForMap();查询结果，将结果集封装为Map集合
                    注意这个方法查询的结果集长度只能是1.就是一次只能查询一句

                queryForList();查询结果，将结果封装为List集合
                    其实就是list集合里存储值得泛型是map，每一条记录就是一个map集合

                query();查询结果，将结果封装为javaBean对象
                    query:参数：RowMapper
                    一般我们这样
                        query(sql,new BeanPropertyRowMapper<emp>(emp.class));进行类的封装
                    可以完成数据到JavaBean的自动封装

                queryForObject();查询结果，将结果封装为对象
                    一般用于聚合函数的查询
                        jt.queryForObject(sql, Long.class);
 */
public class Demo01概念 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate(Demo04JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int a = jt.update(sql, 1);
        System.out.println(a);
    }
}
