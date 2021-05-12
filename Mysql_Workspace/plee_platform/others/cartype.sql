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

 Date: 30/03/2021 15:45:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cartype
-- ----------------------------
DROP TABLE IF EXISTS `cartype`;
CREATE TABLE `cartype`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cartype_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '车型名称',
  `responsible` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '负责人',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cartype
-- ----------------------------
INSERT INTO `cartype` VALUES (1, 'VW316/6', 'Zhang.Yuchen', '2021-03-02 08:46:25', '2021-03-02 08:46:25');
INSERT INTO `cartype` VALUES (2, 'VW380', 'Cui.Hongjie', '2021-03-02 08:46:25', '2021-03-02 08:46:25');

SET FOREIGN_KEY_CHECKS = 1;
