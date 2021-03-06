CREATE DATABASE PLEE_Cloud_Diagnose CHARACTER SET utf8 COLLATE utf8_general_ci;
USE PLEE_Cloud_Diagnose;

DROP TABLE IF EXISTS `VBV`;

CREATE TABLE `VBV`(
`VBV_ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'VBV_ID，是主键，唯一的',
`VBV_Name` VARCHAR(50) NOT NULL COMMENT 'VBV名字',
`Version` INT(4) NOT NULL COMMENT 'VBV版本',
`User` VARCHAR(50) NOT NULL COMMENT '用户',
`Time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(`VBV_ID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================

DROP TABLE IF EXISTS `ECU`;

CREATE TABLE `ECU`(
`ECU_ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`VBV_ID` INT(11) NOT NULL COMMENT 'VBV_ID，与VBV表中ID一致',
`Diag_M` VARCHAR(6) NOT NULL COMMENT '主控制器诊断地址',
`Diag_S` VARCHAR(6) NOT NULL COMMENT '从控制器诊断地址',
`ECU_Name` VARCHAR(15) NOT NULL COMMENT '控制器名字',
`M_or_S` VARCHAR(10) NOT NULL COMMENT 'Master或Slave',
`ECU_M` VARCHAR(15) NOT NULL COMMENT '该控制器的主控制器',
`Login_Code` VARCHAR(10) NOT NULL COMMENT '控制器登陆码',
`ZDC_Sequence` VARCHAR(30) NOT NULL COMMENT 'ZDC编码顺序',
`PRN` VARCHAR(2000) NOT NULL COMMENT 'PR号',
`TNR` VARCHAR(20) NOT NULL COMMENT '控制器零件号',
`HW_V` VARCHAR(10) NOT NULL COMMENT '控制器硬件版本',
`SW_V` VARCHAR(10) NOT NULL COMMENT '控制器软件版本',
`ZDC_File` VARCHAR(200) NOT NULL COMMENT 'ZDC文件名',
`Flash_File` VARCHAR(200) NOT NULL COMMENT '刷新Flash文件名',
`Wait_Time` INT(4) NOT NULL DEFAULT 5000 COMMENT '等待时间',
`Addre_Lengt_Forma_Ident` VARCHAR(2) NOT NULL DEFAULT '44' COMMENT '未知',
`CKD` VARCHAR(10) NOT NULL COMMENT 'CKD还是LC',
`ZdcOK` VARCHAR(1) NOT NULL DEFAULT 'O' COMMENT 'ZDC合格否',
`FLOk` VARCHAR(1) NOT NULL DEFAULT 'O' COMMENT '刷新合格否',
`SecurityOK` VARCHAR(1) NOT NULL DEFAULT 'O' COMMENT '安全登录合格否',
`Basic_Setting` VARCHAR(1) NOT NULL DEFAULT 'O' COMMENT '基础设置合格否',
PRIMARY KEY(`ECU_ID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================

DROP TABLE IF EXISTS `Vehicle`;

CREATE TABLE `Vehicle`(
`Vin` VARCHAR(20) NOT NULL COMMENT '底盘号，主键',
`PRN` VARCHAR(2000) NOT NULL COMMENT 'PR号',
`Production_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生产时间',
`Handover_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '交付时间',

PRIMARY KEY(`Vin`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================

DROP TABLE IF EXISTS `Operation_Vehicle`;
CREATE TABLE `Operation_Vehicle`(
`Operation_ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`VBV_ID` INT(11) NOT NULL COMMENT 'VBV_ID，与VBV表中ID一致',
`User` VARCHAR(50) NOT NULL COMMENT '用户',
`Time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`Operation` VARCHAR(100) NOT NULL COMMENT '操作动作',
`Vin` VARCHAR(20) NOT NULL COMMENT '底盘号',
`Ecu` VARCHAR(20) NOT NULL COMMENT '操作对象',
`Result` VARCHAR(10) NOT NULL DEFAULT 'ok' COMMENT '结果',
`Comment` VARCHAR(1000) NOT NULL COMMENT '操作描述',
PRIMARY KEY(`Operation_ID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================

DROP TABLE IF EXISTS `Operation_File`;
CREATE TABLE `Operation_File`(
`Operation_ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`User` VARCHAR(50) NOT NULL COMMENT '用户',
`Time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`File_Name` VARCHAR(100) NOT NULL COMMENT '文件名称',
`Comment` VARCHAR(1000) NOT NULL COMMENT '操作描述',
PRIMARY KEY(`Operation_ID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================

DROP TABLE IF EXISTS `Report`;
CREATE TABLE `Report`(
`Report_ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`User` VARCHAR(20) NOT NULL COMMENT '用户',
`Time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`Vin` VARCHAR(20) NOT NULL COMMENT '底盘号',
`Path` VARCHAR(500) NOT NULL COMMENT '报告存储路径',
PRIMARY KEY(`Report_ID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
