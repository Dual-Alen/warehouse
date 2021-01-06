-- user		用户表	 	字段:ID	姓名	手机号码	邮箱	角色名称	用户名	密码

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                        `name` varchar(32) DEFAULT NULL COMMENT '姓名',
                        `phone` char(11) DEFAULT NULL COMMENT '手机号码',
                        `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
                        `roleName` varchar(64) DEFAULT NULL COMMENT '角色名称',
                        `username` varchar(255) DEFAULT NULL COMMENT '用户名',
                        `password` varchar(255) DEFAULT NULL COMMENT '密码',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-- role  角色表  字段 ID、角色职位**

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                        `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
                        PRIMARY KEY (`id`),
                        KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- user_role		用户角色表 字段 id，uid，rid**

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT 'UID',
  `rid` int(11) DEFAULT NULL COMMENT 'RID',
  PRIMARY KEY (`id`),
  KEY `deu` (`uid`),
  KEY `der` (`rid`),
  CONSTRAINT `der` FOREIGN KEY (`rid`) REFERENCES `role` (`id`) ON DELETE CASCADE,
  CONSTRAINT `deu` FOREIGN KEY (`uid`) REFERENCES `user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- goods 		货物**
-- 字段 id、商品编号、商品名、规格型号、单位、总数、入库价格、出库价格、最低库存** 备注

DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `num` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `name` varchar(64) DEFAULT NULL COMMENT '商品名',
  `type` varchar(64) DEFAULT NULL COMMENT '商品类型',
  `spe_model` varchar(64) DEFAULT NULL COMMENT '规格型号',
  `unit` varchar(64) DEFAULT NULL COMMENT '单位',
  `sum` double(64,0) DEFAULT NULL COMMENT '总数',
  `in_price` double(64,0) DEFAULT NUll COMMENT '入库进价',
  `out_price` double(64,0) DEFAULT NUll COMMENT '出库售价',
  `cordon` double(64,0) DEFAULT NULL COMMENT '最低库存',
  `note` varchar(128) DEFAULT NULL COMMENT '备注',

                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- order_list		订单详细信息**
-- 字段 id，商品名，商品编号、订单编号，商品价格，商品数量，是否支付，下单时间、是否发货、物流信息、总金额、备注**

DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `num` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `name` varchar(128) NOT NULL comment '商品名',
  `orderNum` varchar(128) DEFAULT NULL COMMENT '订单编号',
  `price` double(64,0) DEFAULT NULL COMMENT '商品价格',
  `count` int(64) DEFAULT NULL COMMENT '商品数量',
  `pay` tinyint(1) DEFAULT NULL COMMENT '是否支付',
  `date` datetime DEFAULT NULL COMMENT '下单时间',
  `transport` tinyint(1) DEFAULT NULL COMMENT '是否发货',
  `orderState`varchar(128) DEFAULT NULL COMMENT '快递单号',
  `sum_price` double(64,0) DEFAULT NULL COMMENT '总金额',
  `note` varchar(128) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-- client	客户表	字段 id、名字，电话，地址，公司、备注， 逻辑删除**

DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(64) DEFAULT NULL COMMENT '名字',
  `phone` varchar(64) DEFAULT NULL COMMENT '电话',
  `address` varchar(128) DEFAULT NULL COMMENT '地址',
  `company` varchar(128) DEFAULT NULL COMMENT '公司',
  `note` varchar(128) DEFAULT NULL COMMENT '备注',
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- supplier	供应商表	字段 id，角色、名字，电话，地址，公司、备注， 逻辑删除**

DROP TABLE IF EXISTS ` supplier`;
CREATE TABLE  supplier (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(64) DEFAULT NULL COMMENT '名字',
  `phone` varchar(64) DEFAULT NULL COMMENT '运单号',
  `address` varchar(128) DEFAULT NULL COMMENT '名字',
  `company` varchar(128) DEFAULT NULL COMMENT '公司',
  `note` varchar(128) DEFAULT NULL COMMENT '备注',
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-- client_order	订单  订单类型**

DROP TABLE IF EXISTS `client_order`;
CREATE TABLE `client_order` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `cid` int(32) DEFAULT NULL COMMENT 'CID',
  `oid` int(32) DEFAULT NULL COMMENT 'OID',
  `type`  tinyint(1) DEFAULT '1',

  PRIMARY KEY (`id`),
  KEY `oid` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- warehouse		仓库	字段：ID、仓库名、地址、容量、使用的容量、备注**

DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(64) DEFAULT NULL COMMENT '仓库名',
  `address` varchar(128) DEFAULT NULL COMMENT '地址',
  `capacity` double(64,2) DEFAULT '0.00' COMMENT '总容量',
  `used` double(64,2) DEFAULT '0.00' COMMENT '已使用',
  `note` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- warehouse_goods	仓库货物 字段：ID、仓库ID，货物ID**

DROP TABLE IF EXISTS `warehouse_goods`;
CREATE TABLE `warehouse_goods` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `wid` int(32) DEFAULT NULL COMMENT 'WID',
  `gid` int(32) DEFAULT NULL COMMENT 'GID',
  `count` int(32) DEFAULT 0 COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

