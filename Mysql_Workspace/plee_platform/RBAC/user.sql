/*
 Navicat Premium Data Transfer

 Source Server         : BINBIN
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 10.227.6.242:3306
 Source Schema         : plee_platform

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 30/03/2021 15:38:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '密码',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '真实姓名',
  `email` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户手机号',
  `department` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '部门',
  `group` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '专业组',
  `status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '1表示激活，0表示未激活',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'yecizhe', '0e96a7769af2de8c148a13fbf7df1047', '郑海涛', 'haitao.zheng@faw-vw.com', '18049409628', '规划 电子电器规划', '检测程序，创新开发', '1', '2021-03-24 11:34:42', '2021-03-24 16:06:44');
INSERT INTO `user` VALUES (2, 'liangdongyu', '9e18c727792dfcba0594ce86479373dd', '梁东宇', 'dongyu.liang@faw-vw.com', '81270194', '规划 电子电器规划', '检测程序，创新开发', '0', '2021-03-24 12:50:46', '2021-03-30 15:17:34');
INSERT INTO `user` VALUES (3, 'guxuan', 'xxx', '顾轩', 'dongyu.liang@faw-vw.com', '81270194', '规划 电子电器规划', '检测程序，创新开发', '0', '2021-03-30 09:55:40', '2021-03-30 15:17:35');
INSERT INTO `user` VALUES (4, 'zhangyuchen', 'xxx', '张煜晨', 'dongyu.liang@faw-vw.com', '81270194', '规划 电子电器规划', '产品规划', '0', '2021-03-30 15:16:10', '2021-03-30 15:17:38');
INSERT INTO `user` VALUES (5, 'lushunjie', 'xxx', '路顺杰', 'dongyu.liang@faw-vw.com', '81270194', '规划 电子电器规划', '工艺规划', '0', '2021-03-30 15:17:18', '2021-03-30 15:17:48');
INSERT INTO `user` VALUES (6, 'lurenjia', 'xxx', '路人甲', 'xxx', 'xxx', 'xxx', 'xxx', '0', '2021-03-30 15:35:34', '2021-03-30 15:35:41');
INSERT INTO `user` VALUES (7, 'yuhaiming', 'xxx', '于海明', 'xxx', '81270194', '规划 电子电器规划', '检测程序', '0', '2021-03-30 15:35:54', '2021-03-30 15:36:32');

SET FOREIGN_KEY_CHECKS = 1;
