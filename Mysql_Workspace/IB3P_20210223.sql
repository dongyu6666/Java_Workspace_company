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
DROP TABLE IF EXISTS `IB1_ECUinfo`;

CREATE TABLE `IB1_ECUinfo`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`SG_name` VARCHAR(30) NOT NULL COMMENT 'IB1控制器名称',
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


INSERT INTO `plee_platform`.`IB1_ECUinfo` (`id`,`SG_name`,`version`,`OBJECTIVES`,`PRE-CONDITIONS`,`ACCESS-AUTHORISATIONS`,`BLOCK_NAME`,`BLOCK_STATE`) VALUES 
('1','005F_ICAS3_1_Safe','1.6','Die einzelnen SWCL des ICAS1 haben jeweils','Subbussystem in Diagnose:','Diagnose wird über SFD geschützt','Verbau','true'); 

=====================================================================================

DROP TABLE IF EXISTS `BLOCK`;

CREATE TABLE `BLOCK`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`LOGICAL-LINK` VARCHAR(30) NOT NULL COMMENT 'logical link',
`KD-relevant` BOOLEAN COMMENT '售后相关性',
`P-relevant` BOOLEAN COMMENT '生产相关性',
`optional` BOOLEAN COMMENT '可选性',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK` (`id`,`BLOCK_NAME`,`LOGICAL-LINK`,`KD-relevant`,`P-relevant`,`optional`) VALUES 
('1','Verbauprüfung (Master)','GatewUDS','1','1','1');
 
=====================================================================================

DROP TABLE IF EXISTS `BLOCK_Description`;

CREATE TABLE `BLOCK_Description`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`IB1-DESC` VARCHAR(5000) COMMENT 'IB1描述',
`IB2P-DESC` VARCHAR(5000) COMMENT 'IB2P描述',
`IB3P-DESC` VARCHAR(5000) COMMENT 'IB3P描述',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK_Description` (`id`,`BLOCK_NAME`,`IB1-DESC`,`IB2P-DESC`,`IB3P-DESC`) VALUES 
('1','Verbauprüfung (Master)','IB1_blabla','IB2P_blabla','IB3P_blabla');

=====================================================================================
DROP TABLE IF EXISTS `BLOCK_TAG`;

CREATE TABLE `BLOCK_TAG`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`BLOCK_TAG_Level` VARCHAR(10) COMMENT 'BLOCK中TAG level',
`BLOCK_TAG_TAG` VARCHAR(500) COMMENT 'BLOCK中TAG内容',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK_TAG` (`id`,`BLOCK_NAME`,`BLOCK_TAG_Level`,`BLOCK_TAG_TAG`) VALUES 
('1','Verbauprüfung (Master)','IB1','IBNZ VSI-Wert aus Gatewa');

=====================================================================================
DROP TABLE IF EXISTS `BLOCK_IBNZ`;

CREATE TABLE `BLOCK_IBNZ`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`BLOCK_IB1_VSI` DOUBLE(12,6) COMMENT 'BLOCK中IB1的IBNZ时间',
`BLOCK_IB2_VSI` DOUBLE(12,6) COMMENT 'BLOCK中IB2P的IBNZ时间',
`BLOCK_IB3_VSI` DOUBLE(12,6) COMMENT 'BLOCK中IB3P的IBNZ时间',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK_IBNZ` (`id`,`BLOCK_NAME`,`BLOCK_IB1_VSI`,`BLOCK_IB2_VSI`,`BLOCK_IB3_VSI`) VALUES 
('1','Verbauprüfung (Master)','0.082','0.08201','0.082');

=====================================================================================
DROP TABLE IF EXISTS `BLOCK_Variants`;

CREATE TABLE `BLOCK_Variants`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`BLOCK_IB1_LAS` VARCHAR(20) COMMENT 'BLOCK中IB1的LAS',
`BLOCK_IB2_LAS` VARCHAR(20) COMMENT 'BLOCK中IB2P的LAS',
`BLOCK_IB3_LAS` VARCHAR(20) COMMENT 'BLOCK中IB3P的LAS',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK_Variants` (`id`,`BLOCK_NAME`,`BLOCK_IB1_LAS`,`BLOCK_IB2_LAS`,`BLOCK_IB3_LAS`) VALUES 
('1','Verbauprüfung (Master)','1X1','1X2','1X3');

=====================================================================================
DROP TABLE IF EXISTS `BLOCK_IBN_AREA`;

CREATE TABLE `BLOCK_IBN_AREA`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',

`BLOCK_IB1_BUILDUP-CONDITIONS` VARCHAR(1000) COMMENT 'Build up conditions',
`BLOCK_IB2P_BUILDUP-CONDITIONS` VARCHAR(1000) COMMENT 'Build up conditions',
`BLOCK_IB3P_BUILDUP-CONDITIONS` VARCHAR(1000) COMMENT 'Build up conditions',

`BLOCK_IB1_GENERAL-CONDITIONS` VARCHAR(1000) COMMENT 'general conditions',
`BLOCK_IB2P_GENERAL-CONDITIONS` VARCHAR(1000) COMMENT 'general conditions',
`BLOCK_IB3P_GENERAL-CONDITIONS` VARCHAR(1000) COMMENT 'general conditions',

`BLOCK_IB1_DEPENDENCIES` VARCHAR(1000) COMMENT 'Cross-ECU Dependencies附属的',
`BLOCK_IB2P_DEPENDENCIES` VARCHAR(1000) COMMENT 'Cross-ECU Dependencies附属的',
`BLOCK_IB3P_DEPENDENCIES` VARCHAR(1000) COMMENT 'Cross-ECU Dependencies附属的',

`BLOCK_IB1_RESSOURCES` VARCHAR(1000) COMMENT 'special resources',
`BLOCK_IB2P_RESSOURCES` VARCHAR(1000) COMMENT 'special resources',
`BLOCK_IB3P_RESSOURCES` VARCHAR(1000) COMMENT 'special resources',


`BLOCK_IB1_MISCELLANEOUS` VARCHAR(1000) COMMENT 'other conditions混杂的',
`BLOCK_IB2P_MISCELLANEOUS` VARCHAR(1000) COMMENT 'other conditions混杂的',
`BLOCK_IB3P_MISCELLANEOUS` VARCHAR(1000) COMMENT 'other conditions混杂的',


`BLOCK_IB1_MANUAL-OPERATIONS` BOOLEAN COMMENT 'manual operations',
`BLOCK_IB2P_MANUAL-OPERATIONS` BOOLEAN COMMENT 'manual operations',
`BLOCK_IB3P_MANUAL-OPERATIONS` BOOLEAN COMMENT 'manual operations',

`BLOCK_IB1_AREA` BOOLEAN COMMENT '推荐的AREA',
`BLOCK_IB2P_AREA` BOOLEAN COMMENT '推荐的AREA',
`BLOCK_IB3P_AREA` BOOLEAN COMMENT '推荐的AREA',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

=====================================================================================
DROP TABLE IF EXISTS `BLOCK_PARAMETER`;

CREATE TABLE `BLOCK_PARAMETER`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`BLOCK_NAME` VARCHAR(30) NOT NULL COMMENT 'BLOCK名称',
`BLOCK_PARAMETER_KEY` VARCHAR(1000) COMMENT 'BLOCK中PARAMETER的name',
`BLOCK_PARAMETER_DESC` VARCHAR(1000) COMMENT 'BLOCK中PARAMETER的descripition',
`BLOCK_PARAMETER_VALUE` VARCHAR(1000) COMMENT 'BLOCK中PARAMETER的value',
`BLOCK_PARAMETER_DEFAULT` VARCHAR(1000) COMMENT 'BLOCK中PARAMETER的DEFAULT',
`BLOCK_PARAMETER_DATATYPE` VARCHAR(1000) COMMENT 'BLOCK中PARAMETER的DATATYPE',
`BLOCK_PARAMETER_optional` BOOLEAN COMMENT '可选性',


`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_platform`.`BLOCK_PARAMETER` (`id`,`BLOCK_NAME`,`BLOCK_PARAMETER_KEY`,`BLOCK_PARAMETER_DESC`,`BLOCK_PARAMETER_VALUE`,`BLOCK_PARAMETER_DEFAULT`,`BLOCK_PARAMETER_DATATYPE`,`BLOCK_PARAMETER_optional`) VALUES 
('1','Verbauprüfung (Master)','Login-Code Anpasswerte','Standard-Login wird für das','Standard-Login','true','Boolean','0');





