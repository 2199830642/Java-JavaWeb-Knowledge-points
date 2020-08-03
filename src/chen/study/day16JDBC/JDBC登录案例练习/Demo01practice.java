package chen.study.day16JDBC.JDBC登录案例练习;

import chen.study.day16JDBC.JDBC登录案例练习.创建JDBC工具类.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
    查询emp表的数据，将其封装为对象，然后装载集合，返回 并打印
        步骤：
            1.定义一个emp的类
            2.定义方法 public list<emp> findAll();
            3.实现方法：select * from emp;
 */
public class Demo01practice {

    public static void main(String[] args) {
        //创建本类对象 调用非静态方法
        List<Emp> list = new Demo01practice().findAll();
        list.stream().forEach(s-> System.out.println(s));
        System.out.println(list.size());//14行数据
    }

    /**
     * 查询所有emp对象
     * @return
     */
    public  List<Emp> findAll(){
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        //创建一个装载的集合
        List<Emp> list = new ArrayList<Emp>();
        try {
           /* //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接数据库对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "1nianzhijian");*/
            conn = JDBCUtils.getConnection();
            //获取执行sql语句对象
            state = conn.createStatement();
            //执行sql，返回结果集
            rs = state.executeQuery("select * from db2.emp");
            //创建一个emp类的对象
            Emp emp= null;
            //遍历结果集，封装对象,装载集合
            while(rs.next()){
                //获取每一列
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                //对创建的emp对象进行复用
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            JDBCUtils.close(rs,state,conn);
            /*if (rs != null && state != null && conn != null){
                try {
                    rs.close();
                    state.close();
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }*/
        }
        return list;
    }
}
