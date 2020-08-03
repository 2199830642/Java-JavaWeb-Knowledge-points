package chen.study.day15MySQL;
/*
    DML:增删改表中的数据的
        1.添加数据：
            语法：
                insert into 表名(列名1，列名2，...列名n) values(值1，值2，...值n);
  eg:insert into stu(id,name,age,score,birthday,insertTime,sex) values(1,'张无忌',18,99,null,CURRENT_TIME,'男');
                注意：1.列名和值要一一对应
                     2.如果表名后不添加列名，则默认给所有列添加值
                        insert into 表名 values(值1，值2，...值n);
                     3.除了数字之外，其他数据类型要用引号引起来

             蠕虫复制
                什么是蠕虫复制：
                将一张已经存在的表中的数据复制到另一张表中。
                语法格式：
                将表名 2 中的所有的列复制到表名 1 中
                INSERT INTO 表名 1 SELECT * FROM 表名 2;
                只复制部分列
                INSERT INTO 表名 1(列 1, 列 2) SELECT 列 1, 列 2 FROM student;

        2.删除数据：
            语法：
                delete from 表名 where 条件;
                eg:delete from stu where id=1;
                注意：
                    1.如果不加条件，则删除表中所有的记录
                        如果想要删除整张表所有记录
                        ：truncate table 表名；意思就是删除掉这个表，然后创建一个一摸一样的空表
        3.修改数据：
            语法：
                update 表名 set 列名1 = 值1，列名2 = 值2，...where 条件;
                eg:UPDATE stu set age = 23 where id = 1;
                注意：
                    如果不加任何条件，则会将表中所有数据全部修改
 */
public class Demo03DML_添加数据 {
}
