#----查--------
#查询表的全部
SELECT * FROM `student`
#查询指定字段
SELECT `name`,`age`FROM `student`
#起别名AS
SELECT `name` AS 名字,`age` AS 年龄 FROM `student`
#举例一个合并函数 CONCAT（a,b）
SELECT CONCAT('姓名:', NAME) AS 大家的名字 FROM `student`

#去重`employees`
#DISTINCT去除SELECT中查询出来的结果中重复的数据，只保留一条
SELECT * FROM student
SELECT `name` FROM student
SELECT DISTINCT `name` FROM student 
SELECT `name`,`age`+10 AS '10年后' FROM `student`


#where 检索数据符合条件的值(逻辑运算符&&、or、！)
SELECT `name`,`age`FROM student
WHERE age<10 && age>6

SELECT `name`,`age`FROM student
WHERE age BETWEEN 6 AND 15

SELECT `name`,`age`FROM student`Pr黤bereich`
WHERE age=6 OR age=15

SELECT `name`,`age`FROM student
WHERE age!=12

#--------模糊查询like,与%连用--------
SELECT `name` FROM student
WHERE NAME LIKE '大%'

SELECT `name` FROM student
WHERE NAME LIKE '大_帅'

SELECT `name` FROM student
WHERE NAME LIKE '%3%'

#--------具体查询IN--------
SELECT `id`,`name` FROM student
WHERE id IN(1,2,5)
#--------NULL/NOT NULL--------
SELECT `id`,`name`,`time` FROM student
WHERE `time` IS NOT NULL && NAME LIKE '大%'

SELECT * FROM `EZE_IPB`

#-----join on 连接查询    where是等值查询
SELECT a.id,a.username,a.score,age
FROM user2 AS a
INNER JOIN user1 AS b
ON a.username = b.username

SELECT a.id,a.username,a.score,age
FROM user2 AS a
LEFT JOIN user1 AS b
ON a.username = b.username

SELECT a.id,a.username,a.score,age
FROM user2 AS a
RIGHT JOIN user1 AS b
ON a.username = b.username

#---自连接，自己的表和自己的表连接，一张表拆成两张一样的表

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `DEPTNO` INT(2) NOT NULL,
  `DNAME` VARCHAR(14) DEFAULT NULL,
  `LOC` VARCHAR(13) DEFAULT NULL,
  PRIMARY KEY (`DEPTNO`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `dept` */
# 往dept表写数据
INSERT  INTO `dept`(`DEPTNO`,`DNAME`,`LOC`) VALUES (10,'ACCOUNTING','NEW YORK'),(20,'RESEARCH','DALLAS'),(30,'SALES','CHICAGO'),(40,'OPERATIONS','BOSTON');


DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `EMPNO` INT(4) NOT NULL,
  `ENAME` VARCHAR(10) DEFAULT NULL,
  `JOB` VARCHAR(9) DEFAULT NULL,
  `MGR` INT(4) DEFAULT NULL,
  `HIREDATE` DATE DEFAULT NULL,
  `SAL` INT(7) DEFAULT NULL,
  `COMM` INT(7) DEFAULT NULL,
  `DEPTNO` INT(2) DEFAULT NULL,
  PRIMARY KEY (`EMPNO`),
  KEY `FK_DEPTNO` (`DEPTNO`),
  CONSTRAINT `FK_DEPTNO` FOREIGN KEY (`DEPTNO`) REFERENCES `dept` (`DEPTNO`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `emp` */
# 往员工emp表写数据
INSERT  INTO `emp`(`EMPNO`,`ENAME`,`JOB`,`MGR`,`HIREDATE`,`SAL`,`COMM`,`DEPTNO`) VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20),(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30),(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30),(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20),(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30),(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30),(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10),(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20),(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10),(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30),(7876,'ADAMS','CLERK',7788,'1987-05-23',1100,NULL,20),(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30),(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20),(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

SELECT a.`DEPTNO` AS 部门代号,a.`DNAME` AS 部门,b.`ENAME` AS 雇员名字,b.`JOB`AS 职位,a.`LOC`AS 地理位置
FROM `dept` AS a
LEFT JOIN `emp` AS b
ON a.`DEPTNO`=b.`DEPTNO`
ORDER BY b.`ENAME`
#where b.JOB='MANAGER' && a.`LOC`='DALLAS'

#-----分页limit和排序order by

#--排序：升序ASC，降序DESC

SELECT * FROM`user1`
#order by `score` ASC
ORDER BY `score` DESC

#-----分页,LIMIT 起始值，页面大小
# N表示当前页，总页数=数据总数/页面大小
# page1,LIMIT 0,5
# page2,LIMIT 5,5
# page3,LIMIT 10,5
# pageN,LIMIT (N-1)*5


SELECT * FROM`user1`
ORDER BY `score` DESC
LIMIT 0,10

#总结SELECT的顺序
#SELECT FROM
#INNER LEFT RIGHT JOIN ON
#WHERE
#GROUP BY 指定结果按照哪几个字段来分组
#HAVING 过滤分组的记录必须满足的次要条件，就能再用where了
#ORDER BY
#LIMIT

#----常用函数-------
#简单

#----聚合函数-------

SELECT COUNT(`score`) FROM `user1`;#count（字段）会忽略所有的null
SELECT COUNT(*) FROM `user1`;#不会忽略null，本质是计算行数
SELECT COUNT(1) FROM `user1`;#不会忽略null

SELECT SUM(`score`) AS 总和 FROM `user1`;
SELECT AVG(`score`) AS 平均分 FROM `user1`;
SELECT MAX(`score`) AS 最高分 FROM `user1`;
SELECT MIN(`score`) AS 最低分 FROM `user1`;


#-------- 测试MD5加密--------
CREATE TABLE IF NOT EXISTS`test_MD5`(
`id` INT(4) NOT NULL,
`name` VARCHAR(20) NOT NULL,
`pwd` VARCHAR(50) NOT NULL,
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8
DROP `test_MD5`
#加密MD5
INSERT INTO `test_MD5`(`id`,`name`,`pwd`) VALUES (1,'张三','123456'),(2,'李四','123456'),(3,'王五','123456')
UPDATE test_MD5 SET pwd=MD5(`pwd`) WHERE id = 1
UPDATE test_MD5 SET pwd=MD5(`pwd`) 
#将用户传递进来的值直接进行MD5加密
INSERT INTO `test_MD5`(`id`,`name`,`pwd`) VALUES (4,'张三1',MD5('123456')),(5,'李四2',MD5('123456')),(6,'王五3',MD5('123456'))

DELETE FROM `test_MD5` WHERE `id` >=4
SELECT *FROM `test_md5`
ORDER BY `id`ASC
#------------分组Group by-------------------
SELECT *FROM `test_md5`
SELECT NAME, COUNT(*) FROM `test_MD5` GROUP BY NAME;


#------正则表达式-----------
#查找字段中以'张'为开头的所有数据
SELECT NAME FROM `test_MD5` WHERE NAME REGEXP '^张';
#查找字段中以'三'结尾的所有数据
SELECT NAME FROM `test_MD5` WHERE NAME REGEXP '三$';
#查找字段中包含'3'的所有数据
SELECT NAME FROM `test_MD5` WHERE NAME REGEXP '3';



#-----事务-----
#ACID原则，ACID原则 原子性，一致性，隔离性，持久性

#原子性Atomicity，要么都成功，要么都失败
#一致性Consistency，事务前后的数据完整性要保持一致
#持久性Durability，事务一旦提交不可逆，被持久化到数据库中
#隔离性Isolation，事务的隔离性是多个用户并发访问数据库时，数据库为每一个用户开启的事务，不能被其他事务的操作数据所干扰，事务之间要互相隔离。
#隔离导致的问题：导致了脏读，导致了不可重复读，导致了虚读。

#=======事务===========
#-mysql默认开启事务自动提交
#关闭 Set autocommit = 0
#默认开启 SET autocommit = 1

#模拟场景，转账

CREATE DATABASE shop CHARACTER SET utf8 COLLATE utf8_general_ci
USE shop
DROP TABLE `account`
CREATE TABLE `account`(
`id` INT(3) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(30) NOT NULL,
`money` DECIMAL(9,2) NOT NULL,
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8

INSERT INTO ACCOUNT(`name`,`money`)
VALUES('A',2000),('B',10000)

#模拟转账：事务
#关闭自动提交
SET autocommit = 0;

#开启一个事务（一组事务）
START TRANSACTION;
UPDATE ACCOUNT SET money=money-500 WHERE `name`='A';
UPDATE ACCOUNT SET money=money+500 WHERE `name`='B';

#--提交事务，就被持久化了
COMMIT;
#如果失败回滚
ROLLBACK;
#恢复默认
SET autocommit = 1;

#索引分类
#主键索引只能有一个，唯一索引可以有多个

#主键索引（PRIMARY KEY）
#--唯一的标识，主键不可重复，只能有一个列作为主键

#唯一索引（UQIQUE KEY）
#--避免重复的列，唯一索引可以重复，每个列都可以标识成唯一索引

#常规索引（KEY/INDEX）
#--默认的，index关键字或者key关键字来设置

#全文索引（Fulltext）
#--在特定的数据库引擎下才有，Mylsam
#--快速定位数据

#EXPLAIN 分析sql执行的情况
#---Blog---MySQL索引背后的数据结构及算法原理
# http://blog.codinglabs.org/articles/theory-of-mysql-index.html


#权限管理

#创建用户 CREATE USER用户名 IDENTIFIED BY ‘密码’,Host adress默认是127.0.0.1
CREATE USER 'Alex'@'127.0.0.1' IDENTIFIED WITH caching_sha2_password BY '123456'; 

#修改密码（修改指定用户密码）
ALTER USER 'Alex'@'127.0.0.1' IDENTIFIED WITH caching_sha2_password BY '123456';
ALTER USER 'Alex'@'127.0.0.1' IDENTIFIED WITH caching_sha2_password BY '654321';

#重命名，改名
RENAME USER 'Alex'@'127.0.0.1' TO 'Alex222'@'127.0.0.1'; 

#授权
GRANT ALTER, ALTER ROUTINE, CREATE ON *.* TO 'Alex222'@'127.0.0.1';

#查询权限
SHOW GRANTS FOR 'Alex222'@'127.0.0.1'

#撤销权限
REVOKE ALTER, ALTER ROUTINE, CREATE ON *.* FROM 'Alex222'@'127.0.0.1'; 

#删除用户
DROP USER 'Alex222'@'127.0.0.1'; 

#备份、导入、导出, 用Sqlyog或者Navicat

#数据库的三大范式
#第一范式（1NF）
#原子性：保证每一列不可再分
#第二范式（2NF）
#在满足第一范式的前提下，每张表只描述一件事情
#第三范式（3NF）
#在在满足第一、第二范式的前提下，第三范式需要确保数据表中的每一列数据都和主键直接相关，而不能间接相关。

#规范性和性能的问题，权衡利弊
#关联查询最好不要超过3张表
#考虑成本、用户体验
#故意给某些表增加一些冗余字段（从多表查询变成单表查询）
#故意增加一些计算列（从大数据量降低为小数据量的查询：索引）

#JDBC

DROP TABLE IF  EXISTS user_role;
CREATE TABLE  user_role
(
	user_id TINYINT UNSIGNED NOT NULL COMMENT '用户的ID',
	role_id SMALLINT UNSIGNED NOT NULL COMMENT  '角色的ID',
	KEY user_id(user_id),
	KEY role_id(role_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户角色表';