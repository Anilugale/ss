-- MySQL dump 10.13  Distrib 5.7.16, for Linux (x86_64)
--
-- Host: localhost    Database: super_service
-- ------------------------------------------------------
-- Server version	5.7.16-0ubuntu0.16.04.1

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
-- Table structure for table `complent`
--

DROP TABLE IF EXISTS `complent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `product_code` varchar(45) NOT NULL,
  `short_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complent`
--

LOCK TABLES `complent` WRITE;
/*!40000 ALTER TABLE `complent` DISABLE KEYS */;
INSERT INTO `complent` VALUES (1,'tv not installl','aadfafdsdf','asdfasdf'),(2,'tv not installl','10','asdfasdf'),(3,'tv not installl','10','asdfasdf'),(4,'tv not installl','10','asdfasdf'),(5,'tv not installl','10','asdfasdf'),(6,'tv not installl','10','asdfasdf'),(7,'tv not installl','10','asdfasdf'),(8,'tv not installl','10','asdfasdf'),(9,'tv not installl','10','asdfasdf'),(10,'tv not installl','10','asdfasdf'),(11,'tv not installl','10','asdfasdf'),(12,'tv not installl','10','asdfasdf'),(13,'tv not installl','10','asdfasdf'),(14,'tv not installl','10','asdfasdf'),(15,'tv not installl','10','asdfasdf'),(16,'tv not installl','10','asdfasdf'),(17,'tv not installl','10','asdfasdf'),(18,'tv not installl','10','asdfasdf'),(19,'tv not installl','10','asdfasdf'),(20,'tv not installl','10','asdfasdf'),(21,'tv not installl','10','asdfasdf'),(22,'tv not installl','10','asdfasdf'),(23,'tv not installl','10','asdfasdf'),(24,'tv not installl','10','asdfasdf'),(25,'tv not installl','10','asdfasdf'),(26,'tv not installl','10','asdfasdf'),(27,'tv not installl','10','asdfasdf'),(28,'tv not installl','10','asdfasdf');
/*!40000 ALTER TABLE `complent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(250) NOT NULL,
  `taluka` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `pin_code` varchar(10) NOT NULL,
  `dob` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (10,'anil1','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(11,'anil2','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(12,'anil3','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(13,'anil4','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(14,'anil5','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(15,'anil6','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(16,'anil7','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(17,'anil8','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989),(18,'anil89','test123','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_complent`
--

DROP TABLE IF EXISTS `customer_complent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_complent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marchand_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `complent_text` varchar(250) DEFAULT NULL,
  `extra_info` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_complent`
--

LOCK TABLES `customer_complent` WRITE;
/*!40000 ALTER TABLE `customer_complent` DISABLE KEYS */;
INSERT INTO `customer_complent` VALUES (1,10,10,1,'dfasf','dsfasdf'),(2,10,10,1,'dfasf','dsfasdf'),(3,10,10,1,'dfasf','dsfasdf'),(4,10,10,1,'dfasf','dsfasdf'),(5,10,10,1,'dfasf','dsfasdf'),(6,10,10,1,'dfasf','dsfasdf'),(8,10,10,1,'dfasf','dsfasdf');
/*!40000 ALTER TABLE `customer_complent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marchand`
--

DROP TABLE IF EXISTS `marchand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marchand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(250) NOT NULL,
  `taluka` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `pin_code` varchar(10) NOT NULL,
  `dob` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marchand`
--

LOCK TABLES `marchand` WRITE;
/*!40000 ALTER TABLE `marchand` DISABLE KEYS */;
INSERT INTO `marchand` VALUES (10,'anil123','234hj32h4','anil','ugale','hl12@gmail.com','90908989899','idea ro house','nashik','pune','4110787',1483872989);
/*!40000 ALTER TABLE `marchand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `code` varchar(45) NOT NULL,
  `short_desc` varchar(255) DEFAULT NULL,
  `marchand_id` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (10,'LG tv ','2342343SDFSDFSF','sdfsdfs sd fsd f sdf sd fsd f s sdf sdf','1','TV'),(11,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(12,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(13,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(14,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(15,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(16,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(17,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(18,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(19,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(20,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(21,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(22,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(23,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(24,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(25,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(26,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL),(27,'Lg tv ','23423423 ','sdfhsdh sadfkjashdjfh sdfhjkashdfkjsad sad fhkhsadf  ','1',NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-18 12:45:26
