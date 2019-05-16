-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.16 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for casestudy
CREATE DATABASE IF NOT EXISTS `casestudy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `casestudy`;

-- Dumping structure for table casestudy.address
CREATE TABLE IF NOT EXISTS `address` (
  `address_id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `streetLine1` varchar(255) DEFAULT NULL,
  `streetLine2` varchar(255) DEFAULT NULL,
  `zipCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.address: ~22 rows (approximately)
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`address_id`, `city`, `state`, `streetLine1`, `streetLine2`, `zipCode`) VALUES
	(356, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(359, 'Bronx', 'NY', '1490 Boone Avenue', '6C', '10460'),
	(362, 'kadlkf', 'adfad', 'the qick', 'thej', 'asdfasdf'),
	(365, 'Bronx', 'NY', '1490 Boone Avenue', '234', '10460'),
	(368, 'Bronx', 'NY', '1490 Boone Avenue', '234', '10460'),
	(371, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(374, 'Bronx', 'NY', '1490 Boone Avenue', '345', '10460'),
	(377, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(383, 'kadlkf', 'adfad', 'the qick', 'thej', 'asdfasdf'),
	(389, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(393, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(396, 'Bronx', 'NY', '1490 Boone Avenue', '566', '10460'),
	(400, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(405, 'Bronx', 'New York', '1490 Boone Avenue', '7C', '10460'),
	(409, 'Bronx', 'NY', '1490 Boone Avenue', '7C', '10460'),
	(413, 'Bronx', 'NY', '1490 Boone Avenue', '7C', '10460'),
	(417, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(421, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(426, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(432, 'Bronx', 'NY', '1490 Boone Avenue', '12', '10460'),
	(437, 'New York', 'New York', '240 Greenwich street', '123', '10286'),
	(443, 'New York', 'New York', '240 Greenwich street', '123', '10286');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;

-- Dumping structure for table casestudy.apply
CREATE TABLE IF NOT EXISTS `apply` (
  `application_id` bigint(20) NOT NULL,
  `current_job_location` bit(1) DEFAULT NULL,
  `loan_amount` varchar(255) DEFAULT NULL,
  `PA_score` int(11) DEFAULT NULL,
  `promise` bit(1) DEFAULT NULL,
  `relocation_need` bit(1) DEFAULT NULL,
  `total_tenure` bit(1) DEFAULT NULL,
  PRIMARY KEY (`application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.apply: ~15 rows (approximately)
/*!40000 ALTER TABLE `apply` DISABLE KEYS */;
INSERT INTO `apply` (`application_id`, `current_job_location`, `loan_amount`, `PA_score`, `promise`, `relocation_need`, `total_tenure`) VALUES
	(392, b'1', '10000', 1, b'1', b'1', b'1'),
	(399, b'1', '54654656', 1, b'1', b'1', b'1'),
	(403, b'1', '10,000', 1, b'1', b'1', b'1'),
	(404, b'1', '10,000', 1, b'1', b'1', b'1'),
	(408, b'1', '10000', 1, b'1', b'1', b'1'),
	(412, b'1', '10,000', 1, b'1', b'1', b'1'),
	(416, b'1', '10,000', 4, b'1', b'1', b'1'),
	(420, b'1', '10,000', 5, b'1', b'1', b'1'),
	(424, b'1', '', 0, b'1', b'1', b'1'),
	(425, b'1', '10000', 0, b'1', b'1', b'1'),
	(435, b'1', '10,000', 5, b'1', b'1', b'1'),
	(436, b'1', '10,000', 4, b'1', b'1', b'1'),
	(440, b'1', '10,000', 4, b'1', b'1', b'1'),
	(441, b'1', '10,000', 5, b'1', b'1', b'1'),
	(442, b'1', '10,000', 5, b'1', b'1', b'1');
/*!40000 ALTER TABLE `apply` ENABLE KEYS */;

-- Dumping structure for table casestudy.apply_currentskills
CREATE TABLE IF NOT EXISTS `apply_currentskills` (
  `Apply_application_id` bigint(20) NOT NULL,
  `current_skills` varchar(255) DEFAULT NULL,
  KEY `FK3x0f36j1insrjx1vbmhfcr1h5` (`Apply_application_id`),
  CONSTRAINT `FK3x0f36j1insrjx1vbmhfcr1h5` FOREIGN KEY (`Apply_application_id`) REFERENCES `apply` (`application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.apply_currentskills: ~18 rows (approximately)
/*!40000 ALTER TABLE `apply_currentskills` DISABLE KEYS */;
INSERT INTO `apply_currentskills` (`Apply_application_id`, `current_skills`) VALUES
	(392, 'Java'),
	(392, 'Spring MVC'),
	(399, 'Java'),
	(399, 'Spring MVC'),
	(399, 'JPA'),
	(403, 'Spring MVC'),
	(404, 'Spring MVC'),
	(408, 'HTML'),
	(412, 'Spring MVC'),
	(416, 'Spring MVC'),
	(420, 'Spring MVC'),
	(424, 'Spring MVC'),
	(425, 'JPA'),
	(435, 'Java'),
	(436, 'JPA'),
	(440, 'Spring MVC'),
	(441, 'JPA'),
	(442, 'JPA');
/*!40000 ALTER TABLE `apply_currentskills` ENABLE KEYS */;

-- Dumping structure for table casestudy.authorities
CREATE TABLE IF NOT EXISTS `authorities` (
  `AUTHORITY` varchar(255) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  PRIMARY KEY (`AUTHORITY`,`USERNAME`),
  KEY `FKl8gm1dxqhdixkdsm1p7er9c21` (`USERNAME`),
  CONSTRAINT `FKl8gm1dxqhdixkdsm1p7er9c21` FOREIGN KEY (`USERNAME`) REFERENCES `users` (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.authorities: ~0 rows (approximately)
/*!40000 ALTER TABLE `authorities` DISABLE KEYS */;
INSERT INTO `authorities` (`AUTHORITY`, `USERNAME`) VALUES
	('ROLE_ADMIN', 'admin'),
	('ROLE_USER', 'ahmshahparan'),
	('ROLE_USER', 'aqsa'),
	('ROLE_ADMIN', 'Arshan'),
	('ROLE_USER', 'maria');
/*!40000 ALTER TABLE `authorities` ENABLE KEYS */;

-- Dumping structure for table casestudy.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `employee_id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(25) DEFAULT NULL,
  `lastName` varchar(25) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `address_address_id` bigint(20) NOT NULL,
  `application_application_id` bigint(20) DEFAULT NULL,
  `employeeJobBasic_job_id` bigint(20) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `UK_fopic1oh5oln2khj8eat6ino0` (`email`),
  KEY `FKdc1t5foh8gr6klmrrcnh84dg9` (`address_address_id`),
  KEY `FKb6m1gi0nfh6wtrykw9wuscev0` (`application_application_id`),
  KEY `FK2vvnmv95ysofnp22i4s67tdfm` (`employeeJobBasic_job_id`),
  CONSTRAINT `FK2vvnmv95ysofnp22i4s67tdfm` FOREIGN KEY (`employeeJobBasic_job_id`) REFERENCES `employeejobbasic` (`job_id`),
  CONSTRAINT `FKb6m1gi0nfh6wtrykw9wuscev0` FOREIGN KEY (`application_application_id`) REFERENCES `apply` (`application_id`),
  CONSTRAINT `FKdc1t5foh8gr6klmrrcnh84dg9` FOREIGN KEY (`address_address_id`) REFERENCES `address` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.employee: ~0 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`employee_id`, `email`, `firstName`, `lastName`, `mobile`, `address_address_id`, `application_application_id`, `employeeJobBasic_job_id`) VALUES
	(358, 'ashah@gmail.com', 'A H M', 'Shahparan', '9295054739', 356, NULL, 357),
	(361, 'kawsar.184@gmail.com', 'Kawsar', 'Mohammed', '13473690024', 359, NULL, 360),
	(364, 'rasel@gmail.com', 'Rasel', 'Fazal', '6546257334', 362, NULL, 363),
	(367, 'kawsar.18434345@gmail.com', 'Kawsar', 'Mohammed', '13473690024', 365, NULL, 366),
	(370, 'kawsar.18434345123@gmail.com', 'Kawsar', 'Mohammed', '13473690024', 368, NULL, 369),
	(373, 'sl@gmail.com', 'A H M', 'Shahparan', '9295054739', 371, NULL, 372),
	(376, 'kawsar_101@yahoo.com', 'Kawsar', 'Mohammed', '3473690024', 374, NULL, 375),
	(379, 'shahida@gmail.com', 'Shahida', 'Lucky', '9295054739', 377, NULL, 378),
	(385, 'rasel1234@gmail.com', 'Rasel', 'Fazal', '6546257334', 383, NULL, 384),
	(391, 'ashah0000@gmail.com', 'A H', 'Shahparan', '9295054739', 389, 392, 390),
	(395, 'xyc@gmail.com', 'A H M', 'Shahparan', '9295054739', 393, NULL, 394),
	(398, 'kawsar_101@yahoo.co', 'Kawsar', 'Mohammed', '3473690024', 396, 424, 397),
	(402, 'lucky@yahoo.com', 'Shahida', 'Lucky', '19295054739', 400, 404, 401),
	(407, 'aqsa@gmail.com', 'Aqsa', 'Kawsar', '9295054739', 405, 408, 406),
	(411, 'badal@yahoo.com', 'Badal', 'Kawsar', '13473690024', 409, 412, 410),
	(415, 'mohammed@gmail.com', 'Kawsar', 'Mohammed', '13473690024', 413, 416, 414),
	(419, 'akhi@gmail.com', 'Fahmida', 'Akhi', '9295054739', 417, 420, 418),
	(423, 'asd@live.com', 'Shahida', 'Lucky', '9295054739', 421, 425, 422),
	(428, 'as@gmail.com', 'A H M', 'Shahparan', '9295054739', 426, 442, 427),
	(434, 'Maria@gmail.com', 'Sharon', 'Maria', '3473690024', 432, 435, 433),
	(439, 'aqsa123@gmail.com', 'Aqsa', 'Kawsar', '9295054739', 437, 440, 438),
	(445, 'arshan@yahoo.com', 'Arshan', 'Kawsar', '9295054739', 443, NULL, 444);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Dumping structure for table casestudy.employeejobbasic
CREATE TABLE IF NOT EXISTS `employeejobbasic` (
  `job_id` bigint(20) NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `inService` bit(1) DEFAULT NULL,
  `joinDate` datetime NOT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.employeejobbasic: ~22 rows (approximately)
/*!40000 ALTER TABLE `employeejobbasic` DISABLE KEYS */;
INSERT INTO `employeejobbasic` (`job_id`, `designation`, `inService`, `joinDate`) VALUES
	(357, 'SE', b'1', '2019-04-30 23:00:00'),
	(360, 'SD', b'1', '2019-04-30 23:00:00'),
	(363, 'SD', b'1', '2019-04-30 23:00:00'),
	(366, 'SD', b'1', '2019-04-30 23:00:00'),
	(369, 'SD', b'1', '2019-04-30 23:00:00'),
	(372, 'SD', b'1', '2019-04-30 23:00:00'),
	(375, 'SD', b'1', '2019-04-30 23:00:00'),
	(378, 'SD', b'1', '2019-04-30 23:00:00'),
	(384, 'SE', b'1', '2019-04-30 23:00:00'),
	(390, 'SD', b'1', '2019-04-30 23:00:00'),
	(394, 'SD', b'1', '2019-04-30 23:00:00'),
	(397, 'SD', b'1', '2019-04-30 23:00:00'),
	(401, 'SD', b'1', '2019-05-03 23:00:00'),
	(406, 'CIO', b'1', '2019-04-30 23:00:00'),
	(410, 'ProgramManager', b'1', '2019-05-01 23:00:00'),
	(414, 'SDET', b'1', '2019-05-01 23:00:00'),
	(418, 'Developer', b'1', '2019-05-02 23:00:00'),
	(422, 'Developer', b'1', '2019-04-30 23:00:00'),
	(427, 'Developer', b'1', '2019-04-30 23:00:00'),
	(433, 'Developer', b'1', '2019-04-30 23:00:00'),
	(438, 'Developer', b'1', '2019-05-03 23:00:00'),
	(444, 'ProjectManager', b'1', '2019-05-05 23:00:00');
/*!40000 ALTER TABLE `employeejobbasic` ENABLE KEYS */;

-- Dumping structure for table casestudy.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.hibernate_sequence: ~3 rows (approximately)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(446),
	(446),
	(446);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table casestudy.users
CREATE TABLE IF NOT EXISTS `users` (
  `USERNAME` varchar(255) NOT NULL,
  `ENABLED` bit(1) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `employee_employee_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`USERNAME`),
  KEY `FK1cm2onldw6uaccimr8jtrw4bn` (`employee_employee_id`),
  CONSTRAINT `FK1cm2onldw6uaccimr8jtrw4bn` FOREIGN KEY (`employee_employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table casestudy.users: ~5 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`USERNAME`, `ENABLED`, `PASSWORD`, `employee_employee_id`) VALUES
	('admin', b'1', '$2a$10$iVgerMzgmHE31GoV7WGX6.CoNI0zWpq1Do8kxxEOWGklqQTBYTYqi', NULL),
	('ahmshahparan', b'1', '$2a$10$iVgerMzgmHE31GoV7WGX6.CoNI0zWpq1Do8kxxEOWGklqQTBYTYqi', 428),
	('aqsa', b'1', '$2a$10$t4vEyd1jymc8u0TxxjQSq.bgPZXr2WT9Mqh5I8N/UFm.F6igC9BbO', 439),
	('Arshan', b'1', '$2a$10$8MeBrbTTcisOFb5wRvDuqugLny0HwDkEBgj/ofWMN4JcR3/qwJkA2', 445),
	('maria', b'1', '$2a$10$hNmXi0Itrwyq4KF6jYmU9ecr8bBzbZCb1IvYsaOhzKitagXxD6O/q', 434);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
