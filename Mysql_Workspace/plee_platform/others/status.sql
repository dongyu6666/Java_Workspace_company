-- Table structure for status
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status`  (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cartype_name` VARCHAR(20) COMMENT '车型名称',
  `IB3P_Version` VARCHAR(20) COMMENT 'IB3P_Version',
  `IB3P_filename` VARCHAR(1000) COMMENT '例如IB3P_SYSTEM_VW316_6CN_B_0052 - Türelektronik Beifahrer_TSG_BFS_MQB37W_MEB_V1_4_SUB_1.xml',
  `responsible` VARCHAR(30) COMMENT '负责人',
  
  `IB3P_Draft_Version` VARCHAR(30) COMMENT 'IB3P_Draft_Version',
  `IB3P_Official_Version` VARCHAR(30) COMMENT 'IB3P_Official_Version',
  
  `create_time` TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) 
) ENGINE=INNODB DEFAULT CHARSET=utf8;

