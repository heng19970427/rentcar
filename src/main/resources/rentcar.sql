-- MySQL dump 10.13  Distrib 5.7.14, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: rentcar
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `car_id` int(11) NOT NULL,
  `color` varchar(45) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `carcol` varchar(45) DEFAULT NULL,
  `fueltype` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `frame_id` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `img` varchar(45) DEFAULT NULL,
  `rentfee` float DEFAULT NULL,
  `deposit` float DEFAULT NULL,
  `capacity` float DEFAULT NULL,
  `initfuel` float DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`car_id`),
  KEY `user_id_idx` (`userId`),
  CONSTRAINT `car_user` FOREIGN KEY (`userId`) REFERENCES `user` (userId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discount_package`
--

DROP TABLE IF EXISTS discountPackage;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discount_package` (
  `discount_package_id` int(11) NOT NULL,
  `discount_fee` float DEFAULT NULL,
  `day` int(11) DEFAULT NULL,
  PRIMARY KEY (`discount_package_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discount_package`
--

LOCK TABLES discountPackage WRITE;
/*!40000 ALTER TABLE discountPackage DISABLE KEYS */;
/*!40000 ALTER TABLE discountPackage ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idcard`
--

DROP TABLE IF EXISTS IDCard;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idcard` (
  `IDCardId` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `folk` varchar(12) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `IDnum` varchar(19) DEFAULT NULL,
  `agency` varchar(45) DEFAULT NULL,
  `expireStart` date DEFAULT NULL,
  `expireEnd` date DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDCardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idcard`
--

LOCK TABLES IDCard WRITE;
/*!40000 ALTER TABLE IDCard DISABLE KEYS */;
/*!40000 ALTER TABLE IDCard ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insurance`
--

DROP TABLE IF EXISTS `insurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `insurance` (
  `insurance_id` varchar(32) NOT NULL,
  `type` enum('traffic','business') DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `fee` float DEFAULT NULL,
  `expireStart` date DEFAULT NULL,
  `expireEnd` date DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`insurance_id`),
  KEY `car_id_idx` (`car_id`),
  CONSTRAINT `insurance_car` FOREIGN KEY (`car_id`) REFERENCES `car` (carId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance`
--

LOCK TABLES `insurance` WRITE;
/*!40000 ALTER TABLE `insurance` DISABLE KEYS */;
/*!40000 ALTER TABLE `insurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintenance` (
  `maintenance_id` int(11) NOT NULL,
  `company` varchar(45) DEFAULT NULL,
  `fee` float DEFAULT NULL,
  `date` date DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`maintenance_id`),
  KEY `car_id_idx` (`car_id`),
  CONSTRAINT `maintenance_car` FOREIGN KEY (`car_id`) REFERENCES `car` (carId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance`
--

LOCK TABLES `maintenance` WRITE;
/*!40000 ALTER TABLE `maintenance` DISABLE KEYS */;
/*!40000 ALTER TABLE `maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `readed` tinyint(4) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `level` enum('warning','info') DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`notice_id`),
  KEY `user_id_idx` (`userId`),
  CONSTRAINT `notice_user` FOREIGN KEY (`userId`) REFERENCES `user` (userId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  `rentdate` date DEFAULT NULL,
  `returndate` date DEFAULT NULL,
  `returndate_real` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `fee` float DEFAULT NULL,
  `fuelremain` float DEFAULT NULL,
  `invoice` tinyint(4) DEFAULT NULL,
  `discount_package_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `discount_package_id_idx` (`discount_package_id`),
  KEY `user_id_idx` (`userId`),
  KEY `car_id_idx` (`car_id`),
  CONSTRAINT `order_car` FOREIGN KEY (`car_id`) REFERENCES `car` (carId) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order_discount_package` FOREIGN KEY (`discount_package_id`) REFERENCES discountPackage (discountPackageId) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order_user` FOREIGN KEY (`userId`) REFERENCES `user` (userId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peccancy`
--

DROP TABLE IF EXISTS `peccancy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peccancy` (
  `peccancy_id` int(11) NOT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `time` date DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`peccancy_id`),
  KEY `user_id_idx` (`userId`),
  KEY `car_id_idx` (`car_id`),
  CONSTRAINT `peccancy_car` FOREIGN KEY (`car_id`) REFERENCES `car` (carId) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `peccancy_user` FOREIGN KEY (`userId`) REFERENCES `user` (userId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peccancy`
--

LOCK TABLES `peccancy` WRITE;
/*!40000 ALTER TABLE `peccancy` DISABLE KEYS */;
/*!40000 ALTER TABLE `peccancy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repaire`
--

DROP TABLE IF EXISTS `repaire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repaire` (
  `repaire_id` int(11) NOT NULL,
  `company` varchar(45) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `fee` float DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`repaire_id`),
  KEY `car_id_idx` (`car_id`),
  CONSTRAINT `repaire_car` FOREIGN KEY (`car_id`) REFERENCES `car` (carId) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repaire`
--

LOCK TABLES `repaire` WRITE;
/*!40000 ALTER TABLE `repaire` DISABLE KEYS */;
/*!40000 ALTER TABLE `repaire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL,
  `rolename` varchar(45) DEFAULT NULL,
  `needverified` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (roleId, `rolename`, needVerify) VALUES (1,'警官',0),(2,'商家',1),(3,'用户',0);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `token` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `companyLocation` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `account` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `verified` tinyint(4) DEFAULT NULL,
  `verify_id` int(11) DEFAULT NULL,
  `vipLevel` int(11) DEFAULT NULL,
  `IDCardId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `IDCard_id_idx` (`IDCardId`),
  KEY `vip_level_idx` (`vipLevel`),
  KEY `role_id_idx` (`roleId`),
  CONSTRAINT `user_IDCard` FOREIGN KEY (`IDCardId`) REFERENCES IDCard (IDCardId) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_role` FOREIGN KEY (`roleId`) REFERENCES `role` (roleId) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_vip` FOREIGN KEY (`vipLevel`) REFERENCES `vip` (vipLevel) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (userId, `username`, `password`, `token`, `company`, `companyLocation`, `phone`, `account`, `email`, `img`, `note`, `verified`, verifyId, vipLevel, IDCardId, roleId) VALUES (3,'顺丰租车','123',NULL,'顺丰租车','吉州区','','','','','',1,1,1,NULL,2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vip`
--

DROP TABLE IF EXISTS `vip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vip` (
  `vipLevel` int(11) NOT NULL,
  `discount` float DEFAULT NULL,
  PRIMARY KEY (`vipLevel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vip`
--

LOCK TABLES `vip` WRITE;
/*!40000 ALTER TABLE `vip` DISABLE KEYS */;
INSERT INTO `vip` (vipLevel, `discount`) VALUES (1,0.9);
/*!40000 ALTER TABLE `vip` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-23 18:10:41
