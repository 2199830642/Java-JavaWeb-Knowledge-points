package chen.study.day16JDBC.JDBCTemplate;

import chen.study.day16JDBC.数据库连接池.Demo04JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    练习
        需求：
            1.修改孙悟空的工资为1w
            2.添加一条记录
            3.删除刚才添加的记录
 */
public class Demo02DML {
    //Junit单元测试
    //获取对象
    private JdbcTemplate jt = new JdbcTemplate(Demo04JDBCUtils.getDataSource());

    /**
     * 1.修改孙悟空的工资为1w
     */
    @Test
    public void test1(){
        //定义sql语句
        String sql = "update emp set salary = 10000 where ename = ?";
        //执行sql
        int a = jt.update(sql, "孙悟空");
        System.out.println(a);
    }

    /**
     * 2.添加一条记录
     */
    @Test
    public void test2(){
        //定义sql语句
        String sql = "Insert into emp(id,ename) values(?,?)";
        int b = jt.update(sql, 1015, "郭靖");
        System.out.println(b);
    }

    /**
     * 3.删除刚才添加的记录
     */
    @Test
    public void test3(){
        //定义sql语句
        String sql = "delete from emp where id = ?";
        int c = jt.update(sql, 1015);
        System.out.println(c);
    }
}
