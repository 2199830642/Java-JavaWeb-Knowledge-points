package chen.study.day15MySQL;
/*
    1.管理用户
            1.添加用户
                -- 创建用户
                create user '用户名'@'主机名' identified by '密码';
                create user 'zhangsan'@'localhost' identified by 'abc';
                create user 'lisi'@'%' identified by '123';(%代表所有主机)
            2.删除用户
                drop user '用户名'@'主机名'
            3.修改用户密码
                update user set password = password('新密码') where user = '用户名';

                mysql中如果忘记了root用户的密码登录不了数据库怎么办
                    1.终端-> net stop mysql;  停止mysql的服务
                        需要管理员权限
                    2.使用无验证方式启动mysql服务， mysqld --skip-grant-tables
                    3.然后另起一个终端，直接就可以登陆mysql  然后可以改密码
                    4.打开任务管理器，手动结束mysqld进程，然后还是通过管理员权限就可以登陆了
                    5.先 net start mysql;然后正常步骤

            4.查询用户
                -- 查询用户
                use mysql;
                SELECT * from user;

    2.授权
            1.查询权限：
                show grants for '用户名'@'主机名';

            2.授予权限：
                grant 权限列表（可以写多个） on 数据库名.表名 to '用户名'@'主机名';
                grant select,delete,update on db2.account to '李四'@'%';
                grant all on *.* to '李四'@'%';

            3.撤销权限：
                revoke 权限列表 on 数据库名.表名 from '用户名'@'主机名';
 */
public class Demo11DCL_用户管理 {
}
