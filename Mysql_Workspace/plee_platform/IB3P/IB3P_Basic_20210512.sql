# establish IB3P Database

# set IB3P_Basic table
DROP TABLE IF EXISTS `IB3P_Basic`;
CREATE TABLE `IB3P_Basic`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_NAME` VARCHAR(50) COMMENT 'VW316_6CN_B',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',
`IB3P_DATE` VARCHAR(50) COMMENT '16.10.2020',
`IB3P_CHANGE` VARCHAR(1000) COMMENT 'Infotainment SGte Validiert',
`IB3P_TOOL` VARCHAR(50) COMMENT 'IPPP_V4',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
### set IB3P_DOC_INFO(include CONTACTS and REVISIONS)
DROP TABLE IF EXISTS `IB3P_DOC_INFO_CONTACTS`;
CREATE TABLE `IB3P_DOC_INFO_CONTACTS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB3P_NAME` VARCHAR(100) COMMENT 'VW316_6CN_B',
`IB3P_SG_NAME` VARCHAR(100) COMMENT '0009 - Elektronische Zentralelektrik_SAM_MEB',


`NAME` VARCHAR(50) COMMENT 'Erik Hartmann',
`COMPANY` VARCHAR(50) COMMENT 'Volkswagen AG',
`DEPARTMENT` VARCHAR(50) COMMENT 'EESD/3',
`ROLE` VARCHAR(50) COMMENT 'Bauteilentwickler',
`PHONE` VARCHAR(50) COMMENT '+49_5361_9_13492',
`MOBILE_PHONE` VARCHAR(50) COMMENT '+49-160-9-0832716',
`MAIL` VARCHAR(100) COMMENT 'Erik.Hartmann@volkswagen.de',
`USER_ID` VARCHAR(100) COMMENT 'VWA4JZ5',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',


`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB3P_DOC_INFO_DOC_REVISIONS`;
CREATE TABLE `IB3P_DOC_INFO_DOC_REVISIONS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB3P_NAME` VARCHAR(100) COMMENT 'VW316_6CN_B',
`IB3P_SG_NAME` VARCHAR(100) COMMENT '0009 - Elektronische Zentralelektrik_SAM_MEB',

`VERSION` VARCHAR(20)  COMMENT '1_0',
`DATE` VARCHAR(20)  COMMENT '07.08.2018',
`CHANGE` VARCHAR(1000) COMMENT 'Erstbefüllung',
`TOOL` VARCHAR(50) COMMENT '例如IPPP_V4',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

