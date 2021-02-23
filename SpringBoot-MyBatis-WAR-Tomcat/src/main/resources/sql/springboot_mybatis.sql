/*
 Navicat MySQL Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : springboot_mybatis

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 11/09/2020 09:29:10
*/

-- 创建数据库
create database IF NOT EXISTS `springboot_mybatis` default character set utf8mb4 collate utf8mb4_general_ci;

use springboot_mybatis;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'LiMing', '123');
INSERT INTO `t_user` VALUES (2, 'ZhangHong', '456');
INSERT INTO `t_user` VALUES (3, '小刚', '789');
INSERT INTO `t_user` VALUES (4, 'Srammy', '@12#34$');

SET FOREIGN_KEY_CHECKS = 1;
