package chen.study.test;

import chen.study.dao.UserDao;
import chen.study.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test//检验这个方法对不对
    public void testLogin(){
        //创建一个User对象
        User Loginuser = new User();
        Loginuser.setUsername("陈凯博");
        Loginuser.setPassword("123");

        UserDao dao = new UserDao();
        User user = dao.login(Loginuser);
        System.out.println(user);
    }
}
