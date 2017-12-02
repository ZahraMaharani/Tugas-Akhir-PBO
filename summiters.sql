-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2017 at 08:27 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `summiters`
--

-- --------------------------------------------------------

--
-- Table structure for table `bayar`
--

CREATE TABLE `bayar` (
  `transfer` varchar(100) NOT NULL,
  `cash` varchar(100) NOT NULL,
  `jaminan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `nama` varchar(500) NOT NULL,
  `ttl` varchar(500) NOT NULL,
  `id` int(11) NOT NULL,
  `alamat` varchar(500) NOT NULL,
  `tujuan` varchar(200) NOT NULL,
  `berangkat` date NOT NULL,
  `turun` date NOT NULL,
  `hari` int(100) NOT NULL,
  `tim` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`nama`, `ttl`, `id`, `alamat`, `tujuan`, `berangkat`, `turun`, `hari`, `tim`) VALUES
('wiwil', 'malang, 23 maret 2001', 12345, 'sawojajar', 'banyak', '2017-11-02', '2017-11-04', 2, 2),
('zahra', 'kediri, 23 maret 2001', 12345, 'semeru', 'sawojajar', '2017-11-03', '2017-11-04', 5, 1),
('jah', 'kediri, 23 maret 2001', 12345, 'semeru', 'sawojajar', '2017-11-01', '2017-11-04', 3, 3),
('jah', 'kediri, 23 maujdef', 1232, 'fcgvhkbj', 'fcgvh', '2017-11-03', '2017-11-04', 3, 1),
('qf2g', 'efrg33', 1213, 'wrvrwgv', 'rwvgw', '2017-11-15', '2017-11-23', 1, 1),
('as', 'asa1221', 12, 'asa', 'as', '2017-11-29', '2017-11-29', 2, 21),
('qw', 'qw12', 1, 'as', 'as', '2017-11-29', '2017-11-29', 12, 12),
('svfwrgv', 'vwrbr', 121435, ' etj', ' dgn', '2017-11-09', '2017-11-18', 4, 4),
('wedxrfcxercvr', 'rcvtrb', 2342, 'evbrt', 'crfvbbr', '2017-11-09', '2017-11-10', 1, 1),
('xwdec', 'cerce', 34324, 'vertb', 'cfdv', '2017-11-16', '2017-11-17', 1, 12),
('cerv', 'vev', 1213, 'r3bt4b', 'vrb', '2017-11-09', '2017-11-10', 1, 1),
('cdg', 'gwvrg', 13124, 'bet', 'verg', '2017-11-08', '2017-11-09', 2, 1),
('tdfghj', 'dfg', 12345, 'ytyugih', 'r7yguh', '2017-11-29', '2017-11-30', 3, 1),
('ycoefg', 'syfcguohiqjec', 2345, 'cyiwouv', 'tyutiy', '2017-11-03', '2017-11-04', 2, 1),
('cwgwr', 'evwr', 123, 'vberb', 'vwrwrb', '2017-11-03', '2017-11-04', 2, 1),
('aaaa', 'aaaaa', 11, 'aaaa', 'aaaaa', '2017-11-29', '2017-11-30', 11, 12),
('aaaa', 'malang', 12, 'aaa', 'aaa', '2017-11-29', '2017-11-30', 2, 1),
('aaa', 'malang', 1, 'asd', 'asd', '2017-11-29', '2017-11-30', 1, 12),
('dwef', 'cevf', 1213, 'cer', 'wvreb', '2017-11-03', '2017-11-04', 2, 2),
('ecefc', 'ece', 123, 'vrr3v', 'v3rv', '2017-11-24', '2017-11-25', 3, 3),
('jah', 'kediridcwdv', 1123, 'cwvrb', 'egvvwv', '2017-11-03', '2017-11-04', 1, 1),
('jahbrgnr', 'etbetn', 12324, 'rynrymr', 'vdfhyr', '2017-12-27', '2017-12-28', 1, 1),
('zahra', 'yuh', 213, 'semeru', 'rtfy', '2017-12-27', '2017-12-28', 1, 1),
('vcb', 'fgvh', 345, 'cgjhv', 'fghkj', '2017-12-27', '2017-12-28', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `perlengkapan`
--

CREATE TABLE `perlengkapan` (
  `carrier` int(50) NOT NULL,
  `trash` int(200) NOT NULL,
  `butana` int(100) NOT NULL,
  `makanan` int(200) NOT NULL,
  `nesting` int(100) NOT NULL,
  `tenda` int(50) NOT NULL,
  `lamp` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perlengkapan`
--

INSERT INTO `perlengkapan` (`carrier`, `trash`, `butana`, `makanan`, `nesting`, `tenda`, `lamp`) VALUES
(0, 0, 1, 2, 0, 3, 6),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 111, 1, 11, 1, 1),
(1, 1, 1, 11, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(0, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `carrier` int(10) NOT NULL,
  `tenda` int(10) NOT NULL,
  `nesting` int(20) NOT NULL,
  `matras` int(20) NOT NULL,
  `sleep` int(20) NOT NULL,
  `sandal` int(20) NOT NULL,
  `sepatu` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`carrier`, `tenda`, `nesting`, `matras`, `sleep`, `sandal`, `sepatu`) VALUES
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 11, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1),
(1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `name` varchar(100) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `email` varchar(200) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`name`, `pass`, `email`, `alamat`) VALUES
('zahra', '123', 'zahraaasha@gmail.com', 'malang'),
('apep', 'aaa', 'dbvn', 'rty'),
('gendut', '123', 'ufxgihosu2', 'terfyguhi');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
