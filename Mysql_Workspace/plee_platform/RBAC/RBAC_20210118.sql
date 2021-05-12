#---------用户--------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '密码',
  `email` VARCHAR(36) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `phone` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户手机号',
  #`is_admin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否为超级管理员1:是、0:否，默认不是',
  #`status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '该条记录是否有效1:有效、0：无效',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


#---------角色--------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '角色名',
  #`status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '该记录是否有效1：有效、0：无效',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

#---------权限--------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `permission_menu` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '权限菜单',
  #`uris` varchar(1000) NOT NULL DEFAULT '' COMMENT '权限路径',
  #`status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '该记录是否有效1：有效、0：无效',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


#---------用户角色表--------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `uid` INT(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `role_id` INT(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

#---------角色权限表--------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` INT(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `permission_id` INT(11) NOT NULL DEFAULT '0' COMMENT '权限id',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

#---------操作日志表--------------
DROP TABLE IF EXISTS `operate_log_info`;
CREATE TABLE `operate_log_info` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` INT(11) NOT NULL DEFAULT '0' COMMENT '操作用户id',
  `uname` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '操作用户名',
  `from_ip` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '操作人的机器ip',
  `operate_func` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '操作的功能，例如：登录、插入记录等等',
  `visit_method` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '调用入口的方法',
  `method_cost_time` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '访问方法所花费的时间',
  `log_type` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日志类型:error/info/warn',
  `uri` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '访问路径',
  `method` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '请求方法:post/get/put/delete/head',
  `visit_method_error_info` VARCHAR(1000) NOT NULL DEFAULT '' COMMENT '访问方法的错误信息',
  `status` TINYINT(1) NOT NULL DEFAULT '1' COMMENT '该记录是否有效，1：有效、0：无效',
  `login_out_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登录时间',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



#查询所有人的名字，角色，权限
SELECT u.id,u.user_name,r.role_name,p.permission_menu
FROM USER u 
INNER JOIN user_role ur ON u.id = ur.uid
INNER JOIN ROLE r ON r.id = ur.role_id
INNER JOIN role_permission rp ON r.id = rp.role_id
INNER JOIN permission p ON p.id = rp.role_id


