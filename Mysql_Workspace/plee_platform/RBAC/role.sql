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

 Date: 30/03/2021 15:18:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '角色名',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'super', '2021-02-25 15:38:01', '2021-02-25 15:38:14');
INSERT INTO `role` VALUES (2, 'IB3P Member', '2021-02-25 15:38:03', '2021-02-25 15:38:58');
INSERT INTO `role` VALUES (3, 'IB4P Member', '2021-02-25 15:38:04', '2021-02-25 15:39:05');
INSERT INTO `role` VALUES (4, 'Q-Gate Member', '2021-02-25 15:38:05', '2021-02-25 15:39:12');
INSERT INTO `role` VALUES (5, 'Guest', '2021-02-25 15:38:08', '2021-02-25 15:42:14');
INSERT INTO `role` VALUES (6, 'enemy', '2021-02-25 20:59:07', '2021-02-25 20:59:07');

SET FOREIGN_KEY_CHECKS = 1;
