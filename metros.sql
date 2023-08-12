-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2023 at 10:48 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `metros`
--

-- --------------------------------------------------------

--
-- Table structure for table `admintable`
--

CREATE TABLE `admintable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admintable`
--

INSERT INTO `admintable` (`username`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `bookingcard`
--

CREATE TABLE `bookingcard` (
  `route1` varchar(100) NOT NULL,
  `stn1` varchar(100) NOT NULL,
  `route2` varchar(100) NOT NULL,
  `stn2` varchar(100) NOT NULL,
  `fare` int(11) NOT NULL,
  `balance` int(100) NOT NULL,
  `trvl_time` int(11) NOT NULL,
  `s_id` int(110) NOT NULL,
  `dist` float NOT NULL,
  `stn_bw` int(11) NOT NULL,
  `bookingdate` date NOT NULL,
  `book_no` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `bookingcard`
--

INSERT INTO `bookingcard` (`route1`, `stn1`, `route2`, `stn2`, `fare`, `balance`, `trvl_time`, `s_id`, `dist`, `stn_bw`, `bookingdate`, `book_no`) VALUES
('Blue', 'Football Chowk', 'Blue', 'GTB Nagar', 47, 1000, 8, 16000003, 3.9, 4, '2016-07-08', 1),
('Blue', 'DaNang', 'Blue', 'NgheAn', 180, 1200, 400, 16000002, 300, 0, '2023-08-12', 2),
('Red', 'LangSon', 'Red', 'HCM', 340, 5000, 600, 16000003, 700, 1, '2023-08-12', 3),
('Blue', 'DaNang', 'Blue', 'NgheAn', 170, 5000, 400, 16000005, 300, 0, '2023-08-12', 4);

-- --------------------------------------------------------

--
-- Table structure for table `bookingtoken`
--

CREATE TABLE `bookingtoken` (
  `route1` varchar(100) NOT NULL,
  `stn1` varchar(100) NOT NULL,
  `route2` varchar(100) NOT NULL,
  `stn2` varchar(100) NOT NULL,
  `fare` int(11) NOT NULL,
  `no_of_tckt` int(100) NOT NULL,
  `totalfare` int(11) NOT NULL,
  `trvl_time` int(11) NOT NULL,
  `dist` float NOT NULL,
  `stn_bw` int(11) NOT NULL,
  `bookingdate` datetime NOT NULL,
  `S.no` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `bookingtoken`
--

INSERT INTO `bookingtoken` (`route1`, `stn1`, `route2`, `stn2`, `fare`, `no_of_tckt`, `totalfare`, `trvl_time`, `dist`, `stn_bw`, `bookingdate`, `S.no`) VALUES
('Red', 'LangSon', 'Red', 'HaNoi', 80, 2, 160, 20, 50, 0, '2023-08-12 04:35:09', 1),
('Blue', 'HaNoi', 'Blue', 'DaNang', 300, 1, 300, 450, 450, 1, '2023-08-12 04:38:32', 13),
('Blue', 'HaNoi', 'Blue', 'NgheAn', 200, 3, 600, 400, 400, 0, '2023-08-12 14:38:49', 14);

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE `employeetable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`username`, `password`) VALUES
('emp', '123'),
('minh', '123');

-- --------------------------------------------------------

--
-- Table structure for table `faretable`
--

CREATE TABLE `faretable` (
  `route1` varchar(100) NOT NULL,
  `stn1` varchar(100) NOT NULL,
  `route2` varchar(100) NOT NULL,
  `stn2` varchar(100) NOT NULL,
  `fare` int(11) NOT NULL,
  `trvl_time` int(11) NOT NULL,
  `dist` float NOT NULL,
  `stn_bw` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `faretable`
--

INSERT INTO `faretable` (`route1`, `stn1`, `route2`, `stn2`, `fare`, `trvl_time`, `dist`, `stn_bw`) VALUES
('Blue', 'DaNang', 'Blue', 'HaNoi', 300, 450, 450, 1),
('Blue', 'DaNang', 'Blue', 'NgheAn', 200, 400, 300, 0),
('Blue', 'HaNoi', 'Blue', 'DaNang', 300, 450, 450, 1),
('Blue', 'HaNoi', 'Blue', 'NgheAn', 200, 400, 400, 0),
('Blue', 'NgheAn', 'Blue', 'DaNang', 200, 400, 300, 0),
('Blue', 'NgheAn', 'Blue', 'HaNoi', 200, 400, 400, 0),
('Red', 'HaNoi', 'Red', 'HCM', 300, 500, 600, 0),
('Red', 'HaNoi', 'Red', 'LangSon', 80, 20, 50, 0),
('Red', 'HCM', 'Red', 'HaNoi', 300, 500, 600, 0),
('Red', 'HCM', 'Red', 'LangSon', 400, 600, 700, 1),
('Red', 'LangSon', 'Red', 'HaNoi', 80, 20, 50, 0),
('Red', 'LangSon', 'Red', 'HCM', 400, 600, 700, 1);

-- --------------------------------------------------------

--
-- Table structure for table `metrotable`
--

CREATE TABLE `metrotable` (
  `metro_no` int(100) NOT NULL,
  `no_of_car` int(10) NOT NULL,
  `car_cap` int(100) NOT NULL,
  `Route` varchar(100) NOT NULL,
  `freq` int(10) NOT NULL,
  `date_of_run` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `metrotable`
--

INSERT INTO `metrotable` (`metro_no`, `no_of_car`, `car_cap`, `Route`, `freq`, `date_of_run`) VALUES
(1, 6, 500, 'Yellow', 15, '2016-06-10'),
(2, 4, 300, 'Red', 303, '2016-07-14'),
(3, 20, 20, 'Blue', 10, '2023-08-12'),
(4, 10, 40, 'Red', 10, '2023-08-11');

-- --------------------------------------------------------

--
-- Table structure for table `routetable`
--

CREATE TABLE `routetable` (
  `Route` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `routetable`
--

INSERT INTO `routetable` (`Route`) VALUES
('Blue'),
('Red');

-- --------------------------------------------------------

--
-- Table structure for table `smartcard`
--

CREATE TABLE `smartcard` (
  `s_id` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `phn_no` bigint(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `Idproof` varchar(150) NOT NULL,
  `image` varchar(100) NOT NULL,
  `cardtype` varchar(100) NOT NULL,
  `balance` double NOT NULL,
  `datecreated` date NOT NULL,
  `exp_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `smartcard`
--

INSERT INTO `smartcard` (`s_id`, `name`, `age`, `gender`, `phn_no`, `address`, `Idproof`, `image`, `cardtype`, `balance`, `datecreated`, `exp_date`) VALUES
(16000002, 'ngo Minh', 22, 'Female', 78865433, 'Dong Anh, Ha Noi', '100897663', 'Images\\1691790607214_download.jpg', 'standard', 1020, '2023-08-12', '2024-08-11'),
(16000003, 'Thanh Tra', 23, 'Female', 789866534, 'Vung Tra, Thai Binh', '1009888344', 'Images\\1691791114838_th (1).jpg', 'premium', 4660, '2023-08-12', '2024-08-11'),
(16000004, 'Pham Duc Manh', 24, 'Male', 789856774, 'Yen Thanh, Nghe An', '1008897723', 'Images\\1691817239313_download (1).jpg', 'premium', 5000, '2023-08-12', '2024-08-11'),
(16000005, 'Danh Duc', 24, 'Female', 789866533, 'Ha Duc, Ha Noi', '100992335522', 'Images\\1691817912226_download (2).jpg', 'premium', 4830, '2023-08-12', '2024-08-11');

-- --------------------------------------------------------

--
-- Table structure for table `stationtable`
--

CREATE TABLE `stationtable` (
  `Route` varchar(100) NOT NULL,
  `stn_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `stationtable`
--

INSERT INTO `stationtable` (`Route`, `stn_name`) VALUES
('Blue', 'DaNang'),
('Blue', 'HaNoi'),
('Blue', 'NgheAn'),
('Red', 'HaNoi'),
('Red', 'HCM'),
('Red', 'LangSon');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admintable`
--
ALTER TABLE `admintable`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `bookingcard`
--
ALTER TABLE `bookingcard`
  ADD PRIMARY KEY (`book_no`);

--
-- Indexes for table `bookingtoken`
--
ALTER TABLE `bookingtoken`
  ADD PRIMARY KEY (`S.no`);

--
-- Indexes for table `employeetable`
--
ALTER TABLE `employeetable`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `faretable`
--
ALTER TABLE `faretable`
  ADD PRIMARY KEY (`route1`,`stn1`,`route2`,`stn2`);

--
-- Indexes for table `metrotable`
--
ALTER TABLE `metrotable`
  ADD PRIMARY KEY (`metro_no`);

--
-- Indexes for table `routetable`
--
ALTER TABLE `routetable`
  ADD PRIMARY KEY (`Route`);

--
-- Indexes for table `smartcard`
--
ALTER TABLE `smartcard`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `stationtable`
--
ALTER TABLE `stationtable`
  ADD PRIMARY KEY (`Route`,`stn_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookingtoken`
--
ALTER TABLE `bookingtoken`
  MODIFY `S.no` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `stationtable`
--
ALTER TABLE `stationtable`
  ADD CONSTRAINT `mycons1` FOREIGN KEY (`Route`) REFERENCES `routetable` (`Route`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
