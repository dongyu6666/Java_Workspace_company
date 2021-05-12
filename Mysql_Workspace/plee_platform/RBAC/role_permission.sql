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

 Date: 30/03/2021 15:22:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) NOT NULL DEFAULT 0 COMMENT '角色id',
  `permission_id` int(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1, 1, '2021-02-25 15:36:57', '2021-02-25 15:37:16');
INSERT INTO `role_permission` VALUES (2, 2, 2, '2021-02-25 15:36:59', '2021-02-25 15:37:17');
INSERT INTO `role_permission` VALUES (3, 3, 3, '2021-02-25 15:37:01', '2021-02-25 15:37:18');
INSERT INTO `role_permission` VALUES (4, 4, 4, '2021-02-25 15:37:02', '2021-02-25 15:37:19');
INSERT INTO `role_permission` VALUES (5, 5, 5, '2021-02-25 15:37:05', '2021-02-25 15:37:22');
INSERT INTO `role_permission` VALUES (6, 6, 6, '2021-02-25 20:59:41', '2021-02-25 20:59:41');

SET FOREIGN_KEY_CHECKS = 1;
