-- ----------------------------
-- Table structure for sys_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl`;
CREATE TABLE `sys_acl` (
  `id` INT(11) NOT NULL,
  `code` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '权限代码',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '权限名称',
  `acl_module_id` INT(11) NOT NULL DEFAULT '0' COMMENT '权限所在的权限模块id',
  `url` VARCHAR(100) NOT NULL DEFAULT '' COMMENT 'q请求的url，可以填正则表达式',
  `type` INT(11) NOT NULL DEFAULT '1' COMMENT '1:菜单2：按钮3：其他',
  `status` INT(11) NOT NULL DEFAULT '1' COMMENT '1:正常0冻结2：删除',
  `seq` INT(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `operator` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '最后一次操作者',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT ' 最后一次 操作时间 ',
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '' COMMENT 'the lastest operate ip',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_acl_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl_module`;
CREATE TABLE `sys_acl_module` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '权限模块id',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '权限模块名称',
  `parent_id` INT(11) NOT NULL DEFAULT '0' COMMENT '上级权限模块的id',
  `level` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '权限模块的层级',
  `seq` INT(11) NOT NULL DEFAULT '0' COMMENT ' 权限模块在 当前层级下的顺序 由小到大',
  `status` INT(11) NOT NULL DEFAULT '1' COMMENT '1 :正常 0：冻结 2：删除',
  `remark` VARCHAR(255) DEFAULT NULL,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次创建时间',
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '最后一次更新的操作者',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '部门名称',
  `parent_id` INT(11) NOT NULL DEFAULT '0' COMMENT '上级部门id',
  `level` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '部门层级',
  `seq` INT(11) NOT NULL DEFAULT '0',
  `remark` VARCHAR(255) DEFAULT NULL,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次创建时间',
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '最后一次更新的操作者',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `type` INT(11) NOT NULL DEFAULT '0' COMMENT '1：部门2用户3权限模块4权限5角色6角色用户关系7角色权限关系',
  `target_id` INT(11) NOT NULL,
  `old_value` TEXT,
  `new_value` TEXT,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '',
  `status` INT(11) NOT NULL DEFAULT '0' COMMENT '当前是否复原0没有1复原过',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'role''s id',
  `name` VARCHAR(20) NOT NULL,
  `type` INT(11) NOT NULL DEFAULT '1' COMMENT 'role''s type  1:admin 2:other',
  `status` INT(11) NOT NULL DEFAULT '1' COMMENT '1:on 2:freez',
  `remark` VARCHAR(200) DEFAULT NULL,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_role_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_acl`;
CREATE TABLE `sys_role_acl` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `role_id` INT(11) NOT NULL,
  `acl_id` INT(11) NOT NULL,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `role_id` INT(11) NOT NULL,
  `user_id` INT(11) NOT NULL,
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) NOT NULL COMMENT '用户id',
  `telephone` VARCHAR(13) NOT NULL DEFAULT '' COMMENT '手机号',
  `mail` VARCHAR(20) NOT NULL DEFAULT '',
  `password` VARCHAR(40) NOT NULL DEFAULT '',
  `dept_id` INT(11) NOT NULL DEFAULT '0' COMMENT 'y用户部门的id',
  `status` INT(11) NOT NULL DEFAULT '1' COMMENT '1:正常 0：冻结 2：删除',
  `operator` VARCHAR(20) NOT NULL DEFAULT '',
  `operate_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `operate_ip` VARCHAR(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

