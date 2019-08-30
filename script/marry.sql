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
-- Table structure for map_info
-- ----------------------------
DROP TABLE IF EXISTS `map_info`;
CREATE TABLE `map_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name_title` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '导航首页标题，即新郎新娘姓名',
  `solar_calendar` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '结婚日期--阳历',
  `lunar_calendar` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '阴历日期',
  `address` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '地址',
  `longitude` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '举办地址经度',
  `latitude` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '举办地址纬度',
  `bg_img_url` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL COMMENT '背景图片地址',
  `del` int(11) DEFAULT '0' COMMENT '删除标记 0 未删除 1 已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

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
-- Table structure for user_admin_info
-- ----------------------------
DROP TABLE IF EXISTS `user_admin_info`;
CREATE TABLE `user_admin_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='存储用户基本信息，与用户相关的基本表。不存重。查重标准：open_id。';

-- ----------------------------
-- Table structure for user_record_info
-- ----------------------------
DROP TABLE IF EXISTS `user_record_info`;
CREATE TABLE `user_record_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_open_id` varchar(255) DEFAULT NULL COMMENT '用户标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间，即用户登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='用户登录记录表，用户每登录一次，就新增该表一条数据。';
