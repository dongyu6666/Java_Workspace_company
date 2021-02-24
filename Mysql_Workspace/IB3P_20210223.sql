# set table platform
DROP TABLE IF EXISTS `platform`;
CREATE TABLE `platform`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`platform_name` VARCHAR(20) NOT NULL COMMENT '车型平台名称',
`class` VARCHAR(2) NOT NULL COMMENT '车型级别',
`cartype_name` VARCHAR(20) NOT NULL COMMENT '车型名称',
#`structure_name` VARCHAR(20) NOT NULL COMMENT '架构名称',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`platform` (`id`,`platform_name`,`class`,`cartype_name`) VALUES ('1','MEB','A','VW316/6'); 
INSERT INTO `plee_platform`.`platform` (`id`,`platform_name`,`class`,`cartype_name`) VALUES ('2','MQB37W','A','VW380'); 
INSERT INTO `plee_platform`.`platform` (`id`,`platform_name`,`class`,`cartype_name`) VALUES ('3','MQB','B','VW481/0_CN_K'); 

=====================================================================================

# set table cartype
DROP TABLE IF EXISTS `cartype`;
CREATE TABLE `cartype`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`cartype_name` VARCHAR(20) NOT NULL COMMENT '车型名称',
`responsible` VARCHAR(30) NOT NULL COMMENT '负责人',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`cartype` (`id`,`cartype_name`,`responsible`) VALUES ('1','VW316/6','Zhang.Yuchen'); 
INSERT INTO `plee_platform`.`cartype` (`id`,`cartype_name`,`responsible`) VALUES ('2','VW380','Cui.Hongjie'); 
=====================================================================================
# set table SG
DROP TABLE IF EXISTS `SG`;
CREATE TABLE `SG`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`platform_name` VARCHAR(20) NOT NULL COMMENT '车型平台名称',
`diagnose_adr` VARCHAR(6) NOT NULL COMMENT '诊断地址',
`SG_name` VARCHAR(15) NOT NULL COMMENT '控制器名字缩写',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT INTO `plee_platform`.`SG` (`id`,`platform_name`,`diagnose_adr`,`SG_name`) VALUES ('1','MQB','0001','MOT'); 
INSERT INTO `plee_platform`.`SG` (`id`,`platform_name`,`diagnose_adr`,`SG_name`) VALUES ('2','MEB','0019','GWA'); 

=====================================================================================
DROP TABLE IF EXISTS `IB1`;

CREATE TABLE `IB1`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`NAME` VARCHAR(30) NOT NULL COMMENT 'IB1控制器名称',
`version` VARCHAR(10) NOT NULL COMMENT 'IB1版本',
`OBJECTIVES` VARCHAR(1000) COMMENT '目标',
`PRE-CONDITIONS` VARCHAR(1000) COMMENT '前提条件',
`ACCESS-AUTHORISATIONS` VARCHAR(1000) COMMENT '接入许可',
`BLOCK_NAME` VARCHAR(100) NOT NULL COMMENT 'block名称',
`BLOCK_STATE` VARCHAR(20) NOT NULL COMMENT 'block状态',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


INSERT INTO `plee_platform`.`IB1` (`id`,`NAME`,`version`,`OBJECTIVES`,`PRE-CONDITIONS`,`ACCESS-AUTHORISATIONS`,`BLOCK_NAME`,`BLOCK_STATE`) VALUES 
('1','005F_ICAS3_1_Safe','1.6','Die einzelnen SWCL des ICAS1 haben jeweils','Subbussystem in Diagnose:','Diagnose wird über SFD geschützt','Verbau','true'); 



