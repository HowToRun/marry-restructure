/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : marry

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-08-02 17:39:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bless_info
-- ----------------------------
DROP TABLE IF EXISTS `bless_info`;
CREATE TABLE `bless_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bless_user` varchar(255) DEFAULT NULL COMMENT '点赞人open_id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间（点赞时间）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COMMENT='点赞记录表';

-- ----------------------------
-- Records of bless_info
-- ----------------------------
INSERT INTO `bless_info` VALUES ('1', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:42');
INSERT INTO `bless_info` VALUES ('2', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:39');
INSERT INTO `bless_info` VALUES ('3', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:37');
INSERT INTO `bless_info` VALUES ('4', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:34');
INSERT INTO `bless_info` VALUES ('5', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:32');
INSERT INTO `bless_info` VALUES ('6', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:57:29');
INSERT INTO `bless_info` VALUES ('7', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:51');
INSERT INTO `bless_info` VALUES ('8', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:52');
INSERT INTO `bless_info` VALUES ('9', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:53');
INSERT INTO `bless_info` VALUES ('10', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:54');
INSERT INTO `bless_info` VALUES ('11', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:54');
INSERT INTO `bless_info` VALUES ('12', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:55');
INSERT INTO `bless_info` VALUES ('13', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:55');
INSERT INTO `bless_info` VALUES ('14', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:55');
INSERT INTO `bless_info` VALUES ('15', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:55');
INSERT INTO `bless_info` VALUES ('16', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:55');
INSERT INTO `bless_info` VALUES ('17', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:56');
INSERT INTO `bless_info` VALUES ('18', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:56');
INSERT INTO `bless_info` VALUES ('19', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:57');
INSERT INTO `bless_info` VALUES ('20', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:57');
INSERT INTO `bless_info` VALUES ('21', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:57');
INSERT INTO `bless_info` VALUES ('22', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:57');
INSERT INTO `bless_info` VALUES ('23', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:58');
INSERT INTO `bless_info` VALUES ('24', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:58');
INSERT INTO `bless_info` VALUES ('25', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:59');
INSERT INTO `bless_info` VALUES ('26', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:36:59');
INSERT INTO `bless_info` VALUES ('27', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:00');
INSERT INTO `bless_info` VALUES ('28', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:00');
INSERT INTO `bless_info` VALUES ('29', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:00');
INSERT INTO `bless_info` VALUES ('30', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:01');
INSERT INTO `bless_info` VALUES ('31', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:01');
INSERT INTO `bless_info` VALUES ('32', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:02');
INSERT INTO `bless_info` VALUES ('33', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:02');
INSERT INTO `bless_info` VALUES ('34', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:02');
INSERT INTO `bless_info` VALUES ('35', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:03');
INSERT INTO `bless_info` VALUES ('36', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:03');
INSERT INTO `bless_info` VALUES ('37', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:03');
INSERT INTO `bless_info` VALUES ('38', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:36:02');
INSERT INTO `bless_info` VALUES ('39', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:32');
INSERT INTO `bless_info` VALUES ('40', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:46');
INSERT INTO `bless_info` VALUES ('41', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:49');
INSERT INTO `bless_info` VALUES ('42', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:51');
INSERT INTO `bless_info` VALUES ('43', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:55');

-- ----------------------------
-- Table structure for comment_info
-- ----------------------------
DROP TABLE IF EXISTS `comment_info`;
CREATE TABLE `comment_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `comment_user` varchar(255) DEFAULT NULL COMMENT '评论人open_id',
  `comment` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `create_time` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='评论表';

-- ----------------------------
-- Records of comment_info
-- ----------------------------
INSERT INTO `comment_info` VALUES ('1', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '111', '2019-08-02 12:51:19');
INSERT INTO `comment_info` VALUES ('2', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '222', '2019-08-02 12:51:17');
INSERT INTO `comment_info` VALUES ('3', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '333', '2019-08-02 12:51:14');
INSERT INTO `comment_info` VALUES ('4', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '444', '2019-08-02 12:51:11');
INSERT INTO `comment_info` VALUES ('5', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '555', '2019-08-02 12:51:08');
INSERT INTO `comment_info` VALUES ('6', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '666', '2019-08-02 12:51:05');
INSERT INTO `comment_info` VALUES ('7', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '777', '2019-08-02 12:51:02');
INSERT INTO `comment_info` VALUES ('8', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '888', '2019-08-02 12:51:00');
INSERT INTO `comment_info` VALUES ('10', null, null, '2019-08-02 14:08:22');
INSERT INTO `comment_info` VALUES ('11', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '112233', '2019-08-02 14:09:21');
INSERT INTO `comment_info` VALUES ('12', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '332211', '2019-08-02 15:07:36');
INSERT INTO `comment_info` VALUES ('13', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '222', '2019-08-02 15:08:06');

-- ----------------------------
-- Table structure for image_detail_info
-- ----------------------------
DROP TABLE IF EXISTS `image_detail_info`;
CREATE TABLE `image_detail_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '唯一标识',
  `img_url` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `user_open_id` varchar(255) DEFAULT NULL COMMENT '所属用户open_id',
  `banner_code` varchar(255) DEFAULT NULL COMMENT '入口图片code',
  `desc` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='图片详情信息';

-- ----------------------------
-- Records of image_detail_info
-- ----------------------------
INSERT INTO `image_detail_info` VALUES ('1', ';alksjdfja;slkdjf', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.Vjc3axF9z5Tk73b95c75681cd327cf6cd3c7f7666d6a.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc1', '2019-08-02 10:47:41', '2019-08-02 10:47:41');
INSERT INTO `image_detail_info` VALUES ('2', 'zx,cnv,mzxncv,', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.nbnefUzC4ZqCa23abcbc77968bd53e5ce6d33ea5cab1.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc2', '2019-08-02 10:47:38', '2019-08-02 10:47:38');
INSERT INTO `image_detail_info` VALUES ('3', 'oriquweporiquwe', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.2fj8WBufD5Tz850819fbe383a472d366b31295a5dd13.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc3', '2019-08-02 10:47:37', '2019-08-02 10:47:37');
INSERT INTO `image_detail_info` VALUES ('4', 'kahSdfiuzxkmnv', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.g26NxjQehN74df32a345b262ca75623236b097e15ce0.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc4', '2019-08-02 10:47:36', '2019-08-02 10:47:36');
INSERT INTO `image_detail_info` VALUES ('5', 'sdklhzxcivk,mn', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.mhqDPojGYinW75f3a48b84f9bda1d2e009e0d5b71adb.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc5', '2019-08-02 10:47:35', '2019-08-02 10:47:35');
INSERT INTO `image_detail_info` VALUES ('6', 'aoiuewrknyzhsdf', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.hvl7nkIMocR183ec3c85b7ea372887d78a4ad614e8b3.jpg', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'testcode1', 'sql desc6', '2019-08-02 10:47:47', '2019-08-02 10:47:49');

-- ----------------------------
-- Table structure for image_info
-- ----------------------------
DROP TABLE IF EXISTS `image_info`;
CREATE TABLE `image_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '唯一标识',
  `img_url` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `title` varchar(255) DEFAULT NULL COMMENT '图片标题',
  `user_open_id` varchar(255) DEFAULT NULL COMMENT '所属用户open_id',
  `desc` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='图片概览信息表';

-- ----------------------------
-- Records of image_info
-- ----------------------------
INSERT INTO `image_info` VALUES ('1', 'testcode1', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.Vjc3axF9z5Tk73b95c75681cd327cf6cd3c7f7666d6a.jpg', '别致角楼', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);
INSERT INTO `image_info` VALUES ('2', 'testcode2', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.nbnefUzC4ZqCa23abcbc77968bd53e5ce6d33ea5cab1.jpg', '欧洲风情', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);
INSERT INTO `image_info` VALUES ('3', 'testcode3', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.2fj8WBufD5Tz850819fbe383a472d366b31295a5dd13.jpg', '大气典雅', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);
INSERT INTO `image_info` VALUES ('4', 'testcode4', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.g26NxjQehN74df32a345b262ca75623236b097e15ce0.jpg', '酒吧一条街', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);
INSERT INTO `image_info` VALUES ('5', 'testcode5', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.mhqDPojGYinW75f3a48b84f9bda1d2e009e0d5b71adb.jpg', '红粉佳人', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);
INSERT INTO `image_info` VALUES ('6', 'testcode6', 'https://pengmaster.com/party//userImg/osaod0ZlCZxFk3qxoDRrrx9lRvU8/wxc028256ea6d51af1.o6zAJs1lH7XCQJzJjW07YGC2CEjg.hvl7nkIMocR183ec3c85b7ea372887d78a4ad614e8b3.jpg', '狗娃特写', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', null, null, null);

-- ----------------------------
-- Table structure for logo_info
-- ----------------------------
DROP TABLE IF EXISTS `logo_info`;
CREATE TABLE `logo_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '图片地址',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `user_open_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户open_id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of logo_info
-- ----------------------------

-- ----------------------------
-- Table structure for share_info
-- ----------------------------
DROP TABLE IF EXISTS `share_info`;
CREATE TABLE `share_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `share_user` varchar(255) DEFAULT NULL COMMENT '分享人open_id',
  `create_time` datetime DEFAULT NULL COMMENT '分享时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分享记录表';

-- ----------------------------
-- Records of share_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信用户唯一标识',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '微信昵称',
  `province` varchar(255) DEFAULT NULL COMMENT '归属地省份',
  `city` varchar(255) DEFAULT NULL COMMENT '归属地城市',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='存储用户基本信息，与用户相关的基本表。不存重。查重标准：open_id。';

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eoSzUw7N2RVWX28TxD1pPkYojtkNuu5wOowzE3vLMpp0LSPKL2pJdPJyFUokZ2JsAgTum7qe55goA/132', '淡淡烟草香', 'Hebei', 'Langfang', '2019-08-01 12:32:25', '2019-08-02 16:48:30');

-- ----------------------------
-- Table structure for user_record_info
-- ----------------------------
DROP TABLE IF EXISTS `user_record_info`;
CREATE TABLE `user_record_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_open_id` varchar(255) DEFAULT NULL COMMENT '用户标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间，即用户登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8 COMMENT='用户登录记录表，用户每登录一次，就新增该表一条数据。';

-- ----------------------------
-- Records of user_record_info
-- ----------------------------
INSERT INTO `user_record_info` VALUES ('2', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:07:36');
INSERT INTO `user_record_info` VALUES ('3', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:12:10');
INSERT INTO `user_record_info` VALUES ('4', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:14:44');
INSERT INTO `user_record_info` VALUES ('5', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:15:04');
INSERT INTO `user_record_info` VALUES ('6', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:15:34');
INSERT INTO `user_record_info` VALUES ('7', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:15:53');
INSERT INTO `user_record_info` VALUES ('8', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:17:47');
INSERT INTO `user_record_info` VALUES ('9', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:21:17');
INSERT INTO `user_record_info` VALUES ('10', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:22:16');
INSERT INTO `user_record_info` VALUES ('11', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:22:57');
INSERT INTO `user_record_info` VALUES ('12', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:24:41');
INSERT INTO `user_record_info` VALUES ('13', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:25:41');
INSERT INTO `user_record_info` VALUES ('14', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:28:51');
INSERT INTO `user_record_info` VALUES ('15', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:33:29');
INSERT INTO `user_record_info` VALUES ('16', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:33:50');
INSERT INTO `user_record_info` VALUES ('17', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:42:27');
INSERT INTO `user_record_info` VALUES ('18', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 11:51:06');
INSERT INTO `user_record_info` VALUES ('19', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 12:13:34');
INSERT INTO `user_record_info` VALUES ('20', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 12:28:34');
INSERT INTO `user_record_info` VALUES ('22', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 12:31:24');
INSERT INTO `user_record_info` VALUES ('23', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 12:32:25');
INSERT INTO `user_record_info` VALUES ('24', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 13:14:21');
INSERT INTO `user_record_info` VALUES ('25', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 13:37:27');
INSERT INTO `user_record_info` VALUES ('27', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 13:41:24');
INSERT INTO `user_record_info` VALUES ('28', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 13:42:05');
INSERT INTO `user_record_info` VALUES ('29', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 14:12:40');
INSERT INTO `user_record_info` VALUES ('31', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 14:30:29');
INSERT INTO `user_record_info` VALUES ('32', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 14:42:59');
INSERT INTO `user_record_info` VALUES ('33', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 14:45:53');
INSERT INTO `user_record_info` VALUES ('34', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:01:50');
INSERT INTO `user_record_info` VALUES ('35', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:03:43');
INSERT INTO `user_record_info` VALUES ('36', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:04:58');
INSERT INTO `user_record_info` VALUES ('37', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:10:36');
INSERT INTO `user_record_info` VALUES ('38', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:19:04');
INSERT INTO `user_record_info` VALUES ('39', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:23:58');
INSERT INTO `user_record_info` VALUES ('40', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:29:05');
INSERT INTO `user_record_info` VALUES ('41', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:30:06');
INSERT INTO `user_record_info` VALUES ('42', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:32:16');
INSERT INTO `user_record_info` VALUES ('43', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:32:44');
INSERT INTO `user_record_info` VALUES ('44', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:35:34');
INSERT INTO `user_record_info` VALUES ('45', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:37:26');
INSERT INTO `user_record_info` VALUES ('46', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:39:19');
INSERT INTO `user_record_info` VALUES ('47', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:40:04');
INSERT INTO `user_record_info` VALUES ('48', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:41:35');
INSERT INTO `user_record_info` VALUES ('49', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:45:13');
INSERT INTO `user_record_info` VALUES ('50', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:46:51');
INSERT INTO `user_record_info` VALUES ('51', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:47:51');
INSERT INTO `user_record_info` VALUES ('52', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 15:50:08');
INSERT INTO `user_record_info` VALUES ('53', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:08:16');
INSERT INTO `user_record_info` VALUES ('54', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:11:45');
INSERT INTO `user_record_info` VALUES ('55', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:12:22');
INSERT INTO `user_record_info` VALUES ('56', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:13:21');
INSERT INTO `user_record_info` VALUES ('57', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:14:06');
INSERT INTO `user_record_info` VALUES ('58', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:15:07');
INSERT INTO `user_record_info` VALUES ('59', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:16:35');
INSERT INTO `user_record_info` VALUES ('60', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:17:09');
INSERT INTO `user_record_info` VALUES ('61', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:20:38');
INSERT INTO `user_record_info` VALUES ('62', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:21:44');
INSERT INTO `user_record_info` VALUES ('63', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:22:56');
INSERT INTO `user_record_info` VALUES ('64', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:23:33');
INSERT INTO `user_record_info` VALUES ('65', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:24:36');
INSERT INTO `user_record_info` VALUES ('66', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:25:13');
INSERT INTO `user_record_info` VALUES ('67', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:47:48');
INSERT INTO `user_record_info` VALUES ('68', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:56:06');
INSERT INTO `user_record_info` VALUES ('69', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:56:57');
INSERT INTO `user_record_info` VALUES ('70', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 16:57:26');
INSERT INTO `user_record_info` VALUES ('71', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:06:29');
INSERT INTO `user_record_info` VALUES ('72', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:06:58');
INSERT INTO `user_record_info` VALUES ('73', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:13:26');
INSERT INTO `user_record_info` VALUES ('74', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:13:52');
INSERT INTO `user_record_info` VALUES ('75', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:22:25');
INSERT INTO `user_record_info` VALUES ('76', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:24:01');
INSERT INTO `user_record_info` VALUES ('77', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:27:15');
INSERT INTO `user_record_info` VALUES ('78', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:27:46');
INSERT INTO `user_record_info` VALUES ('79', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 17:28:25');
INSERT INTO `user_record_info` VALUES ('80', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-01 18:33:28');
INSERT INTO `user_record_info` VALUES ('81', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 10:04:01');
INSERT INTO `user_record_info` VALUES ('82', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 10:06:16');
INSERT INTO `user_record_info` VALUES ('83', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 10:07:39');
INSERT INTO `user_record_info` VALUES ('84', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 10:50:01');
INSERT INTO `user_record_info` VALUES ('85', 'null', '2019-08-02 10:50:57');
INSERT INTO `user_record_info` VALUES ('86', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 10:51:16');
INSERT INTO `user_record_info` VALUES ('88', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:04:27');
INSERT INTO `user_record_info` VALUES ('89', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:21:33');
INSERT INTO `user_record_info` VALUES ('90', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:22:02');
INSERT INTO `user_record_info` VALUES ('93', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:27:00');
INSERT INTO `user_record_info` VALUES ('94', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:30:09');
INSERT INTO `user_record_info` VALUES ('95', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:46:45');
INSERT INTO `user_record_info` VALUES ('96', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:48:44');
INSERT INTO `user_record_info` VALUES ('97', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:50:16');
INSERT INTO `user_record_info` VALUES ('98', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 11:50:35');
INSERT INTO `user_record_info` VALUES ('99', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:21:18');
INSERT INTO `user_record_info` VALUES ('100', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:22:32');
INSERT INTO `user_record_info` VALUES ('101', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:27:21');
INSERT INTO `user_record_info` VALUES ('102', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:29:15');
INSERT INTO `user_record_info` VALUES ('103', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:35:52');
INSERT INTO `user_record_info` VALUES ('104', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 12:37:20');
INSERT INTO `user_record_info` VALUES ('105', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:00:25');
INSERT INTO `user_record_info` VALUES ('106', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:02:40');
INSERT INTO `user_record_info` VALUES ('107', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:03:25');
INSERT INTO `user_record_info` VALUES ('108', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:05:27');
INSERT INTO `user_record_info` VALUES ('109', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:06:23');
INSERT INTO `user_record_info` VALUES ('110', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:08:08');
INSERT INTO `user_record_info` VALUES ('111', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:09:11');
INSERT INTO `user_record_info` VALUES ('112', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:11:10');
INSERT INTO `user_record_info` VALUES ('113', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:13:25');
INSERT INTO `user_record_info` VALUES ('114', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:14:12');
INSERT INTO `user_record_info` VALUES ('115', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:27:13');
INSERT INTO `user_record_info` VALUES ('116', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:28:40');
INSERT INTO `user_record_info` VALUES ('117', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:29:46');
INSERT INTO `user_record_info` VALUES ('118', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:30:50');
INSERT INTO `user_record_info` VALUES ('119', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:31:33');
INSERT INTO `user_record_info` VALUES ('120', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:33:17');
INSERT INTO `user_record_info` VALUES ('121', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:34:41');
INSERT INTO `user_record_info` VALUES ('122', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:35:16');
INSERT INTO `user_record_info` VALUES ('123', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:36:38');
INSERT INTO `user_record_info` VALUES ('124', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:38:00');
INSERT INTO `user_record_info` VALUES ('125', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:39:16');
INSERT INTO `user_record_info` VALUES ('126', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:39:50');
INSERT INTO `user_record_info` VALUES ('127', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:42:47');
INSERT INTO `user_record_info` VALUES ('128', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:45:57');
INSERT INTO `user_record_info` VALUES ('129', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:47:08');
INSERT INTO `user_record_info` VALUES ('130', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:48:24');
INSERT INTO `user_record_info` VALUES ('131', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:50:21');
INSERT INTO `user_record_info` VALUES ('132', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:51:07');
INSERT INTO `user_record_info` VALUES ('133', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:51:58');
INSERT INTO `user_record_info` VALUES ('134', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:53:16');
INSERT INTO `user_record_info` VALUES ('135', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:54:30');
INSERT INTO `user_record_info` VALUES ('136', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:55:20');
INSERT INTO `user_record_info` VALUES ('137', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 13:56:14');
INSERT INTO `user_record_info` VALUES ('138', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 14:03:41');
INSERT INTO `user_record_info` VALUES ('139', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 14:05:45');
INSERT INTO `user_record_info` VALUES ('140', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 14:08:15');
INSERT INTO `user_record_info` VALUES ('141', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:06:35');
INSERT INTO `user_record_info` VALUES ('142', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:21:40');
INSERT INTO `user_record_info` VALUES ('143', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:25:21');
INSERT INTO `user_record_info` VALUES ('144', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:33:58');
INSERT INTO `user_record_info` VALUES ('145', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:37:21');
INSERT INTO `user_record_info` VALUES ('146', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 15:47:13');
INSERT INTO `user_record_info` VALUES ('147', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:04:52');
INSERT INTO `user_record_info` VALUES ('148', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:11:02');
INSERT INTO `user_record_info` VALUES ('149', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:12:12');
INSERT INTO `user_record_info` VALUES ('150', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:15:48');
INSERT INTO `user_record_info` VALUES ('151', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:16:40');
INSERT INTO `user_record_info` VALUES ('152', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:17:41');
INSERT INTO `user_record_info` VALUES ('153', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:30:37');
INSERT INTO `user_record_info` VALUES ('154', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:35:34');
INSERT INTO `user_record_info` VALUES ('155', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:39:46');
INSERT INTO `user_record_info` VALUES ('156', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:40:51');
INSERT INTO `user_record_info` VALUES ('157', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:44:39');
INSERT INTO `user_record_info` VALUES ('158', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:46:23');
INSERT INTO `user_record_info` VALUES ('159', 'omcrY1IQHdAA_CnX5nbFF4n9-_mk', '2019-08-02 16:48:29');
