/*
 Navicat MySQL Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80014
 Source Host           : localhost:3306
 Source Schema         : springboot_mybatis_multisource

 Target Server Type    : MySQL
 Target Server Version : 80014
 File Encoding         : 65001

 Date: 29/09/2020 12:53:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `dep_no` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_department
-- ----------------------------
INSERT INTO `t_department` VALUES (1, '市场部', 222);
INSERT INTO `t_department` VALUES (2, '法务部', 333);
INSERT INTO `t_department` VALUES (3, '人力资源部', 444);
INSERT INTO `t_department` VALUES (4, '后勤部', 74745);
INSERT INTO `t_department` VALUES (5, '财务部', 6767657);

SET FOREIGN_KEY_CHECKS = 1;
