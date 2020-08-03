package chen.study.day15MySQL;

/*
    DQL:查询表中的记录
        select * from 表名;

        1.语法：
            select
                字段列表
            from
                表名列表
             where
                条件列表
             group by
                分组字段
             having
                分组之后的条件
             order by
                排序
             limit
                分页限定

        2.基础查询
            1.多个字段的查询
                    select  name,age from student;
            2.去除重复:
                    distinct关键字
                    eg:select distinct address from student;
            3.计算列:
                    SELECT name , math , english , math + english from student;
                    注意：
                        如果有null参与的计算结果都为null，如何解决呢？
                        Mysql里有一个IFNULL函数专门用来解决，第一个值判断是否为null，第二个值如果是则用什么替换。
                        SELECT name,math,english,math + IFNULL(english,0) from student;
            4.起别名
                    SELECT name,math,english,math + IFNULL(english,0) AS 总分 from student;
                    也可以这样
                    SELECT name,math 数学,english 英语,math + IFNULL(english,0) 总分 from student;

        3.条件查询
            1.where 子句后跟条件
            2.运算符
                * > 、< 、<= 、 >= 、= 、 <>
                * BETWEEN...AND
                           eg:-- 查询年龄大于二十岁小于三十岁
                            Select * from student where age>=20 && age<=30;
                            Select * from student where age>=20 AND age<=30;
                            select * from student where age BETWEEN 20 and 30;
                * IN(集合)
                * LIKE(模糊查询)
                    占位符：
                        _:单个任意字符
                        %:多个任意字符
                           eg: -- 查询姓马的有哪些
                            select * from student where name like '马%';
                               -- 查询第二个字是化的人
                            select * from student where name like '_化%';
                               -- 查询名字中包含马的
                            select * from student where name like '%马%';
                * IS NULL
                            判断是不是null值 不可以用=或者！= 要用 IS NULL；
                            select * from student where english is null;  查询是空值的
                            select * from student where english is not null;    查询不是空值的
                * AND 或 &&
                * OR 或 ||
                * NOT 或 ！

       4.排序查询
            *语法：order by 子句
                order by 排序字段1 排序方式1,排序字段2，排序方式2;
            *注意：
                默认为升序排序
                ASC 升序排序
                DESC 降序排序
                            eg:--查询名字中包含马的数学成绩并升序排序
                             select * from student where name like '%马%' ORDER BY math asc;
                               --降序排序
                             select * from student ORDER BY math desc;
                               -- 按照数学成绩排名，如果数学成绩一样，则按照英语成绩排名，都是升序
                             select * from student ORDER BY math asc,english asc;

       5.聚合函数：将一列数据作为一个整体，进行纵向的计算，比如计算一列数据的平均值
            1.count:表示计算个数
                            eg:select COUNT(`name`) from student;
                            如果有空值 那么可以使用IFNULL();
                            select COUNT(IFNULL('name',0)) from student;
            2.max:计算最大值
                            select max(math) from student;
            3.min:计算最小值
                            select min(math) from student;
            4.sum:求和
                            select sum(math) from student;
            5.avg:计算平均值
                            select avg(IFNULL(english,0)) from student;

            注意：所有的聚合函数计算时都会排除NULL值

       6.分组查询
            *语法 group by 分组字段;
                            eg:-- 按照性别分组并且计算平均分并且查看各组人数
                            select sex,avg(IFNULL(english,0)),count(id) from student GROUP BY sex;
                            -- 按照性别分组并且计算平均分并且查看各组人数 要求分数低于70分不参与分组
                    select sex,avg(IFNULL(english,0)),count(id) from student where english>70 GROUP BY sex;
                            -- 按照性别分组并且计算平均分并且查看各组人数 要求分数低于70分不参与分组,人数小于两个不展示
         select sex,avg(IFNULL(english,0)),count(id) from student where english>70 GROUP BY sex having count(id)>2;
            *注意:
                1.分组之后查询的字段：分组字段,聚合函数
                2.where 和 having的区别
                    1.where和having的作用位置不一样
                    where在分组之前进行限定，如果不满足这个条件则不参与分组
                    having在分组之后进行限定，如果不满足结果则不会被查询出来
                    2.where后不可以进行聚合函数的判定
                      having之后可以进行聚合函数的判定

       7.分页查询
            *语法 limit 开始的索引 每页查询的条数;
                            eg:-- 每页显示三条记录
                            select * from student LIMIT 0,3;-- 第一页
                            select * from student LIMIT 3,3;-- 第二页
                            -- 公式：开始的索引=（当前的页码-1）*每页显示的条数
           *limit操作是mysql的方言 每个数据库的分页操作都不同。
 */
public class Demo04DQL_基础查询 {
}
