#权限管理

#创建用户 CREATE USER用户名 IDENTIFIED BY ‘密码’,Host adress默认是127.0.0.1
CREATE USER Alex IDENTIFIED BY '123456'

#修改密码（修改当前用户密码）
SET PASSWORD = PASSWORD('654321')

#修改密码（修改指定用户密码）
SET PASSWORD FOR Alex = PASSWORD('654321');