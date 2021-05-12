/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.18 : Database - plee_platform
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`plee_platform` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `plee_platform`;

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `permission_menu` varchar(64) NOT NULL DEFAULT '' COMMENT '权限菜单',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`id`,`permission_menu`,`create_time`,`update_time`) values 
(1,'all','2021-02-25 15:39:23','2021-02-25 15:39:35'),
(2,'IB3P Management','2021-02-25 15:39:25','2021-02-25 15:39:39'),
(3,'IB4P Management','2021-02-25 15:39:26','2021-02-25 15:39:45'),
(4,'Q-Gate Management','2021-02-25 15:39:27','2021-02-25 15:40:04'),
(5,'read only','2021-02-25 15:39:30','2021-02-25 15:40:09'),
(6,'forbbiden','2021-02-25 20:55:45','2021-02-25 20:55:45');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(64) NOT NULL DEFAULT '' COMMENT '角色名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`role_name`,`create_time`,`update_time`) values 
(1,'super','2021-02-25 15:38:01','2021-02-25 15:38:14'),
(2,'IB3P Member','2021-02-25 15:38:03','2021-02-25 15:38:58'),
(3,'IB4P Member','2021-02-25 15:38:04','2021-02-25 15:39:05'),
(4,'Q-Gate Member','2021-02-25 15:38:05','2021-02-25 15:39:12'),
(5,'Guest','2021-02-25 15:38:08','2021-02-25 15:42:14'),
(6,'enemy','2021-02-25 20:59:07','2021-02-25 20:59:07');

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `permission_id` int(11) NOT NULL DEFAULT '0' COMMENT '权限id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `role_permission` */

insert  into `role_permission`(`id`,`role_id`,`permission_id`,`create_time`,`update_time`) values 
(1,1,1,'2021-02-25 15:36:57','2021-02-25 15:37:16'),
(2,2,2,'2021-02-25 15:36:59','2021-02-25 15:37:17'),
(3,3,3,'2021-02-25 15:37:01','2021-02-25 15:37:18'),
(4,4,4,'2021-02-25 15:37:02','2021-02-25 15:37:19'),
(5,5,5,'2021-02-25 15:37:05','2021-02-25 15:37:22'),
(6,6,6,'2021-02-25 20:59:41','2021-02-25 20:59:41');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(20) NOT NULL DEFAULT '' COMMENT '密码',
  `email` varchar(36) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '用户手机号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`password`,`email`,`phone`,`create_time`,`update_time`) values 
(1,'liangdongyu','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 21:46:58','2021-02-23 21:46:58'),
(2,'zhenghaitao','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 21:47:08','2021-02-23 21:47:08'),
(3,'guxuan','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 21:47:24','2021-02-23 21:47:24'),
(4,'zhangyuchen','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 22:03:22','2021-02-23 22:03:22'),
(5,'lushunjie','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 22:03:25','2021-02-23 22:03:40'),
(6,'lvhongrui','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 22:04:12','2021-02-23 22:04:12'),
(7,'yuanruize','vw123','dongyu.liang@faw-vw.com','13000000000','2021-02-23 22:04:38','2021-02-23 22:08:26'),
(8,'somebody','asdf','asdfasdgsdfg','12323452345','2021-02-25 20:56:42','2021-02-25 20:56:42'),
(9,'yuhaiming','faw123','dongyu.liang@faw-vw.com','13000000000','2021-02-25 21:00:07','2021-02-25 21:00:19'),
(10,'Ilja','vw123','sdfasdfsdfasdfasdf','12341345234','2021-02-25 21:02:31','2021-02-25 21:02:31');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL COMMENT '主键',
  `uid` int(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`id`,`uid`,`role_id`,`create_time`,`update_time`) values 
(1,1,1,'2021-02-25 15:35:46','2021-02-25 15:36:43'),
(2,2,1,'2021-02-25 15:35:51','2021-02-25 15:36:44'),
(3,3,1,'2021-02-25 15:35:52','2021-02-25 15:36:45'),
(4,4,2,'2021-02-25 15:35:53','2021-02-25 15:36:47'),
(5,5,3,'2021-02-25 15:36:09','2021-02-25 15:36:48'),
(6,6,4,'2021-02-25 15:36:13','2021-02-25 15:36:49'),
(7,7,5,'2021-02-25 15:36:16','2021-02-25 15:41:53'),
(8,8,6,'2021-02-25 20:57:32','2021-02-25 20:57:32'),
(9,9,4,'2021-02-25 21:00:35','2021-02-25 21:01:38'),
(10,10,2,'2021-02-25 21:03:16','2021-02-25 21:03:16');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
