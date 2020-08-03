package chen.study.day15MySQL;
/*
    事务：
        1.事务的基本介绍
            1.概念：
                    如果一个包含多个步骤的业务操作被事务管理，那么这些操作要么同时成功，要么同时失败
            2.操作：
                    开启事务：start transaction
                    回滚:rollback
                    提交事务:commit
            3.例子：
                    -- 创建数据表
                    CREATE TABLE account (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    NAME VARCHAR(10),
                    balance DOUBLE
                    );
                    -- 添加数据
                    INSERT INTO account (NAME, balance) VALUES ('zhangsan', 1000), ('lisi', 1000);

                    select * from account;
                    -- 开启事务
                    START TRANSACTION;
                    -- 张三账户减500
                    UPDATE account set balance = balance - 500 where name = 'zhangsan';
                    -- 李四账户加500
                    UPDATE account set balance = balance + 500 where name = 'lisi';
                    -- 如果出现异常 回滚
                    -- ROLLBACK;
                    -- 如果一切正常，提交事务；
                    COMMIT;
             4.自动提交和手动提交：  mysql数据库默认自动提交，Oracle数据库是默认手动提交
                每次执行一条DML（增删改）语句，就会自动提交一次事务
                如果手动开启事务，但是没有提交，关闭窗口后再次打开，事务会默认回滚到初始状态

                更改提交方式：
                    先查看 select @@autocommit  1代表自动提交 0代表手动提交
                    修改：set @@autocommit = 0;
                    改为0后 每一条DML语句结尾都必须要添加commit；

        2.事务的四大特征
            1.原子性：是不可分割的最小操作单位，要么同时成功，要么同时失败
            2.持久性：如果事务一旦提交或者回滚，那么数据库表的数据将被持久的更新
            3.隔离性：多个事务之间相互独立，但是真实情况下，多个事务之间会产生影响
            4.一致性：事务操作前后，数据总量不变

        3.事务的隔离级别(了解)
            概念：多个事务之间是是隔离的，相互独立的，如果多个事务操作同一批数据，则会引发一些问题
                 设置不同的隔离级别，就可以解决这些问题

            存在问题：1.脏读：一个事务读取到另一个事务没有提交的数据
                            例子：
                            张三问李四接了500，李四将事务隔离级别设置成读未提交，对张三进行转账后但是没有提交，张三查看自己确实多了500
                            然后给李四写了借条，李四收到借条并将数据回滚，张三的500又回到李四账户，张三还得给李四还500

                     2.不可重复读(虚读)：在同一个事务中，两次读取到的数据不一样
                     3.幻读：一个事务操作(DML)数据表中的所有记录，另一个事务添加了一条数据，则第一个事务查询不到自己的修改

            隔离级别：
                    1.read uncommitted:读未提交
                        产生的问题：脏读，虚读，幻读
                    2.read committed:读已提交（Oracle默认的）
                        产生的问题：虚读，幻读
                    3.repeatable read:可重复读（MySQL默认的）
                        产生的问题：幻读
                    4.serializable:串行化(其实就是锁表 当一个事务在操作这个表的时候，其他事务是无法操作这个表的)
                        可以解决所有的问题
            注意：隔离级别从小到大 安全性越来越高，但是效率越来越低

            数据库查询隔离级别:select ##tx_isolation;

            数据库设置隔离级别:set global transaction isolation level 级别字符串; 
 */
public class Demo10事务 {
}
