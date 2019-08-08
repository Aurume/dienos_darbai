-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2019 m. Rgp 08 d. 10:00
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kavine`
--

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `produktai`
--

CREATE TABLE `produktai` (
  `id` int(10) UNSIGNED NOT NULL,
  `pav` varchar(256) COLLATE utf8_lithuanian_ci NOT NULL,
  `mat_vnt` varchar(32) COLLATE utf8_lithuanian_ci NOT NULL,
  `mat_kiek` int(11) NOT NULL,
  `kaina` decimal(10,2) NOT NULL,
  `kiekis_sand` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Sukurta duomenų kopija lentelei `produktai`
--

INSERT INTO `produktai` (`id`, `pav`, `mat_vnt`, `mat_kiek`, `kaina`, `kiekis_sand`) VALUES
(1, 'Druska', '1 kg', 100, '1.00', 200.15),
(2, 'Aliejus', '1 l', 100, '5.00', 50.145),
(3, 'Šafranas', '1 kg', 500, '20750.00', 18.35),
(4, 'Duona', '1 kg', 800, '2.00', 42),
(5, 'Sūris', '1 kg', 250, '9.85', 56.425);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produktai`
--
ALTER TABLE `produktai`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produktai`
--
ALTER TABLE `produktai`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
