-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Vært: 127.0.0.1
-- Genereringstid: 03. 04 2017 kl. 15:18:58
-- Serverversion: 5.6.15-log
-- PHP-version: 5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `20_weightdb`
--

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `operatoer`
--

CREATE TABLE IF NOT EXISTS `operatoer` (
  `opr_id` int(11) NOT NULL,
  `opr_navn` text COLLATE utf8_danish_ci,
  `ini` text COLLATE utf8_danish_ci,
  `cpr` text COLLATE utf8_danish_ci,
  `password` text COLLATE utf8_danish_ci,
  PRIMARY KEY (`opr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `operatoer`
--

INSERT INTO `operatoer` (`opr_id`, `opr_navn`, `ini`, `cpr`, `password`) VALUES
(1, 'Angelo A', 'AA', '070770-7007', 'lKje4fa'),
(2, 'Antonella B', 'AB', '080880-8008', 'atoJ21v'),
(3, 'Luigi C', 'LC', '090990-9009', 'jEfm5aQ');

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `produktbatch`
--

CREATE TABLE IF NOT EXISTS `produktbatch` (
  `pb_id` int(11) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `recept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pb_id`),
  KEY `recept_id` (`recept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `produktbatch`
--

INSERT INTO `produktbatch` (`pb_id`, `status`, `recept_id`) VALUES
(1, 2, 1),
(2, 2, 1),
(3, 2, 2),
(4, 1, 3),
(5, 0, 3);

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `produktbatchkomponent`
--

CREATE TABLE IF NOT EXISTS `produktbatchkomponent` (
  `pb_id` int(11) NOT NULL DEFAULT '0',
  `rb_id` int(11) NOT NULL DEFAULT '0',
  `tara` double DEFAULT NULL,
  `netto` double DEFAULT NULL,
  `opr_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pb_id`,`rb_id`),
  KEY `rb_id` (`rb_id`),
  KEY `opr_id` (`opr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `produktbatchkomponent`
--

INSERT INTO `produktbatchkomponent` (`pb_id`, `rb_id`, `tara`, `netto`, `opr_id`) VALUES
(1, 1, 0.5, 10.05, 1),
(1, 2, 0.5, 2.03, 1),
(1, 4, 0.5, 1.98, 1),
(2, 1, 0.5, 10.01, 2),
(2, 2, 0.5, 1.99, 2),
(2, 5, 0.5, 1.47, 2),
(3, 1, 0.5, 10.07, 1),
(3, 3, 0.5, 2.06, 2),
(3, 4, 0.5, 1.55, 1),
(3, 6, 0.5, 1.53, 2),
(4, 1, 0.5, 10.02, 3),
(4, 5, 0.5, 1.57, 3),
(4, 6, 0.5, 1.03, 3),
(4, 7, 0.5, 0.99, 3);

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `raavare`
--

CREATE TABLE IF NOT EXISTS `raavare` (
  `raavare_id` int(11) NOT NULL,
  `raavare_navn` text COLLATE utf8_danish_ci,
  `leverandoer` text COLLATE utf8_danish_ci,
  PRIMARY KEY (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `raavare`
--

INSERT INTO `raavare` (`raavare_id`, `raavare_navn`, `leverandoer`) VALUES
(1, 'dej', 'Wawelka'),
(2, 'tomat', 'Knoor'),
(3, 'tomat', 'Veaubais'),
(4, 'tomat', 'Franz'),
(5, 'ost', 'Ost og Skinke A/S'),
(6, 'skinke', 'Ost og Skinke A/S'),
(7, 'champignon', 'Igloo Frostvarer');

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `raavarebatch`
--

CREATE TABLE IF NOT EXISTS `raavarebatch` (
  `rb_id` int(11) NOT NULL,
  `raavare_id` int(11) DEFAULT NULL,
  `maengde` double DEFAULT NULL,
  PRIMARY KEY (`rb_id`),
  KEY `raavare_id` (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `raavarebatch`
--

INSERT INTO `raavarebatch` (`rb_id`, `raavare_id`, `maengde`) VALUES
(1, 1, 1000),
(2, 2, 300),
(3, 3, 300),
(4, 5, 100),
(5, 5, 100),
(6, 6, 100),
(7, 7, 100);

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `recept`
--

CREATE TABLE IF NOT EXISTS `recept` (
  `recept_id` int(11) NOT NULL,
  `recept_navn` text COLLATE utf8_danish_ci,
  PRIMARY KEY (`recept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `recept`
--

INSERT INTO `recept` (`recept_id`, `recept_navn`) VALUES
(1, 'margherita'),
(2, 'prosciutto'),
(3, 'capricciosa');

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `receptkomponent`
--

CREATE TABLE IF NOT EXISTS `receptkomponent` (
  `recept_id` int(11) NOT NULL DEFAULT '0',
  `raavare_id` int(11) NOT NULL DEFAULT '0',
  `nom_netto` double DEFAULT NULL,
  `tolerance` double DEFAULT NULL,
  PRIMARY KEY (`recept_id`,`raavare_id`),
  KEY `raavare_id` (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_danish_ci;

--
-- Data dump for tabellen `receptkomponent`
--

INSERT INTO `receptkomponent` (`recept_id`, `raavare_id`, `nom_netto`, `tolerance`) VALUES
(1, 1, 10, 0.1),
(1, 2, 2, 0.1),
(1, 5, 2, 0.1),
(2, 1, 10, 0.1),
(2, 3, 2, 0.1),
(2, 5, 1.5, 0.1),
(2, 6, 1.5, 0.1),
(3, 1, 10, 0.1),
(3, 4, 1.5, 0.1),
(3, 5, 1.5, 0.1),
(3, 6, 1, 0.1),
(3, 7, 1, 0.1);

--
-- Begrænsninger for dumpede tabeller
--

--
-- Begrænsninger for tabel `produktbatch`
--
ALTER TABLE `produktbatch`
  ADD CONSTRAINT `produktbatch_ibfk_1` FOREIGN KEY (`recept_id`) REFERENCES `recept` (`recept_id`);

--
-- Begrænsninger for tabel `produktbatchkomponent`
--
ALTER TABLE `produktbatchkomponent`
  ADD CONSTRAINT `produktbatchkomponent_ibfk_1` FOREIGN KEY (`pb_id`) REFERENCES `produktbatch` (`pb_id`),
  ADD CONSTRAINT `produktbatchkomponent_ibfk_2` FOREIGN KEY (`rb_id`) REFERENCES `raavarebatch` (`rb_id`),
  ADD CONSTRAINT `produktbatchkomponent_ibfk_3` FOREIGN KEY (`opr_id`) REFERENCES `operatoer` (`opr_id`);

--
-- Begrænsninger for tabel `raavarebatch`
--
ALTER TABLE `raavarebatch`
  ADD CONSTRAINT `raavarebatch_ibfk_1` FOREIGN KEY (`raavare_id`) REFERENCES `raavare` (`raavare_id`);

--
-- Begrænsninger for tabel `receptkomponent`
--
ALTER TABLE `receptkomponent`
  ADD CONSTRAINT `receptkomponent_ibfk_1` FOREIGN KEY (`recept_id`) REFERENCES `recept` (`recept_id`),
  ADD CONSTRAINT `receptkomponent_ibfk_2` FOREIGN KEY (`raavare_id`) REFERENCES `raavare` (`raavare_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
