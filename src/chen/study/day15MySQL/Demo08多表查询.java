package chen.study.day15MySQL;
/*
    多表查询：
        查询的语法：
            select 列名列表 from 表名列表 where...
            eg: select * from emp,dept;
            称为 笛卡尔积
                就是将两张表中所有可能出现的组合全部列出来
                多表查询就是消除其中无用的数据
        准备sql：
                # 创建部门表
                create table dept(
                id int primary key auto_increment,
                name varchar(20)
                );
                insert into dept (name) values ('开发部'),('市场部'),('财务部');
                # 创建员工表
                create table emp (
                id int primary key auto_increment,
                name varchar(10),
                gender char(1), -- 性别
                salary double, -- 工资
                join_date date, -- 入职日期
                dept_id int,
                foreign key (dept_id) references dept(id) -- 外键，关联部门表(部门表的主键)
                );
                insert into emp(name,gender,salary,join_date,dept_id) values('孙悟空','男',7200,'2013-02-24',1);
                insert into emp(name,gender,salary,join_date,dept_id) values('猪八戒','男',3600,'2010-12-02',2);
                insert into emp(name,gender,salary,join_date,dept_id) values('唐僧','男',9000,'2008-08-08',2);
                insert into emp(name,gender,salary,join_date,dept_id) values('白骨精','女',5000,'2015-10-07',3);
                insert into emp(name,gender,salary,join_date,dept_id) values('蜘蛛精','女',4500,'2011-03-14',1);

       多表查询的分类
            1.内连接查询
                1.隐式内连接
                    使用where条件消除无用数据
                    select * from emp,dept where emp.dept_id= dept.id;
                    只查询某几列
                    select emp.name,emp.gender,dept.name from emp,dept where emp.dept_id=dept.id;
                    -- 标准写法 方便加注释
                    SELECT
                                t1.`name`,
                                t1.gender,
                                t2.`name`
                    FROM
                                emp t1,
                                dept t2
                    WHERE
                                t1.dept_id=t2.id;
                2.显式内连接
                    语法：select 字段列表 from 表名1 join 表名2 on 条件
                            eg:select * from emp join dept on emp.dept_id= dept.id;
                3.注意：
                    使用内连接前需要确定
                                    从哪些表中查数据
                                    查询字段是什么
                                    查询条件是什么

            2.外连接查询
                1.左外连接
                    语法：
                        select 字段列表 from 表1 left join 表2 on 条件
                        查询的是左边表的所有数据以及与右边表交集的数据 如果某些数据没有交集 则显示null
                2.右外连接
                    语法：
                        select 字段列表 from 表1 right join 表2 on 条件
                        查询的是右边表的所有数据以及与左边表交集的数据 如果某些数据没有交集 则显示null

            3.子查询
                概念：查询中的嵌套查询，称嵌套的查询为子查询
                    eg:-- 查询工资最高员工的所有信息
                    select * from emp where salary = (select MAX(salary) from emp);
                子查询的不同情况：
                    查询结果是单行单列的：
                                        子查询可以作为条件，使用运算符去判断:>,<,=,>=,<=;
                                        -- 查询工资低于平均工资的人
                                        select * from emp where salary <(select AVG(salary) from emp);
                    查询结果是多行单列的：
                                        子查询可以作为条件，使用运算符去判断:in/or/and;
                                        -- 查询属于市场部或财务部的员工信息
                        select * from emp where dept_id IN(select id from dept where name in('财务部','市场部'));
                    查询结果是多行多列的：
                                        子查询可以作为一张虚拟表来进行一个表的查询
                                        -- 查询员工入职是2011-11-11之后的员工信息及其所属部门信息
                                        SELECT
                                                    *
                                        from
                                                    dept t1,(select * from emp where emp.join_date>'2011-11-11') t2
                                        where
                                                    t1.id = t2.dept_id;

 */
public class Demo08多表查询 {
}
