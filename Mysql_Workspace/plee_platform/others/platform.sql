USE `plee_platform`;

/*Table structure for table `platform` */

DROP TABLE IF EXISTS `platform`;

CREATE TABLE `platform` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `platform_name` VARCHAR(20) NOT NULL COMMENT '车型平台名称',
  `class_name` VARCHAR(10) NOT NULL COMMENT '车型级别',
  `cartype_name` VARCHAR(20) NOT NULL COMMENT '车型名称',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `platform` */

INSERT  INTO `platform`(`id`,`platform_name`,`class_name`,`cartype_name`,`create_time`,`update_time`) VALUES 
(1,'MEB','A','VW316/6_CN_B（11G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(2,'MEB','A','VW316/7_CN_B（12G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(3,'MEB','B','VW413/1_CN_B（14G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(4,'MQB37w','B','VW416/2_CN_K（30G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(5,'MQB37w','B','VW416/3_CN_K（30C）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(6,'MQB','B','VW481/0_CN_K（3GD）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(7,'MQB','B','VW481/0_CN_PL1（3GD）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(8,'MQB','B','VW483/0_CN_K（3HD）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(9,'MQB','A','VW216/0_CN_K（671）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(10,'MQB','A','VW276/0_CN_K（2GD）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(11,'MQB','A','VW331/5_CN_K（15G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(12,'MQB','A','VW371/0_CN_K（17G）','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(13,'MQB','A','VW326/3_CN_K（55G)','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(14,'MQB','A','VW326/3_CN_PL1（55G)','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(15,'MQB','A','VW326/4_CN_K（55G)','2021-03-31 09:00:08','2021-03-31 09:00:08'),
(16,'MQB37w','A','VW380/0_CN_K','2021-03-31 09:00:08','2021-03-31 09:00:08');


