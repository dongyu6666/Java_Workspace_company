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
`IB2P_filename` VARCHAR(200) COMMENT '21.01.2021',


`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

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
`COMPANY` VARCHAR(500) COMMENT 'Volkswagen AG',
`DEPARTMENT` VARCHAR(500) COMMENT 'EESD/3',
`ROLE` VARCHAR(500) COMMENT 'Bauteilentwickler',
`PHONE` VARCHAR(50) COMMENT '+49_5361_9_13492',
`MOBILE_PHONE` VARCHAR(50) COMMENT '+49-160-9-0832716',
`MAIL` VARCHAR(100) COMMENT 'Erik.Hartmann@volkswagen.de',
`USER_ID` VARCHAR(50) COMMENT 'DL60RJS',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

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

`VERSION` VARCHAR(100)  COMMENT '0_1_DRAFT_1',
`DATE` VARCHAR(20)  COMMENT '23.08.2018',
`CHANGE` VARCHAR(8000) COMMENT 'Ersterstellung',
`TOOL` VARCHAR(500) COMMENT '例如IPPP_V4',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

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
`IB_VARIANTS_IB_VARIANT_DESC` VARCHAR(5000) COMMENT '1EA.937.084.*',

`ADDITIONAL_IB_VARIANTS_IB_VARIANT_NAME` VARCHAR(100) COMMENT 'mit Frontscheibenheizung',
`ADDITIONAL_IB_VARIANTS_IB_VARIANT_DESC` VARCHAR(5000) COMMENT 'XXX',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB1_BLOCK`;
CREATE TABLE `IB2P_PROCEDURES_IB1_BLOCK`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`PROCEDURE_NAME` VARCHAR(100) COMMENT 'Inbetriebnahme-Ablauf',
`IB1_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB1_BLOCK_import_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',


`optional` VARCHAR(10) COMMENT '例如ture',
`ADDITIONAL_DESC` VARCHAR(10000) COMMENT '例如erforderlich für Übernahme der HMI-Defaul',
`AREA` VARCHAR(1000) COMMENT '例如No Recommendation',
`LAS` VARCHAR(200) COMMENT 'Auswertung VKV1 = "J"',

`ADDITIONAL_CONDITIONS_DEPENDENCIES` VARCHAR(1000) COMMENT '例如false',
`ADDITIONAL_CONDITIONS_BUILDUP_CONDITIONS` VARCHAR(1000) COMMENT '例如false',
`ADDITIONAL_CONDITIONS_GENERAL_OPTIONS` VARCHAR(1000) COMMENT 'Fahrzeug komplett aufgebaut und i.',
`ADDITIONAL_CONDITIONS_RESSOURCES` VARCHAR(1000) COMMENT 'Kalibriertafel, FAS-Einstellstand.',
`ADDITIONAL_CONDITIONS_MISCELLANEOUS` VARCHAR(1000) COMMENT 'Frühstmöglicher Zeitpunkt! Abkoppelzeit m',
`ADDITIONAL_CONDITIONS_MANUAL_OPTIONS` VARCHAR(1000) COMMENT 'ture',

`IBNZ_VSI` VARCHAR(100) COMMENT '15.0',
`ADDITIONAL_TAGS_TAG` VARCHAR(100) COMMENT 'IBNZ aus SG-Einzeltest BCM37 VW483',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB1_SWITCH`;
CREATE TABLE `IB2P_PROCEDURES_IB1_SWITCH`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB1_SWITCH_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB1_SWITCH_import_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`IB1_SWITCH_IB1_CASE_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB1_SWITCH_IB1_CASE_import_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',


`IB1_SWITCH_IB1_CASE_IB1_BLOCKS_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB1_SWITCH_IB1_CASE_IB1_BLOCKS_import_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`IB1_CASE_IB1_BLOCKS_optional` VARCHAR(100) COMMENT 'false',

`IB1_CASE_IB1_BLOCKS_AREA` VARCHAR(100) COMMENT 'No Recommendation',
`IB1_CASE_IB1_BLOCKS_LAS` VARCHAR(100) COMMENT 'false',


`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_DEPENDENCIES` VARCHAR(100) COMMENT 'tmöglicher Zeitpunkt! ',
`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_BUILDUP_CONDITIONS` VARCHAR(100) COMMENT 'tmöglicher Zeitpunkt! ',
`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_GENERAL_OPTIONS` VARCHAR(100) COMMENT 'Frühstmöglichepunkt! ',
`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_RESSOURCES` VARCHAR(100) COMMENT 'tmöglicher Zeitpunkt! ',
`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_MISCELLANEOUS` VARCHAR(100) COMMENT 'Frühscher Zeitpunkt! ',
`IB1_CASE_IB1_BLOCKS_ADDITIONAL_CONDITIONS_MANUAL_OPERATIONS` VARCHAR(100) COMMENT 'false',


`IB1_CASE_IB1_BLOCKS_IBNZ_VSI` VARCHAR(100) COMMENT '1.0',
`IB1_CASE_IB1_BLOCKS_IBNZ_SERIES` VARCHAR(100) COMMENT '0.15',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_BLOCK`;
CREATE TABLE `IB2P_PROCEDURES_IB2_BLOCK`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`KD_relevant` VARCHAR(50) COMMENT '例如ture',
`P_relevant` VARCHAR(50) COMMENT '例如ture',
`IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`optional` VARCHAR(50) COMMENT '例如ture',
`standardIBNB` VARCHAR(50) COMMENT '例如ture',
`IB2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',
`DESC` VARCHAR(5000) COMMENT 'Die Abhaengingkeit zum Fahrzeuggeschwindikeitssignal und zur Stell',
`CATEGORY` VARCHAR(100) COMMENT 'Absicherung Montage',
`TAGS_TAG` VARCHAR(1000) COMMENT 'IBNZ: 0,05s, Messung ',
`AREA` VARCHAR(100) COMMENT 'No Recommendation',
`LOGICAL_LINK` VARCHAR(100) COMMENT 'CentrElectUDS',

`CONDITONS_DEPENDENCIES` VARCHAR(1000) COMMENT 'false',
`CONDITONS_BUILDUP_CONDITIONS` VARCHAR(1000) COMMENT 'false',
`CONDITONS_GENERAL_OPTIONS` VARCHAR(1000) COMMENT 'false',
`CONDITONS_RESSOURCES` VARCHAR(1000) COMMENT 'false',
`CONDITONS_MISCELLANEOUS` VARCHAR(1000) COMMENT 'Batteriesensor verbaut und gesteckt, ZDC ',
`CONDITONS_MANUAL_OPERATIONS` VARCHAR(1000) COMMENT 'false',

`IBNZ_VSI` VARCHAR(1000) COMMENT 'false',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_BLOCK_STEPS`;
CREATE TABLE `IB2P_PROCEDURES_IB2_BLOCK_STEPS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',
`IB2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',
`IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`STEP_cyclic` VARCHAR(20) COMMENT 'ture',
`STEP_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',
`STEP_DESC` VARCHAR(5000) COMMENT 'Heckklappe ueber',
`STEP_TIS_TI` VARCHAR(100) COMMENT 'SER00069',
`STEP_TIME_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '500 ms',

`STEP_DIAG_SERVICE_IDENTIFIER` VARCHAR(100) COMMENT '22',
`STEP_DIAG_SERVICE_LONG_NAME` VARCHAR(100) COMMENT 'Read Data By Identifier / Measurement Value',
`STEP_DIAG_SERVICE_SHORT_NAME` VARCHAR(100) COMMENT 'DiagnServi_ReadDataByIdentMeasuValue',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_BLOCK_STEPS_DIAG_PARAMETERS`;
CREATE TABLE `IB2P_PROCEDURES_IB2_BLOCK_STEPS_DIAG_PARAMETERS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_BLOCK_NAME` VARCHAR(200) COMMENT 'Wertschoepfungspruefung Heckklappenentriegelung aussen',
`IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`STEP_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',


`DIAG_PARAMETERS_DATA_IDENTIFIER` VARCHAR(20) COMMENT '5037',

`DIAG_PARAMETER_LONG_NAME` VARCHAR(100) COMMENT '例如Record Data Identifier',
`DIAG_PARAMETER_SHORT_NAME` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_MESSAGE_TYPE` VARCHAR(100) COMMENT '例如REQUEST',
`DIAG_PARAMETER_RESPONSE_SHORT_NAME` VARCHAR(100) COMMENT '例如Resp_ReadDataByIdentECUIdent',
`DIAG_PARAMETER_PATH` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_DATATYPE` VARCHAR(100) COMMENT '例如eTEXTTABLE',
`DIAG_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '例如VW Spare Part Number',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_SWITCH`;
CREATE TABLE `IB2P_PROCEDURES_IB2_SWITCH`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_IB2_CASE_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_NAME` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_KD_relevant` VARCHAR(100) COMMENT 'true',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_P_relevant` VARCHAR(100) COMMENT 'true',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_optional` VARCHAR(100) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_standardIBNB` VARCHAR(100) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_NAME` VARCHAR(100) COMMENT 'xxx',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_DESC` VARCHAR(2000) COMMENT 'xxx',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_AUTHOR_REF` VARCHAR(100) COMMENT 'uuid_0c997d3a-f9bf-4409-816b-51277341b7da',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CATEGORY` VARCHAR(200) COMMENT 'Absicherung Montage',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_TAGS_TAG` VARCHAR(1000) COMMENT 'Absicherung Montage',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_AREA` VARCHAR(1000) COMMENT 'No Recommendation',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_LOGICAL_LINK` VARCHAR(1000) COMMENT 'CentrElectUDS',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_BLOCK_DEPENDENCIES_BLOCK_REF` VARCHAR(100) COMMENT 'xxx',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_DEPENDENCIES` VARCHAR(200) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_BUILDUP_CONDITIONS` VARCHAR(200) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_GENERAL_OPTIONS` VARCHAR(200) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_RESSOURCES` VARCHAR(200) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_MISCELLANEOUS` VARCHAR(200) COMMENT 'false',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_CONDITIONS_MANUAL_OPERATIONS` VARCHAR(100) COMMENT 'false',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_IBNZ_VSI` VARCHAR(100) COMMENT '6.0',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_VARIANTS_VARIANT_REF` VARCHAR(100) COMMENT 'uuid_0c997d3a-f9bf-4409-816b-51277341b7da',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_SWITCH_STEPS`;
CREATE TABLE `IB2P_PROCEDURES_IB2_SWITCH_STEPS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_IB2_CASE_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_NAME` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_NAME` VARCHAR(100) COMMENT 'xxx',

`STEP_cyclic` VARCHAR(20) COMMENT 'ture',
`STEP_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',
`STEP_DESC` VARCHAR(5000) COMMENT 'Heckklappe ueber',
`STEP_TIS_TI` VARCHAR(100) COMMENT 'SER00069',
`STEP_TIME_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '500 ms',

`STEP_DIAG_SERVICE_IDENTIFIER` VARCHAR(100) COMMENT '22',
`STEP_DIAG_SERVICE_LONG_NAME` VARCHAR(100) COMMENT 'Read Data By Identifier / Measurement Value',
`STEP_DIAG_SERVICE_SHORT_NAME` VARCHAR(100) COMMENT 'DiagnServi_ReadDataByIdentMeasuValue',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#========================================================
DROP TABLE IF EXISTS `IB2P_PROCEDURES_IB2_SWITCH_STEPS_DIAG_PARAMETERS`;
CREATE TABLE `IB2P_PROCEDURES_IB2_SWITCH_STEPS_DIAG_PARAMETERS`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',

`platform_name` VARCHAR(20) COMMENT 'MEB',
`IB2P_VERSION` VARCHAR(50) COMMENT '0_24',
`diagnose_adr` VARCHAR(6) COMMENT '0009',
`IB2P_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_NAME` VARCHAR(100) COMMENT 'SAM_MEB',

`IB2_SWITCH_IB2_CASE_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_NAME` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',

`IB2_SWITCH_IB2_CASE_IB2_BLOCK_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`IB2_SWITCH_IB2_CASE_IB2_BLOCK_NAME` VARCHAR(100) COMMENT 'xxx',

`STEP_id` VARCHAR(100) COMMENT 'uuid_8928f75e-be15-4366-aad6-545a2c53b876',
`STEP_NAME` VARCHAR(200) COMMENT 'Messwert pruefen',

`DIAG_PARAMETERS_DATA_IDENTIFIER` VARCHAR(20) COMMENT '5037',

`DIAG_PARAMETER_LONG_NAME` VARCHAR(100) COMMENT '例如Record Data Identifier',
`DIAG_PARAMETER_SHORT_NAME` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_MESSAGE_TYPE` VARCHAR(100) COMMENT '例如REQUEST',
`DIAG_PARAMETER_RESPONSE_SHORT_NAME` VARCHAR(100) COMMENT '例如Resp_ReadDataByIdentECUIdent',
`DIAG_PARAMETER_PATH` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_DISPLAYUNITH` VARCHAR(100) COMMENT '例如Param_RecorDataIdent',
`DIAG_PARAMETER_DATATYPE` VARCHAR(100) COMMENT '例如eTEXTTABLE',
`DIAG_PARAMETER_VALUE_PROXY_VALUE` VARCHAR(100) COMMENT '例如VW Spare Part Number',

`username` VARCHAR(50) COMMENT '负责人',
`IB2P_VERSION_LOCAL` VARCHAR(50) COMMENT 'V2.1.1',
`IB3P_Official_Release` VARCHAR(50) COMMENT 'V3.1.1',

`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;