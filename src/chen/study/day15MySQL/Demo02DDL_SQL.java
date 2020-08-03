package chen.study.day15MySQL;
/*
    什么是SQL(Structured Query Language)?
        结构化查询语言 其实就是定义了操作所有关系型数据库的规则

    SQL的分类：
        （1）DDL（Data Definition Language）数据定义语言
                用来定义数据库对象：数据库，表，列等，关键字：create,drop,alter等
        （2）DML（Data Manipulation Language）数据操作语言
                用来对数据库中的表进行增删改，关键字：insert，delete，update等
        （3）DQL（Data Query Language）数据库查询语言
                用来查询数据库中表的记录（数据），关键字：select，where等
        （4）DCL（Data Control Language）数据库控制语言
                用来定义数据库的访问权限和安全级别，及创建用户，关键字：GRANT,REVOKE等

    DDL：操作数据库、表
        1.操作数据库：CRUD
            1.C（create）：创建
                    创建数据库：
                    create database 数据库名；
                    创建一个db2的数据，并且要判断是否存在才能创建，并且指定字符集为GBK：
                        create database if not exists db2 character set gbk;
            2.R（Retrieve）：查询
                    查询所有数据库的名称
                        show DataBases；
                    查看某个数据库的字符集,查看某个数据库的创建语句
                        show create database 数据库名称;
            3.U（update）：修改
                    修改数据库的字符集：
                        alter database 数据库名称 character set 字符集名称;
            4.D（Delete）：删除
                    删除数据库：
                        drop database 数据库名称;
                    删除数据库前判断他是否存在，如果存在删掉
                        drop database if exists 数据库名称;
            5.使用数据库
                    查询正在使用的数据库名称
                        select database();
                    使用数据库
                        use 数据库名称;
        2.操作表
            1.C（create）：创建
                    语法：
                        create table 表名(
                            列名1 数据类型1,
                            列名2 数据类型2,
                            ...
                            列名n 数据类型n
                        );
                        注意：最后一列不需要加逗号

                    复制一个表
                        create table 表名 like 要复制的表名;

                    数据库常用数据类型
                        1.int 整数
                            eg: age int,
                        2.double 小数
                            eg: score double(5,2),代表小数一共有五位，小数点后保留两位
                        3.date 日期类型 只包含 年月日的日期yyyy-MM-dd;
                        4.datetime 包含年月日时分秒 yyyy-MM-dd HH:mm:ss
                        5.timestamp 时间戳类型 包含年月日时分秒 yyyy-MM-dd HH:mm:ss
                                和datetime的区别：如果不给timestamp赋值或者赋值为null，它会自动获取系统时间
                        6.varchar：字符串类型
                            eg: name varchar(20),姓名最大20个字符
                   练习： 创建一张学生表
                         create table student(
                            name varchar(32);
                            id int,
                            age int,
                            score double(4,1),
                            birthDay data,
                            insertTime timestamp
                         );
            2.R（Retrieve）：查询
                    查询某个数据库中某个表的名称
                        show tables;
                    查询表结构
                        desc 表名;
                    查看某个数据库的字符集,查看某个数据库的创建语句
                        show create table 表名;
            3.U（update）：修改
                    1.修改表名
                        alter table 表名 rename to 新的表名;
                    2.修改表的字符集
                        alter table 表名 character set 字符集（utf8）；
                    3.添加列
                        alter table 表名 add 列名 数据类型;
                    4.修改列的名称和数据类型
                        alter table 表名 原来的的列名 修改的列名 数据类型；
                        只改类型的话：
                        eg: alter table stu modify SEX varchar(10);
                    5.删除列
                        alter table 表名 drop 列名；
            4.D（Delete）：删除
                    删除表
                    drop table 表名;
                    判断一下
                    drop table if exists db1;


 */
public class Demo02DDL_SQL {
}
