package chen.study.Servlet;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库中user表的类
 */
public class UserDao {
    //声明JDBCTemplate对象
    private JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     * @param loginUser 只有用户名和密码
     * @return  User包含用户全部数据,没有查询到，会返回一个null值
     */
    public User login(User loginUser){
        try {
            //编写sql
            String sql = "select * from user where username = ? and password = ?";
            //调用query方法
            User user = jt.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),
                    loginUser.getPassword());
            return user;
        } catch (Exception e) {
            e.printStackTrace();//记录日志
            return null;
        }
    }
}
