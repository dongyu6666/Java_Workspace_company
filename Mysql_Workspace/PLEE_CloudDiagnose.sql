CREATE DATABASE PLEE_Cloud_Diagnose CHARACTER SET utf8 COLLATE utf8_general_ci
USE PLEE_Cloud_Diagnose;

DROP TABLE IF EXISTS `VBV`;
CREATE TABLE `VBV`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`VIN` VARCHAR(20) NOT NULL COMMENT '底盘号',
`Diagnose_Adr` VARCHAR(6) NOT NULL COMMENT '诊断地址',
`SG_Name` VARCHAR(15) NOT NULL COMMENT '控制器名字缩写',
`SG_Tnr` VARCHAR(11) NOT NULL COMMENT '控制器零件号',
`SG_SW` VARCHAR(6) NOT NULL COMMENT '控制器软件版本',
`SG_HW` VARCHAR(6) NOT NULL COMMENT '控制器硬件版本',
#`PR` VARCHAR(1000) NOT NULL COMMENT 'PR号',
`SG_Login_Code` VARCHAR(6) NOT NULL COMMENT '控制器登陆码',
`ZDC_Tnr` VARCHAR(11) COMMENT 'ZDC零件号',
`ZDC_File` VARCHAR(50) COMMENT 'ZDC文件名',
`Flashbar` BOOLEAN COMMENT '可刷新性',
`Flash_File` VARCHAR(50) COMMENT '刷新文件名',
`VBV_TEversion` VARCHAR(20) NOT NULL COMMENT 'VBV版本',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `plee_cloud_diagnose`.`vbv` (`id`,`VIN`, `Diagnose_Adr`, `SG_Name`, `SG_Tnr`, `SG_SW`, `SG_HW`, `SG_Login_Code`, `ZDC_Tnr`, `ZDC_File`, `Flashbar`,`Flash_File`, `VBV_TEversion`) VALUES ('1','LFVVB9E68M5000296', '005F', 'IEL', '10C035284', '0182', 'H01', '79324', 'V03935333MV', 'VSP1050410A___SWCL_Sys_Adaptive.xml', '1','FL_0EA906012B_1267__V001.odx','4.5.2C'); 
INSERT INTO `plee_cloud_diagnose`.`vbv` (`id`,`VIN`, `Diagnose_Adr`, `SG_Name`, `SG_Tnr`, `SG_SW`, `SG_HW`, `SG_Login_Code`, `ZDC_Tnr`, `ZDC_File`, `Flashbar`,`Flash_File`, `VBV_TEversion`) VALUES ('2','LFVVB9E68M5000297', '0019', 'GWA', '10C035098', '0001', 'H01', '10123', 'V03935333XX', 'VSP1050410A___GWA_Sys_Adaptive.xml', '0','NUll' ,'4.5.2C'); 
INSERT INTO `plee_cloud_diagnose`.`vbv` (`id`,`VIN`, `Diagnose_Adr`, `SG_Name`, `SG_Tnr`, `SG_SW`, `SG_HW`, `SG_Login_Code`, `ZDC_Tnr`, `ZDC_File`, `Flashbar`,`Flash_File`, `VBV_TEversion`) VALUES ('3','LFVVB9E68M5000298', '0009', 'EZE', '10C035222', '0001', 'H01', '10121', 'V03935333XX', 'VSP1050410A___GWA_Sys_Adaptive.xml', '0','NUll' ,'4.5.2C'); 

DROP TABLE IF EXISTS `Fahrzeug_Info`;
CREATE TABLE `Fahrzeug_Info`(
`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`Car_Type` VARCHAR(20) NOT NULL COMMENT '车型',
`VIN` VARCHAR(20) NOT NULL COMMENT '底盘号',
`KNR` VARCHAR(20) NOT NULL COMMENT '订单号',
`PR` VARCHAR(1000) NOT NULL COMMENT 'PR号',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


INSERT INTO `plee_cloud_diagnose`.`Fahrzeug_Info` (`id`,`Car_Type`,`VIN`, `KNR`, `PR`) VALUES ('1','VW316/6','LFVVB9E68M5000290','C4202042290290','0AG    0BC    0FA    0GA    0NB    0RH    0TA    0XF    0Y5    0YJ    1D0    1FB    1J2    1JA    1KB    1LN    1N3    1NL    1PA    1S2    1T2    1X2    2DY    2F0    2FM    2H5    2WA    31R    3B4    3CA    3D2    3FG    3GA    3LT    3NU    3PR    3QH    3S1    3T2    3ZU    44L    4A3    4G0    4GF    4K5    4KF    4L6    4N0    4S0    4UE    4X3    5D1    5I6    5JA    5K7    5LD    5MA    6A0    6DQ    6FG    6H0    6I2    6M0    6XQ    76A    7AA    7E6    7I4    7K6    7PB    7UT    7W0    7X2    7Y1    8AV    8G4    8I9    8IV    8J3    8N6    8RT    8T8    8VP    8X7    8Y2    8ZQ    9M0    9P4    9T0    9WJ    9Z0    9ZV    A8D    AV4    B1P    B36    C00    E0A    EA0    EL5    EM1    ER6    ES8    EV0    F0A    FT0    G01    G1Z    G9E    GJ0    GM1    GP2    GW0    J2S    J37    J9D    JX0    K8G    KA6    KB2    KH4    KK1    KS3    L06    L0L    L1F    LH2    N07    N0C    NZ4    QH1    QQ8    QR9    QV0    QW5    U5J    U9C    UD6    VF4    VI5    '); 
INSERT INTO `plee_cloud_diagnose`.`Fahrzeug_Info` (`id`,`Car_Type`,`VIN`, `KNR`, `PR`) VALUES ('2','VW316/6','LFVVB9E68M5000298','C4202042290298','0AG    0BC    0FA    0GA    0NB    0RH    0TA    0XF    0Y5    0YJ    1D0    1FB    1J2    1JA    1KB    1LN    1N3    1NL    1PA    1S2    1T2    1X2    2DY    2F0    2FM    2H5    2WA    31R    3B4    3CA    3D2    3FG    3GA    3LT    3NU    3PR    3QH    3S1    3T2    3ZU    44L    4A3    4G0    4GF    4K5    4KF    4L6    4N0    4S0    4UE    4X3    5D1    5I6    5JA    5K7    5LD    5MA    6A0    6DQ    6FG    6H0    6I2    6M0    6XQ    76A    7AA    7E6    7I4    7K6    7PB    7UT    7W0    7X2    7Y1    8AV    8G4    8I9    8IV    8J3    8N6    8RT    8T8    8VP    8X7    8Y2    8ZQ    9M0    9P4    9T0    9WJ    9Z0    9ZV    A8D    AV4    B1P    B36    C00    E0A    EA0    EL5    EM1    ER6    ES8    EV0    F0A    FT0    G01    G1Z    G9E    GJ0    GM1    GP2    GW0    J2S    J37    J9D    JX0    K8G    KA6    KB2    KH4    KK1    KS3    L06    L0L    L1F    LH2    N07    N0C    NZ4    QH1    QQ8    QR9    QV0    QW5    U5J    U9C    UD6    VF4    VI5    '); 
INSERT INTO `plee_cloud_diagnose`.`Fahrzeug_Info` (`id`,`Car_Type`,`VIN`, `KNR`, `PR`) VALUES ('3','VW316/6','LFVVB9E68M5000297','C4202042290297','0AG    0BC    0FA    0GA    0NB    0RH    0TA    0XF    0Y5    0YJ    1D0    1FB    1J2    1JA    1KB    1LN    1N3    1NL    1PA    1S2    1T2    1X2    2DY    2F0    2FM    2H5    2WA    31R    3B4    3CA    3D2    3FG    3GA    3LT    3NU    3PR    3QH    3S1    3T2    3ZU    44L    4A3    4G0    4GF    4K5    4KF    4L6    4N0    4S0    4UE    4X3    5D1    5I6    5JA    5K7    5LD    5MA    6A0    6DQ    6FG    6H0    6I2    6M0    6XQ    76A    7AA    7E6    7I4    7K6    7PB    7UT    7W0    7X2    7Y1    8AV    8G4    8I9    8IV    8J3    8N6    8RT    8T8    8VP    8X7    8Y2    8ZQ    9M0    9P4    9T0    9WJ    9Z0    9ZV    A8D    AV4    B1P    B36    C00    E0A    EA0    EL5    EM1    ER6    ES8    EV0    F0A    FT0    G01    G1Z    G9E    GJ0    GM1    GP2    GW0    J2S    J37    J9D    JX0    K8G    KA6    KB2    KH4    KK1    KS3    L06    L0L    L1F    LH2    N07    N0C    NZ4    QH1    QQ8    QR9    QV0    QW5    U5J    U9C    UD6    VF4    VI5    '); 
INSERT INTO `plee_cloud_diagnose`.`Fahrzeug_Info` (`id`,`Car_Type`,`VIN`, `KNR`, `PR`) VALUES ('4','VW316/6','LFVVB9E68M5000296','C4202042290296','0AG    0BC    0FA    0GA    0NB    0RH    0TA    0XF    0Y5    0YJ    1D0    1FB    1J2    1JA    1KB    1LN    1N3    1NL    1PA    1S2    1T2    1X2    2DY    2F0    2FM    2H5    2WA    31R    3B4    3CA    3D2    3FG    3GA    3LT    3NU    3PR    3QH    3S1    3T2    3ZU    44L    4A3    4G0    4GF    4K5    4KF    4L6    4N0    4S0    4UE    4X3    5D1    5I6    5JA    5K7    5LD    5MA    6A0    6DQ    6FG    6H0    6I2    6M0    6XQ    76A    7AA    7E6    7I4    7K6    7PB    7UT    7W0    7X2    7Y1    8AV    8G4    8I9    8IV    8J3    8N6    8RT    8T8    8VP    8X7    8Y2    8ZQ    9M0    9P4    9T0    9WJ    9Z0    9ZV    A8D    AV4    B1P    B36    C00    E0A    EA0    EL5    EM1    ER6    ES8    EV0    F0A    FT0    G01    G1Z    G9E    GJ0    GM1    GP2    GW0    J2S    J37    J9D    JX0    K8G    KA6    KB2    KH4    KK1    KS3    L06    L0L    L1F    LH2    N07    N0C    NZ4    QH1    QQ8    QR9    QV0    QW5    U5J    U9C    UD6    VF4    VI5    '); 
