-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2017 at 04:58 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustNo` int(5) DEFAULT NULL,
  `CustName` text NOT NULL,
  `State` text NOT NULL,
  `CreditLimit` int(10) NOT NULL,
  `RepNo` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustNo`, `CustName`, `State`, `CreditLimit`, `RepNo`) VALUES
(1, 'qwe', 'kansas', 20000, 1),
(2, 'qwerty', 'kansas', 20000, 2),
(3, 'cvv', 'New Jersey', 14000, 2),
(10, 'fgh', 'qwerty', 25000, 5),
(5465, 'sdf', 'qwedfg', 25893, 5);

-- --------------------------------------------------------

--
-- Table structure for table `representative`
--

CREATE TABLE `representative` (
  `RepNo` int(5) DEFAULT NULL,
  `Name` varchar(20) NOT NULL,
  `State` text NOT NULL,
  `Commission` int(2) NOT NULL,
  `Rate` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `representative`
--

INSERT INTO `representative` (`RepNo`, `Name`, `State`, `Commission`, `Rate`) VALUES
(2, 'as', 'dallas', 12, 20),
(1, 'asD', 'KANSAS', 12, 20),
(3, 'zxc', 'Texas', 25, 12),
(5, 'alk', 'qwerty', 25, 12),
(6, 'xcvvb', 'fkghjlfj', 25, 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD UNIQUE KEY `RepNo` (`CustNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
