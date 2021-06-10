/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.21 : Database - plee_platform
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`plee_platform` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `plee_platform`;

/*Table structure for table `cartype` */

DROP TABLE IF EXISTS `cartype`;

CREATE TABLE `cartype` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cartype_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '车型名称',
  `responsible` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '负责人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `cartype` */

insert  into `cartype`(`id`,`cartype_name`,`responsible`,`create_time`,`update_time`) values 
(1,'VW316/6_CN_B（11G）','zhangyuchen','2021-03-02 08:46:25','2021-03-31 08:32:16'),
(2,'VW316/7_CN_B（12G）','cuihongjie','2021-03-02 08:46:25','2021-03-30 15:53:21'),
(3,'VW413/1_CN_B（14G）','zhangyuchen','2021-03-30 15:53:15','2021-03-30 15:53:15'),
(4,'VW416/2_CN_K（30G）','zhangyuchen','2021-03-31 08:32:09','2021-03-31 08:32:09'),
(5,'VW416/3_CN_K（30C）','zhangyuchen','2021-03-31 08:32:34','2021-03-31 08:32:34'),
(6,'VW481/0_CN_K（3GD）','zhangyuchen','2021-03-31 08:33:10','2021-03-31 08:33:10'),
(7,'VW481/0_CN_PL1（3GD）','zhangyuchen','2021-03-31 08:33:27','2021-03-31 08:33:27'),
(8,'VW483/0_CN_K（3HD）','zhangyuchen','2021-03-31 08:33:57','2021-03-31 08:33:57'),
(9,'VW216/0_CN_K（671）','zhangyuchen','2021-03-31 08:34:13','2021-03-31 08:34:13'),
(10,'VW276/0_CN_K（2GD）','zhangyuchen','2021-03-31 08:34:26','2021-03-31 08:34:26'),
(11,'VW331/5_CN_K（15G）','zhangyuchen','2021-03-31 08:34:44','2021-03-31 08:34:44'),
(12,'VW371/0_CN_K（17G）','zhangyuchen','2021-03-31 08:34:52','2021-03-31 08:34:52'),
(13,'VW326/3_CN_K（55G)','zhangyuchen','2021-03-31 08:35:07','2021-03-31 08:35:07'),
(14,'VW326/3_CN_PL1（55G)','zhangyuchen','2021-03-31 08:35:23','2021-03-31 08:35:23'),
(15,'VW326/4_CN_K（55G)','zhangyuchen','2021-03-31 08:35:40','2021-03-31 08:35:40'),
(16,'VW380/0_CN_K','zhangyuchen','2021-03-31 08:37:32','2021-03-31 08:37:32');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
