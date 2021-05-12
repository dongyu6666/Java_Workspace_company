/*
 Navicat Premium Data Transfer

 Source Server         : Company
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : 10.220.15.230:3306
 Source Schema         : plee_platform

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 30/03/2021 15:22:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `permission_menu` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '权限菜单',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, 'all', '2021-02-25 15:39:23', '2021-02-25 15:39:35');
INSERT INTO `permission` VALUES (2, 'IB3P Management', '2021-02-25 15:39:25', '2021-02-25 15:39:39');
INSERT INTO `permission` VALUES (3, 'IB4P Management', '2021-02-25 15:39:26', '2021-02-25 15:39:45');
INSERT INTO `permission` VALUES (4, 'Q-Gate Management', '2021-02-25 15:39:27', '2021-02-25 15:40:04');
INSERT INTO `permission` VALUES (5, 'read only', '2021-02-25 15:39:30', '2021-02-25 15:40:09');
INSERT INTO `permission` VALUES (6, 'forbbiden', '2021-02-25 20:55:45', '2021-02-25 20:55:45');

SET FOREIGN_KEY_CHECKS = 1;
