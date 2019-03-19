/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 19/03/2019 15:16:18
*/
/**
created by zong_xin
 */
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `number` int(11) NOT NULL,
  `name` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `id_number` char(18) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `department` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `major` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `enrollment_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`number`) USING BTREE,
  UNIQUE INDEX `id_number`(`id_number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (20180101, '杜子腾', '男', '158177199901044792', '计算机学院', '计算机科学与工程', '2018-09-01');
INSERT INTO `student_info` VALUES (20180102, '杜琦燕', '女', '151008199801178529', '计算机学院', '计算机科学与工程', '2018-09-01');
INSERT INTO `student_info` VALUES (20180103, '范统', '男', '17156319980116959X', '计算机学院', '软件工程', '2018-09-01');
INSERT INTO `student_info` VALUES (20180104, '史珍香', '女', '141992199701078600', '计算机学院', '软件工程', '2018-09-01');
INSERT INTO `student_info` VALUES (20180105, '范剑', '男', '181048199308156368', '航天学院', '飞行器设计', '2018-09-01');
INSERT INTO `student_info` VALUES (20180106, '朱逸群', '男', '197995199501078445', '航天学院', '电子信息', '2018-09-01');

-- ----------------------------
-- Table structure for student_score
-- ----------------------------
DROP TABLE IF EXISTS `student_score`;
CREATE TABLE `student_score`  (
  `number` int(11) NOT NULL,
  `subject` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `score` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`number`, `subject`) USING BTREE,
  CONSTRAINT `student_score_ibfk_1` FOREIGN KEY (`number`) REFERENCES `student_info` (`number`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_score
-- ----------------------------
INSERT INTO `student_score` VALUES (20180101, '母猪的产后护理', 78);
INSERT INTO `student_score` VALUES (20180101, '论萨达姆的战争准备', 88);
INSERT INTO `student_score` VALUES (20180102, '母猪的产后护理', 100);
INSERT INTO `student_score` VALUES (20180102, '论萨达姆的战争准备', 98);
INSERT INTO `student_score` VALUES (20180103, '母猪的产后护理', 59);
INSERT INTO `student_score` VALUES (20180103, '论萨达姆的战争准备', 61);
INSERT INTO `student_score` VALUES (20180104, '母猪的产后护理', 55);
INSERT INTO `student_score` VALUES (20180104, '论萨达姆的战争准备', 46);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '12345', '11', '11');
INSERT INTO `user_info` VALUES ('2', '31231', '12', '11');

-- ----------------------------
-- View structure for by_view
-- ----------------------------
DROP VIEW IF EXISTS `by_view`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `by_view` AS select `male_student_info`.`number` AS `number`,`male_student_info`.`name` AS `name`,`male_student_info`.`score` AS `score` from `male_student_info`;

-- ----------------------------
-- View structure for male_student_info
-- ----------------------------
DROP VIEW IF EXISTS `male_student_info`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `male_student_info` AS select `s1`.`number` AS `number`,`s1`.`name` AS `name`,`s1`.`major` AS `major`,`s2`.`subject` AS `subject`,`s2`.`score` AS `score` from (`student_info` `s1` join `student_score` `s2`) where ((`s1`.`number` = `s2`.`number`) and (`s1`.`sex` = '男'));

SET FOREIGN_KEY_CHECKS = 1;
