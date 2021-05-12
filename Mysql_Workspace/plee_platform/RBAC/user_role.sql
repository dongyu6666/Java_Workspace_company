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

 Date: 30/03/2021 15:22:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `uid` int(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `role_id` int(11) NOT NULL DEFAULT 0 COMMENT '角色id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1, 1, '2021-02-25 15:35:46', '2021-02-25 15:36:43');
INSERT INTO `user_role` VALUES (2, 2, 1, '2021-02-25 15:35:51', '2021-02-25 15:36:44');
INSERT INTO `user_role` VALUES (3, 3, 1, '2021-02-25 15:35:52', '2021-02-25 15:36:45');
INSERT INTO `user_role` VALUES (4, 4, 2, '2021-02-25 15:35:53', '2021-02-25 15:36:47');
INSERT INTO `user_role` VALUES (5, 5, 3, '2021-02-25 15:36:09', '2021-02-25 15:36:48');
INSERT INTO `user_role` VALUES (6, 6, 4, '2021-02-25 15:36:13', '2021-02-25 15:36:49');
INSERT INTO `user_role` VALUES (7, 7, 5, '2021-02-25 15:36:16', '2021-02-25 15:41:53');
INSERT INTO `user_role` VALUES (8, 8, 6, '2021-02-25 20:57:32', '2021-02-25 20:57:32');
INSERT INTO `user_role` VALUES (9, 9, 4, '2021-02-25 21:00:35', '2021-02-25 21:01:38');
INSERT INTO `user_role` VALUES (10, 10, 2, '2021-02-25 21:03:16', '2021-02-25 21:03:16');

SET FOREIGN_KEY_CHECKS = 1;
