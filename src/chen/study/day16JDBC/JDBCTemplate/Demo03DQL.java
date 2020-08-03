package chen.study.day16JDBC.JDBCTemplate;

import chen.study.day16JDBC.数据库连接池.Demo04JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
    练习
        需求：
            4.查询id=1的记录，将其封装为map集合
            5.查询所有的记录，将其封装为list集合
            6.查询所有记录，将其封装为emp对象的list集合
            7.查询总记录数
 */
public class Demo03DQL {
    JdbcTemplate jt = new JdbcTemplate(Demo04JDBCUtils.getDataSource());

    /**
     * 4.查询id=1001的记录，将其封装为map集合
     * 注意这个方法查询的结果集长度只能是1.就是一次只能查询一句
     */
    @Test
    public void test4(){
        //定义sql语句
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = jt.queryForMap(sql, 1001);
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
    }

    /**
     * 5.查询所有的记录，将其封装为list集合
     * 其实就是list集合里存储值得泛型是map，每一条记录就是一个map集合
     */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = jt.queryForList(sql);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    /**
     * 6.查询所有记录，将其封装为emp对象的list集合  不推荐用这个方法
     */
    @Test
    public void test6(){
        String sql ="select * from emp";
        List<Emp> list = jt.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                return emp;
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 6.查询所有记录，将其封装为emp对象的list集合，用这个
     */
    @Test
    public void test7(){
        String sql = "select * from emp";
        List<Emp> list = jt.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 7.查询总记录数
     */
    @Test
    public void test8(){
        String sql = "select count(id) from emp";
        Long total = jt.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
