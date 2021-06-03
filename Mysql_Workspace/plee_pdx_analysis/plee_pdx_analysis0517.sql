CREATE DATABASE PLEE_PDX_ANALYSIS CHARACTER SET utf8 COLLATE utf8_general_ci;
USE PLEE_PDX_ANALYSIS;

DROP TABLE IF EXISTS `Pdx_List`;

CREATE TABLE `Pdx_List`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`NamePdx` VARCHAR(200) COMMENT 'VW48X-CN_2020-10-09_2_64_P_r.pdx',
`CarType` VARCHAR(50) COMMENT 'VW48X',
`UploadTime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '上传时间',
`Status` VARCHAR(50) NOT NULL DEFAULT 'zipped' COMMENT 'VW48X',

PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================
DROP TABLE IF EXISTS `Canlog_List`;

CREATE TABLE `Canlog_List`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`Canlog_Name` VARCHAR(200) COMMENT '0b000002_VCI5.log',
`CarType` VARCHAR(50) COMMENT 'VW48X',
`UploadTime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '上传时间',
`Status` VARCHAR(50) NOT NULL DEFAULT 'unparsed' COMMENT 'unparsed',
`EcuTableStatus` VARCHAR(50) NOT NULL DEFAULT 'not created' COMMENT 'not created',

PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
============================================================================================
DROP TABLE IF EXISTS `Ecu_List`;

CREATE TABLE `Ecu_List`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`CanId` VARCHAR(20) COMMENT '7e0',
`NameECU` VARCHAR(50) COMMENT 'MOT',
`Canlog_Name` VARCHAR(200) COMMENT '0b000002_VCI5.log',
`NameBV` VARCHAR(200) COMMENT 'BV_EnginContrModul1UDS',
`NameEV` VARCHAR(200) COMMENT 'EV_ECM20TFS0203VD906259A_001002.odx',
`Status` VARCHAR(50) NOT NULL DEFAULT 'unparsed' COMMENT 'unparsed',
`ParsedTime` VARCHAR(100) DEFAULT NULL COMMENT '时间',

PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

============================================================================================
SELECT 

pl.NamePdx,
pl.CarType,
pl.UploadTime,
pl.Status,

cl.Canlog_Name,
cl.CarType,
cl.UploadTime,
cl.Status,
cl.EcuTableStatus,

el.CanId,
el.NameECU,
el.Canlog_Name,
el.NameBV,
el.NameEV,
el.Status,
el.ParsedTime

FROM Pdx_List AS pl
INNER JOIN Canlog_List AS cl
ON pl.CarType = cl.CarType
INNER JOIN Ecu_List AS el
ON cl.Canlog_Name = el.Canlog_Name




