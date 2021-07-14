#增：一定要一一对应
INSERT INTO `student` (`name`) VALUES('Lily')

INSERT INTO `student` (`name`,`age`,`sex`) VALUES('Lily','6','female')

INSERT INTO `student` (`name`,`age`,`sex`) 
VALUES('Lucy','8','female'),('Lilei','8','male'),('Dali','12','male')

#改：一定要指定清楚条件

UPDATE `student` SET `name`='大4帅',`age`='12' WHERE `ID` <= 3
UPDATE `student` SET `name`='小帅',`age`='12' WHERE `ID` BETWEEN 5 AND 7
UPDATE `student` SET `name`='小帅',`age`='15' ,`sex`='male' WHERE `name`='小帅' AND `age`=12


#---------删---------------
CREATE TABLE IF NOT EXISTS `employees` (
`id` INT(10) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(100) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8

INSERT INTO `employees`(`name`) VALUES ('a'),('b'),('c')


#删除时要指定数据
DELETE FROM `student` WHERE ID=11

#Delete不影响自增，但是delete有一个问题：
##--InnoDB 自增列会从1开始（存在内存中的，断电就没）
##--Mylsam 自增列会继续从上一个增量开始（存在文件中的，不会丢失）
DELETE FROM `employees` 

#Truncate 自增归零
TRUNCATE `employees`

