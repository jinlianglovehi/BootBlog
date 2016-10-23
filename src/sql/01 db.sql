

-- 用户信息表
CREATE TABLE IF NOT EXISTS userinfo (
   id  INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) DEFAULT NULL,
  psw VARCHAR (20)DEFAULT NULL,
  age  int(4) DEFAULT NULL,
  PRIMARY KEY (id)
);

-- 创建markdown 数据库

create TABLE  if NOT EXISTS markmdmodel(
  id  INT(11) NOT NULL AUTO_INCREMENT,
  markmd varchar(5000) DEFAULT  NULL ,
  markPath varchar (50) DEFAULT NULL ,
  createDate date  ,
  PRIMARY KEY (id)
);

-- private String markmd; // 保存的markdownd 实体对象
--
-- private String markPath;// 将markdonw 文档保存到文件系统中
-- private Date createDate ;
