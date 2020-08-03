package chen.study.day15MySQL;
/*
    概念：
        对表中的数据进行限定，保证数据的正确性、有效性、完整性
        分类：
            1.主键约束：primary key
            2.非空约束：not null
            3.唯一约束（唯一索引）：unique
            4.外键约束：foreign key

        * 非空约束：not null
            1.创建表时添加约束
                create table stu(
                    id int  NOT NULL,
                    name VARCHAR(20) NOT NULL
                );
            2.删除列的约束：alter table 表名 modify 列名 数据类型 ;不加约束即可
            3.创建完表后添加列的约束：alter table 表名 modify 列名 数据类型 not null;

        * 唯一约束（唯一索引）：unique表示值不能重复，但是可以有多个null值
            1.创建表时添加约束
                create table stu(
                    id int  unique,
                    name VARCHAR(20) unique
                );
            2.删除列的约束 *****特殊
                alter table 表名 drop index 列名：
            3.创建完表后添加列的约束：alter table 表名 modify 列名 数据类型 unique;

        * 主键约束：primary key 非空且唯一
            1.注意：
                  主键，一张表只能有一个字段为主键
                  主键就是一张表中记录的唯一表示
            2.创建表时添加约束
                create table stu (
                 id INT PRIMARY KEY,
                 name VARCHAR(20)
                );
            3.删除列的约束 *****特殊
                alter table 表名 drop primary key：
            4.创建完表后添加列的约束：
                alter table 表名 modify 列名 数据类型 primary key;
            5.自动增长：
                概念：如果某一列是数值类型的，使用auto_increment可以来完成值得自动增长
                在创建表的时候添加主键约束，并且完成主键的自动增长
                    create table stu (
                     id INT PRIMARY KEY auto_increment,
                     name VARCHAR(20)
                    );
                 删除自动增长：alter table stu modify id int;

        * 外键约束：foreign key 让表与表产生关系 从而保证数据的正确性 外键可以为null
            1.在创建表时可以添加外键
                *语法： create table 表名（
                        ...
                        外键列
                        constraint 外键名称 foreign key （外键列名） references 主表名称（主表列名称）
                    ）;
                    eg:
                    create table department(
                        id int primary key auto_increment,
                        dep_name varchar(20),
                        dep_location varchar(20)
                     );

                    create table employee(
                        id int primary key auto_increment,
                        name varchar(20),
                        age int,
                        dep_id int,
                        CONSTRAINT emp_dep_FK foreign key (dep_id) references department(id)
                     );
           2.删除外键
                alter table 表名 drop foreign key 外键名

           3.在创建表之后添加外键
                alter table 表名 add constraint 外键名 foreign key （外键列名） references 主表名（主表列名）

           4.级联操作：一个变 全都变 级联更新和级联删除可以同时设置
              设置级联更新
                alter table 表名 add constraint 外键名 foreign key （外键列名） references 主表名（主表列名）on update cascade
              设置级联删除
                alter table 表名 add constraint 外键名 foreign key （外键列名） references 主表名（主表列名）on delete cascade

 */
public class Demo05表的约束 {
}
