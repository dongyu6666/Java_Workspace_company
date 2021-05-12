# set table SG
DROP TABLE IF EXISTS `SG`;
CREATE TABLE `SG`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`platform_name` VARCHAR(20) COMMENT '车型平台名称',
`diagnose_adr` VARCHAR(6) COMMENT '诊断地址',
`SG_name` VARCHAR(100) COMMENT '控制器名字缩写',
`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT INTO `plee_platform`.`SG` (`id`,`platform_name`,`diagnose_adr`,`SG_name`) VALUES ('1','MQB','0001','MOT'); 
INSERT INTO `plee_platform`.`SG` (`id`,`platform_name`,`diagnose_adr`,`SG_name`) VALUES ('2','MEB','0019','GWA'); 
