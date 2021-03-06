#数字化工艺系统IB2P数据库

# set table IB2P
DROP TABLE IF EXISTS `IB2P_Basic`;
CREATE TABLE `IB2P_Basic`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2P_RELEASE_DATE` VARCHAR(20) COMMENT '21.01.2021',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_DOC_INFO_CONTACTS`;
CREATE TABLE `IB2P_DOC_INFO_CONTACTS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(50) COMMENT 'Erik Hartmann',
`COMPANY` VARCHAR(50) COMMENT 'Volkswagen AG',
`DEPARTMENT` VARCHAR(50) COMMENT 'EESD/3',
`ROLE` VARCHAR(50) COMMENT 'Bauteilentwickler',
`PHONE` VARCHAR(50) COMMENT '+49_5361_9_13492',
`MOBILE_PHONE` VARCHAR(50) COMMENT '+49-160-9-0832716',
`MAIL` VARCHAR(100) COMMENT 'Erik.Hartmann@volkswagen.de',
`USER_ID` VARCHAR(50) COMMENT 'DL60RJS',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_DOC_INFO_DOC_REVISIONS`;
CREATE TABLE `IB2P_DOC_INFO_DOC_REVISIONS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`VERSION` VARCHAR(50)  COMMENT '0_1_DRAFT_1',
`DATE` VARCHAR(20)  COMMENT '23.08.2018',
`CHANGE` VARCHAR(1000) COMMENT 'Ersterstellung',
`TOOL` VARCHAR(50) COMMENT '例如IPPP_V4',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB2P_IB_DESCRIPTION`;
CREATE TABLE `IB2P_IB_DESCRIPTION`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB_VARIANTS_IB_VARIANT_NAME` VARCHAR(100) COMMENT 'Med',
`IB_VARIANTS_IB_VARIANT_DESC` VARCHAR(1000) COMMENT '1EA.937.084.*',

`ADDITIONAL_IB_VARIANTS_IB_VARIANT_NAME` VARCHAR(100) COMMENT 'mit Frontscheibenheizung',
`ADDITIONAL_IB_VARIANTS_IB_VARIANT_DESC` VARCHAR(1000) COMMENT 'XXX',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_PROCEDURE_IB_1_BLOCK`;
CREATE TABLE `IB2P_PROCEDURES_PROCEDURE_IB_1_BLOCK`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(100) COMMENT 'Inbetriebnahme-Ablauf',

`optional` VARCHAR(10) COMMENT '例如ture',
`ADDITIONAL_DESC` VARCHAR(10000) COMMENT '例如erforderlich für Übernahme der HMI-Defaul',
`AREA` VARCHAR(500) COMMENT '例如No Recommendation',
`LAS` VARCHAR(100) COMMENT 'Auswertung VKV1 = "J"',
`ADDITIONAL_CONDITIONS_RESSOURCES` VARCHAR(100) COMMENT 'Kalibriertafel, FAS-Einstellstand.',
`ADDITIONAL_CONDITIONS_MISCELLANEOUS` VARCHAR(100) COMMENT 'Frühstmöglicher Zeitpunkt! Abkoppelzeit m',
`ADDITIONAL_CONDITIONS_GENERAL_OPTIONS` VARCHAR(100) COMMENT 'Fahrzeug komplett aufgebaut und i.',
`ADDITIONAL_CONDITIONS_MANUAL_OPTIONS` VARCHAR(100) COMMENT 'ture',
`IBNZ_VSI` VARCHAR(100) COMMENT '15.0',
`ADDITIONAL_TAGS_TAG` VARCHAR(100) COMMENT 'IBNZ aus SG-Einzeltest BCM37 VW483',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_PROCEDURE_IB_1_SWITCH`;
CREATE TABLE `IB2P_PROCEDURES_PROCEDURE_IB_1_SWITCH`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB_1_CASE_IB_1_BLOCKS_AREA` VARCHAR(100) COMMENT 'No Recommendation',
`IB_1_CASE_IB_1_BLOCKS_ADDITIONAL_CONDITIONS_RESSOURCES` VARCHAR(100) COMMENT 'tmöglicher Zeitpunkt! ',
`IB_1_CASE_IB_1_BLOCKS_ADDITIONAL_CONDITIONS_MISCELLANEOUS` VARCHAR(100) COMMENT 'Frühscher Zeitpunkt! ',
`IB_1_CASE_IB_1_BLOCKS_ADDITIONAL_CONDITIONS_GENERAL_OPTIONS` VARCHAR(100) COMMENT 'Frühstmöglichepunkt! ',
`IB_1_CASE_IB_1_BLOCKS_ADDITIONAL_CONDITIONS_MANUAL_OPERATIONS` VARCHAR(100) COMMENT 'false',
`IB_1_CASE_IB_1_BLOCKS_IBNZ_VSI` VARCHAR(100) COMMENT '1.0',
`IB_1_CASE_IB_1_BLOCKS_IBNZ_SERIES` VARCHAR(100) COMMENT '0.15',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK`;
CREATE TABLE `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`KD_relevant` VARCHAR(50) COMMENT '例如ture',
`P_relevant` VARCHAR(50) COMMENT '例如ture',
`optional` VARCHAR(50) COMMENT '例如ture',
`standardIBNB` VARCHAR(50) COMMENT '例如ture',
`IB_2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',
`DESC` VARCHAR(1000) COMMENT 'Die Abhaengingkeit zum Fahrzeuggeschwindikeitssignal und zur Stell',
`CATEGORY` VARCHAR(100) COMMENT 'Absicherung Montage',
`TAGS_TAG` VARCHAR(1000) COMMENT 'IBNZ: 0,05s, Messung ',
`AREA` VARCHAR(100) COMMENT 'No Recommendation',
`LOGICAL_LINK` VARCHAR(100) COMMENT 'CentrElectUDS',
`CONDITONS_GENERAL_CONDITIONS` VARCHAR(1000) COMMENT 'Batteriesensor verbaut und gesteckt, ZDC ',
`CONDITONS_MANUAL_OPERATIONS` VARCHAR(1000) COMMENT 'false',
`IBNZ_VSI` VARCHAR(1000) COMMENT 'false',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK_STEPS_STEP`;
CREATE TABLE `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK_STEPS_STEP`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',
`IB_2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',

`STEP_cyclic` VARCHAR(20) COMMENT 'ture',
`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',
`STEP_DESC` VARCHAR(1000) COMMENT 'Heckklappe ueber',
`STEP_TIS_TI` VARCHAR(100) COMMENT 'SER00069',
`STEP_TIME_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '500 ms',

`STEP_DIAG_SERVICE_IDENTIFIER` VARCHAR(100) COMMENT '22',
`STEP_DIAG_SERVICE_LONG_NAME` VARCHAR(100) COMMENT 'Read Data By Identifier / Measurement Value',
`STEP_DIAG_SERVICE_SHORT_NAME` VARCHAR(100) COMMENT 'DiagnServi_ReadDataByIdentMeasuValue',

`STEP_DIAG_PARAMETERS_DATA_IDENTIFIER` VARCHAR(20) COMMENT '5037',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK_STEPS_STEP_DIAG_PARAMETERS`;
CREATE TABLE `IB2P_PROCEDURES_PROCEDURE_IB_2_BLOCK_STEPS_STEP_DIAG_PARAMETERS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB_2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',
`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',

`DIAG_PARAMETER_LONG_NAME` VARCHAR(100) COMMENT '例如Record Data Identifier',
`DIAG_PARAMETER_SHORT_NAME` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_MESSAGE_TYPE` VARCHAR(100) COMMENT '例如REQUEST',
`DIAG_PARAMETER_RESPONSE_SHORT_NAME` VARCHAR(100) COMMENT '例如Resp_ReadDataByIdentECUIdent',
`DIAG_PARAMETER_PATH` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_DATATYPE` VARCHAR(100) COMMENT '例如eTEXTTABLE',
`DIAG_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '例如VW Spare Part Number',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;