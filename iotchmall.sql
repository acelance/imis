/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.5.58 : Database - iotch_lattices_cabinet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`iotch_lattices_cabinet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `iotch_lattices_cabinet`;

/*Table structure for table `tt_authority_info` */

DROP TABLE IF EXISTS `tt_authority_info`;

CREATE TABLE `tt_authority_info` (
  `Auth_Code` varchar(20) NOT NULL COMMENT '权限编码',
  `Auth_Name` varchar(20) NOT NULL COMMENT '权限名称',
  `Menu_Code` varchar(50) DEFAULT NULL COMMENT '所属菜单编码',
  `Auth_Note` varchar(255) DEFAULT NULL COMMENT '权限详细描述备注',
  `Auth_Bitmap` varchar(255) DEFAULT NULL COMMENT '权限指定图标(若需要指定图标则填写,默认为空)',
  `Auth_URL` varchar(255) DEFAULT NULL COMMENT '权限请求资源路径(若需要则填写,默认为空)',
  PRIMARY KEY (`Auth_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限对应菜单信息表';

/*Data for the table `tt_authority_info` */

insert  into `tt_authority_info`(`Auth_Code`,`Auth_Name`,`Menu_Code`,`Auth_Note`,`Auth_Bitmap`,`Auth_URL`) values ('01A01R','设备数量R','01','读取设备状态(R:read,C:create,U:update,D:delete,UA:updateAll(批量更新),DA:批量删除,FL:功能列表显示)',NULL,'/dev/devsurvey'),('01A02R','今日销售额R','01','读取今日销售额',NULL,'/sellinfo/amount'),('01A03R','待办事项R','01','读取待办事项',NULL,'/todo/list'),('01A04R','系统通知R','01','读取系统通知',NULL,'/systemmsg'),('01A05R','销售统计R','01','读取销售统计信息',NULL,'/sell/statisic'),('01A06R','订单比例R','01','读取订单比例信息',NULL,'/order/proportions'),('01A07R','支付比例R','01','读取支付比例信息',NULL,'/payinfo/proportions'),('01A08R','销售排行榜R','01','读取销售排行榜信息',NULL,'/sellinfo/topsell');

/*Table structure for table `tt_menu_info` */

DROP TABLE IF EXISTS `tt_menu_info`;

CREATE TABLE `tt_menu_info` (
  `Menu_Code` varchar(20) NOT NULL COMMENT '菜单编码',
  `Menu_Name` varchar(20) NOT NULL COMMENT '菜单名',
  `Subset_Name` varchar(50) DEFAULT NULL COMMENT '子集名称',
  `Bitmap_Name` varchar(255) DEFAULT NULL COMMENT '图标名称',
  `Object_Name` varchar(255) DEFAULT NULL COMMENT '对象名称',
  `Object_URL` varchar(255) DEFAULT NULL COMMENT '对象URL',
  `Object_Type` varchar(5) DEFAULT NULL COMMENT '对象类型(0:菜单,1:按钮)',
  `Parent_Code` varchar(20) DEFAULT NULL COMMENT '父级菜单编码',
  PRIMARY KEY (`Menu_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单信息表';

/*Data for the table `tt_menu_info` */

insert  into `tt_menu_info`(`Menu_Code`,`Menu_Name`,`Subset_Name`,`Bitmap_Name`,`Object_Name`,`Object_URL`,`Object_Type`,`Parent_Code`) values ('01','首页',NULL,'fa fa-home','HOME-PAGE','/homepage','0',NULL),('02','点位信息',NULL,'fa fa-map-marker','POINT-INFO',NULL,'0',NULL),('0201','区域管理',NULL,NULL,'AREA-MANAGER','/areamgr','0','02'),('0202','线路管理',NULL,NULL,'LINE-MANAGER','/linemgr','0','02'),('0203','点位管理',NULL,NULL,'POINT-MANAGER','/pointmgr','0','02'),('03','售货机',NULL,'fa fa-building','VENDING-MACHINE',NULL,'0',NULL),('0301','售货机状态',NULL,NULL,'MACHINCE-STATUS','/macstatus','0','03'),('0302','售货机远程升级',NULL,NULL,'MACHINCE-REMOTE-UPDATE','/remoteupdate','0','03'),('04','商品管理',NULL,'fa fa-shopping-cart','PRODUCT-MANAGER',NULL,'0',NULL),('0401','商品信息管理',NULL,NULL,'PRODUCT-INFO','/productinfo','0','04'),('0402','商品分类管理',NULL,NULL,'PRODUCT-CATEGORY','/productcategory','0','04'),('0403','商品原料管理',NULL,NULL,'RAW-MATERIAL','/rawmaterial','0','04'),('0404','商品原料分类',NULL,NULL,'RAW-MATERIAL-CATEGORY','/materialcategory','0','04'),('05','运营管理',NULL,'fa fa-laptop','OPERATION-MANAGER',NULL,'0',NULL),('0501','售货机认领',NULL,NULL,'MACHINCE-CLAIM','/macclaim','0','05'),('0502','配货管理',NULL,NULL,'GOODS-DISTRIBUTION','/goodsdistribute','0','05'),('0503','库存监控',NULL,NULL,'INVENTORY-CONTROL','/inventoryctrl','0','05'),('0504','补货计划',NULL,NULL,'REPLENISH-PLAN','/replenishplan','0','05'),('0505','补货记录',NULL,NULL,'REPLENISH-RECORD','/replenishrecord','0','05'),('06','智能报表',NULL,'fa fa-bar-chart','INTEL-REPORT',NULL,'0',NULL),('0601','营业统计',NULL,NULL,'BUSINESS-STATISTICS','/business','0','06'),('0602','交易明细',NULL,NULL,'TRADE-DETAILS','/tradedetails','0','06'),('0603','点位销售排行',NULL,NULL,'POINT-SELL-RANKINGS','/pointsell','0','06'),('0604','商品销售排行',NULL,NULL,'PRODUCT-SELL-RANKINGS','/productsell','0','06'),('07','系统消息',NULL,'fa fa-envelope-o','SYS-MSG',NULL,'0',NULL),('0701','报警消息管理',NULL,NULL,'WARN-MSG-MGR','/warnmsg','0','07'),('0702','预警信息管理',NULL,NULL,'EARLY-WARN-MSG','/earlywarn','0','07'),('0703','提醒信息管理',NULL,NULL,'REMIND-MSG-MGR','/remindmsg','0','07'),('0704','消息日志',NULL,NULL,'MSG-LOG','/msglog','0','07'),('08','支付管理',NULL,'fa fa-rmb','PAY-MGR',NULL,'0',NULL),('0801','支付管理',NULL,NULL,'PAY-MGR-INF','/payinfomgr','0','08'),('09','运营商',NULL,'fa fa-user','OPR-MGR',NULL,'0',NULL),('0901','运营商管理',NULL,NULL,'OPR-INF-MGR','/oprinfomgr','0','09'),('0902','组织架构',NULL,NULL,'ORG-STRUCTURE','/orgstructure','0','09'),('0903','角色管理',NULL,NULL,'ROLE-MGR','/rolemgr','0','09'),('0904','员工管理',NULL,NULL,'EMPLOYEE-MGR','/employeemgr','0','09'),('0905','运营商配置',NULL,NULL,'OPR-CONFIG','/oprconfig','0','09'),('10','公众号配置',NULL,'fa fa-wechat','WECHAT-OFFICIAL-ACCOUNT',NULL,'0',NULL),('1001','公众号配置',NULL,NULL,'OFFICIAL-ACCOUNT-CONFIG','/wechatconfig','0','10'),('1002','底部菜单',NULL,NULL,'BOTTOM-MENU','/bottommenu','0','10'),('1003','模板消息',NULL,NULL,'TEMPLATE-MSG','/templatemsg','0','10'),('11','客服',NULL,'fa fa-phone','CUSTOMER-SERVICE',NULL,'0','10'),('1101','异常订单处理',NULL,NULL,'EXCEPTION-ORDER-PROCESS','/exceptionorder','0','11');

/*Table structure for table `tt_operators_info` */

DROP TABLE IF EXISTS `tt_operators_info`;

CREATE TABLE `tt_operators_info` (
  `Opr_Code` varchar(20) NOT NULL COMMENT '运营商编码',
  `Opr_Name` varchar(50) NOT NULL COMMENT '运营商名称',
  `Opr_Phone` varchar(20) NOT NULL COMMENT '运营商用于登录注册的手机号码',
  `Opr_Logo` varchar(255) NOT NULL COMMENT '运营商LOGO图片路径',
  `Opr_Role_Code` varchar(20) NOT NULL COMMENT '运营商所属角色编码',
  `Opr_Level` varchar(10) NOT NULL COMMENT '运营商等级',
  `Parent_Code` varchar(20) NOT NULL COMMENT '父级运营商编码',
  `Opr_Account` varchar(20) NOT NULL COMMENT '运营商账号(默认与手机号一致)',
  `Opr_Password` varchar(50) NOT NULL COMMENT '运营商密码,初始密码手机后6位+abc(密码长度要求9-12),MD5加密',
  `Opr_Status` varchar(10) NOT NULL DEFAULT '0' COMMENT '运营商状态0:待审核,1:审核通过,2:禁用',
  `Opr_Reg_Date` datetime NOT NULL COMMENT '运营商注册日期',
  `Last_Edit_Time` datetime DEFAULT NULL COMMENT '运营商信息更新时间',
  `Opr_Note` varchar(100) DEFAULT NULL COMMENT '运行商信息详情'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营商信息表';

/*Data for the table `tt_operators_info` */

/*Table structure for table `tt_role_authority` */

DROP TABLE IF EXISTS `tt_role_authority`;

CREATE TABLE `tt_role_authority` (
  `Role_Code` varchar(20) NOT NULL,
  `Auth_Code` varchar(20) NOT NULL,
  PRIMARY KEY (`Role_Code`,`Auth_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色-菜单权限-对应信息表';

/*Data for the table `tt_role_authority` */

insert  into `tt_role_authority`(`Role_Code`,`Auth_Code`) values ('0','01A01R'),('0','01A02R'),('0','01A03R'),('0','01A04R'),('0','01A05R'),('0','01A06R'),('0','01A07R'),('0','01A08R');

/*Table structure for table `tt_role_info` */

DROP TABLE IF EXISTS `tt_role_info`;

CREATE TABLE `tt_role_info` (
  `Role_Code` varchar(20) NOT NULL COMMENT '角色编码',
  `Role_Name` varchar(100) NOT NULL COMMENT '角色名称',
  `Role_Desc` varchar(20) DEFAULT NULL COMMENT '角色描述',
  `Superior_Role` varchar(20) DEFAULT NULL COMMENT '上级角色编号(0:超级管理员,00:总运营商,01:一级运营商(一级合作客户),02:加盟商(二级运营商/二级合作客户)/10:总运营商系统管理员,11:一级运营商系统管理员,12:二级运营商系统管理员|20:|30:补货人员,31:财务人员,32:客服人员)',
  `Role_Status` varchar(5) DEFAULT '0' COMMENT '角色状态(0:待审核,1:审核通过,2:禁用)',
  `Create_Time` datetime NOT NULL COMMENT '角色创建时间',
  `Last_Edit_Time` datetime DEFAULT NULL COMMENT '最后一次编辑时间',
  `Role_Type` varchar(10) NOT NULL COMMENT '角色类型(0:超级管理员,1:运行商类,2:员工类)',
  PRIMARY KEY (`Role_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tt_role_info` */

insert  into `tt_role_info`(`Role_Code`,`Role_Name`,`Role_Desc`,`Superior_Role`,`Role_Status`,`Create_Time`,`Last_Edit_Time`,`Role_Type`) values ('0','超级管理员','超级管理员拥有最高权限',NULL,'1','2018-06-19 14:16:46',NULL,'0'),('00','总运营商','商城的总运营商',NULL,'1','2018-06-19 14:18:06',NULL,'1'),('01','一级运营商','总运营商下的一级合作客户','00','1','2018-06-19 14:19:27',NULL,'1'),('02','加盟商','二级运营商/二级客户','01','1','2018-06-19 14:20:41',NULL,'1'),('10','总运营管理员','直属总运营商','00','1','2018-06-19 14:36:09',NULL,'2'),('11','总运营财务员','直属总运营商的财务员','00','1','2018-06-19 14:38:45',NULL,'2'),('12','总运营补货员','直属总运营商的补货员','00','1','2018-06-19 14:39:49',NULL,'2'),('13','总运营客服员','直属总运营商客服专员','00','1','2018-06-19 14:41:12',NULL,'2'),('20','一级管理员','直属一级运营商','01','1','2018-06-19 14:42:24',NULL,'2'),('21','一级财务员','直属一级运营商财务员','01','1','2018-06-19 14:44:05',NULL,'2'),('22','一级补货员','直属一级运营商的补货员','01','1','2018-06-19 14:44:53',NULL,'2'),('23','一级客服员','直属一级运营商的客服专员','01','1','2018-06-19 14:45:44',NULL,'2'),('31','加盟商管理员','直属加盟商的管理员','02','1','2018-06-19 14:48:07',NULL,'2'),('32','加盟商财务员','直属加盟商的财务员','02','1','2018-06-19 14:48:53',NULL,'2'),('33','加盟商客服员','直属加盟商的客服人员','02','1','2018-06-19 14:49:42',NULL,'2');

/*Table structure for table `tt_role_menu` */

DROP TABLE IF EXISTS `tt_role_menu`;

CREATE TABLE `tt_role_menu` (
  `Role_Code` varchar(20) NOT NULL,
  `Menu_Code` varchar(20) NOT NULL,
  PRIMARY KEY (`Role_Code`,`Menu_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单对应信息表';

/*Data for the table `tt_role_menu` */

insert  into `tt_role_menu`(`Role_Code`,`Menu_Code`) values ('0','01'),('0','02'),('0','0201'),('0','0202'),('0','0203'),('0','03'),('0','0301'),('0','0302'),('0','04'),('0','0401'),('0','0402'),('0','0403'),('0','0404'),('0','05'),('0','0501'),('0','0502'),('0','0503'),('0','0504'),('0','0505'),('0','06'),('0','0601'),('0','0602'),('0','0603'),('0','0604'),('0','07'),('0','0701'),('0','0702'),('0','0703'),('0','0704'),('0','08'),('0','0801'),('0','09'),('0','0901'),('0','0902'),('0','0903'),('0','0904'),('0','0905'),('0','10'),('0','1001'),('0','1002'),('0','1003'),('0','11'),('0','1101'),('00','01'),('00','02'),('00','0201'),('00','0202'),('00','0203'),('00','03'),('00','0301'),('00','0302'),('00','04'),('00','0401'),('00','0402'),('00','0403'),('00','0404'),('00','05'),('00','0501'),('00','0502'),('00','0503'),('00','0504'),('00','0505'),('00','06'),('00','0601'),('00','0602'),('00','0603'),('00','0604'),('00','07'),('00','0701'),('00','0702'),('00','0703'),('00','08'),('00','0801'),('00','09'),('00','0901'),('00','0902'),('00','0903'),('00','0904'),('00','0905'),('00','10'),('00','1001'),('00','1002'),('00','1003'),('00','11'),('00','1101');

/*Table structure for table `tt_test_table` */

DROP TABLE IF EXISTS `tt_test_table`;

CREATE TABLE `tt_test_table` (
  `Test_Code` varchar(20) NOT NULL COMMENT '测试编号',
  `Test_Name` varchar(100) NOT NULL COMMENT '测试名称',
  `Test_Note` varchar(20) DEFAULT NULL COMMENT '测试备注',
  PRIMARY KEY (`Test_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tt_test_table` */

/*Table structure for table `tt_user_info` */

DROP TABLE IF EXISTS `tt_user_info`;

CREATE TABLE `tt_user_info` (
  `User_Code` varchar(20) NOT NULL COMMENT '用户编号',
  `User_Name` varchar(20) NOT NULL COMMENT '用户名',
  `User_Password` varchar(50) NOT NULL COMMENT '用户密码',
  `User_Phone` varchar(20) NOT NULL COMMENT '用户手机',
  `Role_Code` varchar(20) NOT NULL COMMENT '用户角色编码',
  `User_Create_Date` datetime NOT NULL COMMENT '用户创建日期',
  `Last_Edit_Time` datetime DEFAULT NULL COMMENT '用户信息更新时间',
  `Oper_Code` varchar(20) NOT NULL COMMENT '所属运营商编码',
  `User_Status` varchar(10) NOT NULL COMMENT '用户状态(0:待审核,1:审核通过,2:禁用)',
  `User_Addr` varchar(50) DEFAULT NULL COMMENT '用户地址',
  `User_PostCode` varchar(20) DEFAULT NULL COMMENT '用户邮政编码',
  `User_Company` varchar(20) DEFAULT NULL COMMENT '用户所属公司',
  `User_Tel` varchar(20) DEFAULT NULL COMMENT '用户座机',
  `User_Note` varchar(50) DEFAULT NULL COMMENT '用户备注信息',
  PRIMARY KEY (`User_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tt_user_info` */

insert  into `tt_user_info`(`User_Code`,`User_Name`,`User_Password`,`User_Phone`,`Role_Code`,`User_Create_Date`,`Last_Edit_Time`,`Oper_Code`,`User_Status`,`User_Addr`,`User_PostCode`,`User_Company`,`User_Tel`,`User_Note`) values ('00000','超级管理员','e10adc3949ba59abbe56e057f20f883e','15900001111','0','2018-06-19 10:51:23',NULL,'0','1',NULL,NULL,NULL,NULL,'超级管理员,最高权限');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
