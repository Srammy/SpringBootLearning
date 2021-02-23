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
create database IF NOT EXISTS `springboot_pagehelper` default character set utf8mb4 collate utf8mb4_general_ci;

use springboot_pagehelper;

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
INSERT INTO `t_user` VALUES (5, 'cammy', '@12#34$');
INSERT INTO `t_user` VALUES (6, 'Lili', 'asd');
INSERT INTO `t_user` VALUES (7, 'Luke', 'qwe');
INSERT INTO `t_user` VALUES (8, 'Liya', '4rf');
INSERT INTO `t_user` VALUES (9, 'c3po', 'Rds$#');
INSERT INTO `t_user` VALUES (10, 'r2d2', 'dhjshs');
INSERT INTO `t_user` VALUES (11, 'obiwang', '3434324bnbmn');
INSERT INTO `t_user` VALUES (12, 'kim', 'ioioio*74$%');
INSERT INTO `t_user` VALUES (13, 'sith', 'oopp');
INSERT INTO `t_user` VALUES (14, 'yoda', 'Link');
INSERT INTO `t_user` VALUES (15, 'roya', 'zelda4334');
INSERT INTO `t_user` VALUES (16, 'rick', 'zelda$%');
INSERT INTO `t_user` VALUES (17, 'morty', 'llklkk54');
INSERT INTO `t_user` VALUES (18, 'light', 'yahahawewe333');
INSERT INTO `t_user` VALUES (19, 'pinkmim', '43473847384');
INSERT INTO `t_user` VALUES (20, 'mario', 'falsh3434f#@$');
SET FOREIGN_KEY_CHECKS = 1;
