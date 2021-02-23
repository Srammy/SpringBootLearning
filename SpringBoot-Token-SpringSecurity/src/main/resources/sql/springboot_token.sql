-- 创建数据库
create database IF NOT EXISTS `springboot_token` default character set utf8mb4 collate utf8mb4_general_ci;

use springboot_token;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'test', '$2a$10$Jq3do29eUOPJwrU3jaXRf.6EnHhlMBQZs6VUMPFbLBl1Sd44dayhm');
INSERT INTO `t_user` VALUES ('2', 'test2', '$2a$10$a.L7yVEGeF46T1bzH5tDDuidKWScUkgwHaBmPVdMh.SuiiBVEpOqy');
INSERT INTO `t_user` VALUES ('3', 'test3', '$2a$10$iuhu.5O6NFNPiDWp5eV2KeS76vgVOUoEpTvBQIiwZK//DTdrhDmae');
INSERT INTO `t_user` VALUES ('4', 'test4', '$2a$10$voZhd9SOEziAhA7FudrpfugJO43Rw4PMbteCAeKK36IxuP.CzWBVW');
-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameZh` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', 'ROLE_ADMIN');
INSERT INTO `role` VALUES ('2', '普通用户', 'ROLE_USER');

-- ----------------------------
-- Table structure for `role_resource`
-- 配置在这个表里的接口必须在http请求的header里加上token
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `resource_uri` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
-- 超级用户设备
INSERT INTO `role_resource` VALUES ('1', '1', '/all');
-- 普通用户位置信息
INSERT INTO `role_resource` VALUES ('2', '2', '/findUserById');


-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '2', '2');
INSERT INTO `user_role` VALUES ('3', '3', '2');
INSERT INTO `user_role` VALUES ('4', '4', '2');