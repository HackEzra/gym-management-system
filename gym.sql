-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2021 at 12:32 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_customer`
--

CREATE TABLE `add_customer` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contactNo` varchar(10) NOT NULL,
  `payments_plan` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `height` float NOT NULL,
  `weight` float NOT NULL,
  `remarks` varchar(100) NOT NULL,
  `trainer_name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `add_customer`
--

INSERT INTO `add_customer` (`id`, `name`, `fname`, `email`, `address`, `contactNo`, `payments_plan`, `gender`, `height`, `weight`, `remarks`, `trainer_name`, `category`) VALUES
(101, 'Rohan', 'Rajesh singh', 'rohan123@gmail.com', 'Delhi East', '6352857496', '1', 'Male', 5.6, 65, 'Beginner', 'Sahil Khan', 'Public'),
(102, 'Rahul', 'Ranveer singh', 'rahul@gmail.com', 'Saharanpur', '7485963652', '1', 'Male', 5.7, 70, 'None', 'Yatinder singh', 'Personal'),
(103, 'vipul', 'Suresh', 'vip@gmail.com', 'Hairdwar', '6385748596', '1', 'Male', 5.6, 70, 'none', 'Sangram', 'Public'),
(104, 'Sanjeev', 'Vijay ', 'sanjeev@gmail.com', 'Haridwar', '748596365', '1', 'Male', 5.6, 55, 'Beginner', 'Guru Mann', 'Personal'),
(105, 'Kapil', 'Jitender', 'kapil@gmail.com', 'Dehradun', '963652857', '1', 'Male', 5.7, 70, 'none', 'Tarun bhatia', 'Public');

-- --------------------------------------------------------

--
-- Table structure for table `add_trainer`
--

CREATE TABLE `add_trainer` (
  `tid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `emergencyNo` varchar(10) NOT NULL,
  `category` varchar(50) NOT NULL,
  `min_aggrement` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `height` float NOT NULL,
  `weight` float NOT NULL,
  `remarks` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `add_trainer`
--

INSERT INTO `add_trainer` (`tid`, `name`, `fname`, `email`, `address`, `contactNo`, `emergencyNo`, `category`, `min_aggrement`, `gender`, `height`, `weight`, `remarks`) VALUES
(501, 'Sahil Khan', 'Akram', 'sahil@gmail.com', 'Mumbai', '8596365241', '100', 'Public', '3 Months', 'Male', 5.8, 80, 'Highly experienced'),
(502, 'Yatinder singh', 'Raghuveer', 'yatin@gmail.com', 'Gurgaon', '7485963652', '0133257485', 'Personal', '3 Months', 'Male', 5.7, 85, 'Cardio specialist'),
(503, 'Sangram', 'Udayveer', 'sangram@gmail.com', 'Chandigarh', '7425639685', '013357485', 'Public', '3 Months', 'Male', 5.8, 70, 'None'),
(504, 'Guru Mann', 'Sukhvinder singh', 'guru@gmail.com', 'Ludhiana', '7414526635', '0133674859', 'Personal', '3 Months', 'Male', 5.9, 80, 'Highly experienced'),
(505, 'Tarun bhatia', 'Jashmeet bhatia', 'tarun@gmail.com', 'Chandigarh', '748596365', '012365', 'Public', '3 Months', 'Male', 5.1, 85, 'none');

-- --------------------------------------------------------

--
-- Table structure for table `fee_trainer`
--

CREATE TABLE `fee_trainer` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `fees` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fee_trainer`
--

INSERT INTO `fee_trainer` (`id`, `name`, `category`, `fees`) VALUES
(501, 'Sahil Khan', 'Public', 2000),
(502, 'Yatinder singh', 'Personal', 4000),
(503, 'Sangram', 'Public', 2000),
(504, 'Guru Mann', 'Personal', 4000),
(505, 'Tarun bhatia', 'Public', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `loginpage`
--

CREATE TABLE `loginpage` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginpage`
--

INSERT INTO `loginpage` (`username`, `password`) VALUES
('admin', '1234'),
('', ''),
('fitnesspoint', '12345'),
('fitnesspoint', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `pay_customer`
--

CREATE TABLE `pay_customer` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `fees` float NOT NULL,
  `month` varchar(20) NOT NULL,
  `tname` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pay_customer`
--

INSERT INTO `pay_customer` (`id`, `name`, `category`, `fees`, `month`, `tname`) VALUES
(101, 'Rohan', 'Public', 2000, 'January', 'Sahil Khan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_customer`
--
ALTER TABLE `add_customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `add_trainer`
--
ALTER TABLE `add_trainer`
  ADD PRIMARY KEY (`tid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
