#=====华丽的分割线===================================================
### 1.3 set IB3P_IB1_IB_DESCRIPTION

#IB3P_IB1_IB_DESCRIPTION_IB_VARIANTS
DROP TABLE IF EXISTS `IB3P_IB1_IB_DESCRIPTION_IB_VARIANTS`;
CREATE TABLE `IB3P_IB1_IB_DESCRIPTION_IB_VARIANTS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(100) COMMENT 'Med',
`PRODUCT_ID` VARCHAR(100) COMMENT 'Med',
`DESC` VARCHAR(2000) COMMENT '1EA.937.084.*',

`TE_responsible` VARCHAR(30) COMMENT 'TE负责人',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
#IB3P_IB1_IB_DESCRIPTION_OBJECTIVES
DROP TABLE IF EXISTS `IB3P_IB1_IB_DESCRIPTION_OBJECTIVES`;
CREATE TABLE `IB3P_IB1_IB_DESCRIPTION_OBJECTIVES`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`text` VARCHAR(200) COMMENT 'Verbauprüfung',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================

#IB3P_IB1_IB_DESCRIPTION_IBNZ
DROP TABLE IF EXISTS `IB3P_IB1_IB_DESCRIPTION_IBNZ`;
CREATE TABLE `IB3P_IB1_IB_DESCRIPTION_IBNZ`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IBNZ_ESTIMATION` VARCHAR(100) COMMENT '157.0',
`IBNZ_COMMITMENT` VARCHAR(100) COMMENT '157.0',
`REASON` VARCHAR(2000) COMMENT 'AN-FD wird noch nicht unterstützt',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
#IB3P_IB1_IB_DESCRIPTION_SLAVE
DROP TABLE IF EXISTS `IB3P_IB1_IB_DESCRIPTION_SLAVE`;
CREATE TABLE `IB3P_IB1_IB_DESCRIPTION_SLAVE`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(100) COMMENT '157.0',
`ECU_ID` VARCHAR(10) COMMENT '157.0',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
#========================================================
### 1.4 set IB3P_IB1_IB_DESCRIPTION_ENVIRONMENT

#IB3P_IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION
DROP TABLE IF EXISTS `IB3P_IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION`;
CREATE TABLE `IB3P_IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',


`kdRelevant` VARCHAR(20) COMMENT '例如true',
`pRelevant` VARCHAR(20) COMMENT '例如true',
`text` VARCHAR(1000) COMMENT 'Bordnetzspannungspegel ≥ 12 V, CAN Kommunikation, Kl. 15 aktiv (Klemmensteuerung berücksichtigen)',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
#IB3P_IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY
DROP TABLE IF EXISTS `IB3P_IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY`;
CREATE TABLE `IB3P_IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',


`text` VARCHAR(1000) COMMENT '例如Verbauänderung am Komfort CAN bzw. SubCAN',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',


`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================

DROP TABLE IF EXISTS `IB3P_IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION`;
CREATE TABLE `IB3P_IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(2000) COMMENT '例如SFD',
`DESC` VARCHAR(2000) COMMENT '例如Diagnose wird über SFD geschützt',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE`;
CREATE TABLE `IB3P_IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(2000) COMMENT '例如p_mode_parking_coordinator',
`DESC` VARCHAR(2000) COMMENT '例如PaCo: P_Mode ParkkoordinatorDeaktivierung',
`BYTE_0` VARCHAR(50) COMMENT '例如xxxxxxx1',
`BYTE_1` VARCHAR(50) COMMENT '例如xxxxxxxx',
`BYTE_2` VARCHAR(50) COMMENT '例如xxxxxxxx',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================

DROP TABLE IF EXISTS `IB3P_IB1_ENVIRONMENT_TRANSPORT_MODE`;
CREATE TABLE `IB3P_IB1_ENVIRONMENT_TRANSPORT_MODE`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`text` VARCHAR(5000) COMMENT '例如PaCo: P_Mode ParkkoordinatorDeaktivierung',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

### 1.5 set IB3P_IB1_PROCEDURES
#========================================================

# 1.5.1  IB3P_IB1_PROCEDURES_PROCEDURE
DROP TABLE IF EXISTS `IB3P_IB1_PROCEDURES_PROCEDURE`;
CREATE TABLE `IB3P_IB1_PROCEDURES_PROCEDURE`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`PROCEDURE_NAME` VARCHAR(100) COMMENT 'Inbetriebnahme_Ablauf',

`BLOCK_KD_relevant` VARCHAR(20) COMMENT '例如ture',
`BLOCK_P_relevant` VARCHAR(20) COMMENT '例如ture',
`BLOCK_optional` VARCHAR(20) COMMENT '例如ture',
`BLOCK_shortname` VARCHAR(50) COMMENT '例如UnlockSfd',
`BLOCK_standardIBNB` VARCHAR(20) COMMENT '例如ture',
`BLOCK_version` VARCHAR(20) COMMENT '例如1',
`BLOCK_NAME` VARCHAR(100) COMMENT '例如SFD freischalten',
`BLOCK_NAME_EN` VARCHAR(100) COMMENT '例如SFD unlock',
`BLOCK_DESC` VARCHAR(8000) COMMENT '例如Der Schutz der Fahrzeugdiagnose (SFD) wird ',
#`BLOCK_TIS_TI_TI` VARCHAR(100) COMMENT '例如SER00098',
#`BLOCK_CATEGORY` VARCHAR(100) COMMENT '例如Inbetriebnahme (konstruktiv bedingt)',
`BLOCK_TAGS_TAG` VARCHAR(1000) COMMENT '例如IBNZ VSI_Wert aus Gateway MQB37W',
`BLOCK_AREA` VARCHAR(100) COMMENT '例如No Recommendation',
`BLOCK_LOGICAL_LINK` VARCHAR(50) COMMENT '例如GatewUDS',
`BLOCK_LAS` VARCHAR(200) COMMENT '例如GatewUDS',


`BLOCK_CONDITIONS_DEPENDENCIES` VARCHAR(5000) COMMENT '例如false',
`BLOCK_CONDITIONS_BUILDUP_CONDITIONS` VARCHAR(1000) COMMENT '例如false',

`BLOCK_CONDITIONS_GENERAL_CONDITIONS` VARCHAR(1000) COMMENT '例如false',
`BLOCK_CONDITIONS_RESSOURCES` VARCHAR(1000) COMMENT '例如false',

`BLOCK_CONDITIONS_MISCELLANEOUS` VARCHAR(1000) COMMENT '例如false',
`BLOCK_CONDITIONS_MANUAL_OPERATIONS` VARCHAR(1000) COMMENT '例如false',
`BLOCK_POLLINTERVALL` VARCHAR(200) COMMENT '例如xxx',
`BLOCK_TIMEOUT` VARCHAR(200) COMMENT '例如xxx',
`BLOCK_IBNZ_VSI` VARCHAR(100) COMMENT '例如0.312',
`BLOCK_IBNZ_VSI_VERIFIED` VARCHAR(100) COMMENT '例如0.312',


`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================

DROP TABLE IF EXISTS `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER`;
CREATE TABLE `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER`(

`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`BLOCK_NAME` VARCHAR(100) COMMENT '例如SFD freischalten',

`BLOCK_PARAMETERS_PARAMETER_optional` VARCHAR(20) COMMENT '例如ture',
`BLOCK_PARAMETERS_PARAMETER_KEY` VARCHAR(100) COMMENT '例如Aufstartzeit',
`BLOCK_PARAMETERS_PARAMETER_DESC` VARCHAR(2000) COMMENT '例如Aufstartzeit in Sekunden',
`BLOCK_PARAMETERS_PARAMETER_DATATYPE` VARCHAR(100) COMMENT '例如Integer',
`BLOCK_PARAMETERS_PARAMETER_VALUE` VARCHAR(100) COMMENT '例如&lt;1',
`BLOCK_PARAMETERS_PARAMETER_DEFAULT` VARCHAR(50) COMMENT '例如2',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',


`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP`;
CREATE TABLE `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP`(

`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`BLOCK_NAME` VARCHAR(100) COMMENT '例如SFD freischalten',

#`cyclic` VARCHAR(20) COMMENT '例如false',
`STEP_NAME` VARCHAR(100) COMMENT '例如VW/Audi_Teilenummer lesen',
`STEP_DESC` VARCHAR(2000) COMMENT '例如Fuer die Ermittlung des Herstellercodes (HSC)',
`STEP_DIAG_SERVICE_IDENTIFIER` VARCHAR(100) COMMENT '例如SERVICE_IDENTIFIER',
`STEP_DIAG_SERVICE_LONG_NAME` VARCHAR(100) COMMENT '例如Read Data By Identifier / ECU Identification',
`STEP_DIAG_SERVICE_SHORT_NAME` VARCHAR(100) COMMENT '例如DiagnServi_ReadDataByIdentECUIdent',

`STEP_DIAG_PARAMETERS_DATA_IDENTIFIER` VARCHAR(20) COMMENT '例如F187',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS`;
CREATE TABLE `IB3P_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS`(

`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`BLOCK_NAME` VARCHAR(100) COMMENT '例如SFD freischalten',
`STEP_NAME` VARCHAR(100) COMMENT '例如VW/Audi_Teilenummer lesen',

`DIAG_PARAMETER_LONG_NAME` VARCHAR(100) COMMENT '例如Record Data Identifier',
`DIAG_PARAMETER_SHORT_NAME` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_MESSAGE_TYPE` VARCHAR(100) COMMENT '例如REQUEST',
`DIAG_PARAMETER_RESPONSE_SHORT_NAME` VARCHAR(100) COMMENT '例如Resp_ReadDataByIdentECUIdent',
`DIAG_PARAMETER_PATH` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_DATATYPE` VARCHAR(100) COMMENT '例如eTEXTTABLE',
`DIAG_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '例如VW Spare Part Number',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
### 1.6 set IB3P_IB1_BZD

DROP TABLE IF EXISTS `IB3P_IB1_BZD`;
CREATE TABLE `IB3P_IB1_BZD`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`S42_ATTRIBUTES_ADDED` VARCHAR(20) COMMENT '例如false',
`IDENTS_IDENT_NAME` VARCHAR(100) COMMENT '例如TBD',
`IDENTS_IDENT_S42_ATTRIBUTE` VARCHAR(100) COMMENT '例如TBD',
`IDENTS_IDENT_BGONLINE` VARCHAR(100) COMMENT '例如TBD',
`IDENTS_IDENT_DID` VARCHAR(100) COMMENT '例如TBD',
`TARGET_DATE` VARCHAR(20) COMMENT '例如31.08.2018',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================

DROP TABLE IF EXISTS `IB3P_IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT`;
CREATE TABLE `IB3P_IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(1000) COMMENT '例如Zusatzschaltplan',
`VERSION` VARCHAR(50) COMMENT '例如TBD',
`DESC` VARCHAR(2000) COMMENT 'Ein defektes Ambientelichtelement kann derzeit nicht mit eindeutiger ',

`FILE_SYSTEM` VARCHAR(100) COMMENT 'System42',
`URL` VARCHAR(500) COMMENT 'https://iproject3.wob.vw.vwg/vw',
`SPARE_PART_NUMBER` VARCHAR(200) COMMENT 'TLD.011.179.B0',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC`;
CREATE TABLE `IB3P_IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`DTC_TI` VARCHAR(50) COMMENT 'C117554',
`DFCC_TEXT` VARCHAR(1000) COMMENT 'Matrix high beam left no basic setting',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_SECURITY_PROPERTIES_ECU`;
CREATE TABLE `IB3P_IB1_SECURITY_PROPERTIES_ECU`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`NAME` VARCHAR(50) COMMENT 'ICAS1 host',
`ECU_ID` VARCHAR(1000) COMMENT 'Matrix high beam left no basic setting',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB3P_IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY`;
CREATE TABLE `IB3P_IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`optional` VARCHAR(50) COMMENT 'false',
`KEY` VARCHAR(100) COMMENT 'KS-Generation',
`DESC` VARCHAR(2000) COMMENT 'individuelles Startgeheimnis',
`VALUE` VARCHAR(50) COMMENT 'false',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
# IB3P_IB1 part number table
DROP TABLE IF EXISTS `IB3P_IB1_TNR`;
CREATE TABLE `IB3P_IB1_TNR`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB3P_VERSION` VARCHAR(50) COMMENT '0_26',

`IB1_VERSION` VARCHAR(50) COMMENT '1.7',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB1_TNR_filename` VARCHAR(100) COMMENT 'IB1_0008_Klima_MQB_AB_V5_2.tnr',

`PROJECT` VARCHAR(50) COMMENT 'VW37X/0_EU',
`PRODUCT_ID` VARCHAR(20) COMMENT '5G0',
`VEHICLE` VARCHAR(50) COMMENT 'A7 Golf',
`ODX_PLATFORM` VARCHAR(50) COMMENT 'VW37X',
`PART_NUMBER` VARCHAR(50) COMMENT '5G0.907.044.EP',

`responsible` VARCHAR(30) COMMENT '负责人',
`IB3P_Draft_Release` VARCHAR(50) COMMENT 'DR_1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'OR_1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


