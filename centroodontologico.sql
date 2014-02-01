-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 01-02-2014 a las 13:42:30
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `centroodontologico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE IF NOT EXISTS `bitacora` (
  `bitacora` int(11) NOT NULL AUTO_INCREMENT,
  `bit_nombreusuario` varchar(30) NOT NULL,
  `bit_modulo` varchar(50) NOT NULL,
  `bit_accion` varchar(50) NOT NULL,
  `bit_fechahora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`bitacora`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=106 ;

--
-- Volcado de datos para la tabla `bitacora`
--

INSERT INTO `bitacora` (`bitacora`, `bit_nombreusuario`, `bit_modulo`, `bit_accion`, `bit_fechahora`) VALUES
(1, 'jesus', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: E-21203413', '2014-01-02 19:12:16'),
(2, 'jesus', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: V-21203417', '2014-01-02 19:19:16'),
(3, 'null', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: V-24156088', '2014-01-04 15:28:58'),
(4, 'null', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: V-12345678', '2014-01-17 12:42:08'),
(5, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-2587419 ', '2014-01-31 19:58:15'),
(6, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-2587419 ', '2014-01-31 20:06:28'),
(7, 'null', 'Registro y Consulta de Usuario', 'Actualizo Usuario CI: V-8741965 ', '2014-01-31 20:07:03'),
(8, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-2587419 ', '2014-01-31 20:07:05'),
(9, 'null', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: V-2158888144', '2014-01-31 22:01:52'),
(10, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-01-31 23:32:57'),
(11, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-21203411 ', '2014-01-31 23:33:11'),
(12, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-21203411 ', '2014-01-31 23:36:46'),
(13, 'null', 'Registro y Consulta de Citas', 'Elimino Cita CI: V-21203411 ', '2014-01-31 23:36:50'),
(14, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-2587419 ', '2014-01-31 23:38:24'),
(15, 'null', 'Registro y Consulta de Citas', 'Elimino Cita CI: V-2587419 ', '2014-01-31 23:38:31'),
(16, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: V-8741965 ', '2014-01-31 23:39:38'),
(17, 'null', 'Registro y Consulta de Citas', 'Elimino Cita CI: V-8741965 ', '2014-01-31 23:39:41'),
(18, 'null', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: null ', '2014-01-31 23:39:52'),
(19, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-02-01 00:04:13'),
(20, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-02-01 00:06:36'),
(21, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:21:54'),
(22, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:24:30'),
(23, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 00:24:42'),
(24, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:26:15'),
(25, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 00:26:27'),
(26, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:26:32'),
(27, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:27:23'),
(28, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 00:27:33'),
(29, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:34:21'),
(30, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 00:34:49'),
(31, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:48:45'),
(32, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:49:25'),
(33, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:50:14'),
(34, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 00:50:23'),
(35, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:56:51'),
(36, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:57:28'),
(37, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 00:59:44'),
(38, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:01:30'),
(39, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:05:26'),
(40, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:07:01'),
(41, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:07:36'),
(42, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:09:36'),
(43, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:10:36'),
(44, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:11:44'),
(45, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:13:48'),
(46, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:15:01'),
(47, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: E-21203413 ', '2014-02-01 01:21:17'),
(48, 'null', 'Registro y Consulta de Citas', 'Actualizo Cita CI: E-21203413 ', '2014-02-01 01:21:32'),
(49, 'null', 'Registro y Consulta de Usuario', 'Guardo Usuario CI: V-12346785 ', '2014-02-01 03:27:52'),
(50, 'null', 'Registro y Consulta de Usuario', 'Elimino Usuario CI: V-12346785 ', '2014-02-01 03:28:35'),
(51, 'null', 'Registro y Consulta de Usuario', 'Guardo Usuario CI: V-31312313 ', '2014-02-01 03:32:10'),
(52, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: mmmm', '2014-02-01 05:14:29'),
(53, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: mama', '2014-02-01 05:17:31'),
(54, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: qwe', '2014-02-01 05:22:55'),
(55, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: andrade', '2014-02-01 05:29:58'),
(56, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: loli', '2014-02-01 05:36:49'),
(57, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: manuel', '2014-02-01 05:44:59'),
(58, 'null', 'Registro y Consulta de Servicios', 'Guardo Servicio: manuel', '2014-02-01 05:56:47'),
(59, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-02-01 06:05:47'),
(60, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-02-01 06:06:17'),
(61, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:53:59'),
(62, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:55:43'),
(63, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:55:45'),
(64, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:55:51'),
(65, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:55:55'),
(66, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:56:49'),
(67, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:56:51'),
(68, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:56:54'),
(69, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:56:56'),
(70, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:56:59'),
(71, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:57:00'),
(72, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:57:02'),
(73, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 06:57:12'),
(74, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:01:10'),
(75, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:03:24'),
(76, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:06:04'),
(77, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:06:06'),
(78, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:06:19'),
(79, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:14:17'),
(80, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:16:21'),
(81, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:17:21'),
(82, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:17:26'),
(83, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:17:34'),
(84, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:19:21'),
(85, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:19:26'),
(86, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:19:29'),
(87, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:24:52'),
(88, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:25:22'),
(89, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:16'),
(90, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:24'),
(91, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:26'),
(92, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:27'),
(93, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:37'),
(94, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:44'),
(95, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:46'),
(96, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:26:55'),
(97, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:28:25'),
(98, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:28:33'),
(99, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:28:39'),
(100, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:28:43'),
(101, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:28:45'),
(102, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: V-21203413 ', '2014-02-01 07:53:21'),
(103, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: null ', '2014-02-01 07:55:23'),
(104, 'null', 'Registro y Consulta de Citas', 'Guardo Cita CI: ', '2014-02-01 07:55:33'),
(105, 'null', 'Registro y Consulta de Citas', 'Consulto Cita CI: V-20189150 ', '2014-02-01 07:55:40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE IF NOT EXISTS `cita` (
  `cita` int(11) NOT NULL AUTO_INCREMENT,
  `cit_tipocedula` varchar(2) NOT NULL,
  `cit_cedula` varchar(8) NOT NULL,
  `cit_nombres` varchar(35) NOT NULL,
  `cit_apellidos` varchar(35) NOT NULL,
  `cit_fecha` date NOT NULL,
  PRIMARY KEY (`cita`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`cita`, `cit_tipocedula`, `cit_cedula`, `cit_nombres`, `cit_apellidos`, `cit_fecha`) VALUES
(7, 'V-', '12345678', 'manuel', 'aesefes', '2002-04-17'),
(8, 'V-', '21203413', 'efsef', 'sefsefes', '2014-01-14'),
(12, 'V-', '21203413', 'efsef', 'sefsefes', '2014-01-30'),
(13, 'E-', '21203413', 'efsef', 'sefsefes', '2014-02-06'),
(14, 'V-', '21203411', 'manuel alejandro', 'molina', '2014-02-18'),
(15, 'V-', '2587419', 'esfsf', 'esfsfs', '2014-01-08'),
(16, 'V-', '20189150', 'luis Alberto', 'Soto Ocanto', '2014-02-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE IF NOT EXISTS `citas` (
  `pac_cedula` varchar(10) CHARACTER SET latin1 NOT NULL,
  `pac_nombre` varchar(50) CHARACTER SET latin1 NOT NULL,
  `fecha_cita` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`pac_cedula`, `pac_nombre`, `fecha_cita`) VALUES
('24156088', 'Ariany CriselRodriguez Rangel', '2014-01-25');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE IF NOT EXISTS `detalleventa` (
  `detalleventa` int(11) NOT NULL,
  `dven_nomser` varchar(50) NOT NULL,
  `dven_cantidad` int(11) NOT NULL,
  `dven_precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`detalleventa`, `dven_nomser`, `dven_cantidad`, `dven_precio`) VALUES
(6, 'blaquiamiento', 2, 477),
(6, 'blaquiamiento', 1, 477),
(6, 'blaquiamiento', 2, 477),
(6, 'blaquiamiento', 1, 477);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE IF NOT EXISTS `historia_clinica` (
  `hist_nro` int(9) NOT NULL AUTO_INCREMENT,
  `hist_pac_paciente` int(11) NOT NULL,
  `hist_Estado` tinyint(1) NOT NULL,
  `hist_enfermedades` bigint(14) NOT NULL,
  `pre_id1` int(11) DEFAULT NULL,
  `pre_id2` int(11) DEFAULT NULL,
  `pre_id3` int(11) DEFAULT NULL,
  `hist_alergia` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `hist_ronca` tinyint(1) NOT NULL,
  `hist_respira_boca` int(1) NOT NULL,
  `hist_resfrio` tinyint(1) NOT NULL,
  `hist_ad_sinus` tinyint(1) NOT NULL,
  `pre_id4` int(11) DEFAULT NULL,
  `pre_id5` int(11) DEFAULT NULL,
  PRIMARY KEY (`hist_nro`),
  UNIQUE KEY `nro` (`hist_nro`),
  KEY `pac_paciente` (`hist_pac_paciente`),
  KEY `pre_id1` (`pre_id1`),
  KEY `pre_id2` (`pre_id2`),
  KEY `pre_id3` (`pre_id3`),
  KEY `pre_id4` (`pre_id4`),
  KEY `pre_id5` (`pre_id5`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `historia_clinica`
--

INSERT INTO `historia_clinica` (`hist_nro`, `hist_pac_paciente`, `hist_Estado`, `hist_enfermedades`, `pre_id1`, `pre_id2`, `pre_id3`, `hist_alergia`, `hist_ronca`, `hist_respira_boca`, `hist_resfrio`, `hist_ad_sinus`, `pre_id4`, `pre_id5`) VALUES
(1, 22, 1, 10000000000001, NULL, 20189150, 20189150, '100,humo', 1, 1, 0, 1, 20189150, 20189150),
(2, 20, 1, 10011011001011, 24156088, 24156088, 24156088, '100,humo', 1, 1, 0, 0, 24156088, 24156088);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `pac_paciente` int(11) NOT NULL AUTO_INCREMENT,
  `pac_tipocedula` varchar(2) CHARACTER SET latin1 NOT NULL,
  `pac_cedula` varchar(10) CHARACTER SET latin1 NOT NULL,
  `pac_nombres` varchar(35) CHARACTER SET latin1 NOT NULL,
  `pac_apellidos` varchar(35) CHARACTER SET latin1 NOT NULL,
  `pac_sexo` varchar(1) CHARACTER SET latin1 NOT NULL,
  `pac_fecha` date NOT NULL,
  `pac_edad` varchar(2) CHARACTER SET latin1 NOT NULL,
  `pac_direccion` varchar(100) CHARACTER SET latin1 NOT NULL,
  `pac_nombrespm` varchar(35) CHARACTER SET latin1 NOT NULL,
  `pac_apellidospm` varchar(35) CHARACTER SET latin1 NOT NULL,
  `pac_codtmovil` varchar(4) CHARACTER SET latin1 NOT NULL,
  `pac_numtmovil` varchar(7) CHARACTER SET latin1 NOT NULL,
  `pac_codtfijo` varchar(4) CHARACTER SET latin1 NOT NULL,
  `pac_numtfijo` varchar(7) CHARACTER SET latin1 NOT NULL,
  `pac_usuariocorreo` varchar(40) CHARACTER SET latin1 NOT NULL,
  `pac_tipocorreo` varchar(7) CHARACTER SET latin1 NOT NULL,
  `pac_extensioncorreo` varchar(4) CHARACTER SET latin1 NOT NULL,
  `pac_status` varchar(1) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`pac_paciente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=24 ;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`pac_paciente`, `pac_tipocedula`, `pac_cedula`, `pac_nombres`, `pac_apellidos`, `pac_sexo`, `pac_fecha`, `pac_edad`, `pac_direccion`, `pac_nombrespm`, `pac_apellidospm`, `pac_codtmovil`, `pac_numtmovil`, `pac_codtfijo`, `pac_numtfijo`, `pac_usuariocorreo`, `pac_tipocorreo`, `pac_extensioncorreo`, `pac_status`) VALUES
(11, 'V-', '21203413', 'jesus manuel', 'de andrade rodriguez', 'M', '1992-09-25', '20', 'cabudare', '', '', '0414', '4921942', '', '', '', '', '', 'A'),
(12, 'V-', '21203411', 'manuel alejandro', 'molina', 'M', '2013-12-16', '0', 'wadawdawdawdawd', '', '', '', '', '', '', '', '', '', 'A'),
(13, 'V-', '1234567', 'awdad', 'wdadawdaw', 'M', '2000-06-08', '13', 'wdawdawdwa', '', '', '', '', '', '', '', '', '', 'A'),
(14, 'V-', '8741965', 'awdawdwadaw', 'wdadada', 'F', '1999-06-10', '14', 'esfsefsefsef', '', '', '', '', '', '', '', '', '', 'A'),
(15, 'V-', '21203415', 'jeje', 'sasa', 'M', '1984-01-12', '29', 'skefksekfmesfsef', '', '', '0414', '1597854', '', '', '', '', '', 'A'),
(16, 'V-', '2149875', 'ddawdawd', 'dawdaw', 'M', '1978-03-07', '35', 'dawdawd', '', '', '', '', '', '', '', '', '', 'A'),
(17, 'V-', '2587419', 'esfsf', 'esfsfs', 'M', '1987-02-19', '26', 'vdrrdrdgdrgrdgrd', '', '', '', '', '', '', '', '', '', 'A'),
(18, 'E-', '21203413', 'efsef', 'sefsefes', 'M', '1999-01-12', '14', 'eefwffwfefw', '', '', '0414', '1234567', '', '', '', '', '', 'A'),
(19, 'V-', '21203417', 'esfsefsefse', 'wdawdawd', 'M', '1987-02-11', '26', 'efesfesfesf', '', '', '', '', '', '', '', '', '', 'A'),
(20, 'V-', '24156088', 'ariany crisel', 'rodriguez rangel', 'F', '1992-09-07', '21', 'ruezga sur', '', '', '0426', '3527278', '0251', '9296475', 'ariany', 'hotmail', 'com', 'A'),
(21, 'V-', '12345678', 'manuel', 'aesefes', 'M', '2006-03-17', '8', 'sbfhibeshbflskf', 'sfesfs', 'aesefes', '0414', '1597862', '', '', 'esfsefsefsef', 'hotmail', 'com', 'A'),
(22, 'V-', '20189150', 'luis Alberto', 'Soto Ocanto', 'M', '1992-02-14', '88', 'carrrera 6 entre calles 5 y 6', '', '', '0426', '2574359', '', '', '', '', '', 'A'),
(23, 'V-', '2158888144', 'wadwadawdaw', 'wdawdwa', 'M', '2005-01-13', '9', 'sawfawfwafawf', '', '', '', '', '', '', '', '', '', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_dificultad_mas`
--

CREATE TABLE IF NOT EXISTS `pregunta_dificultad_mas` (
  `pre_id4` int(11) NOT NULL,
  `pre_descripcion` varchar(30) CHARACTER SET utf8 COLLATE utf8_swedish_ci NOT NULL,
  PRIMARY KEY (`pre_id4`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_dificultad_mas`
--

INSERT INTO `pregunta_dificultad_mas` (`pre_id4`, `pre_descripcion`) VALUES
(20189150, 'nose'),
(24156088, 'Diente Chueco');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_dolor_cabeza`
--

CREATE TABLE IF NOT EXISTS `pregunta_dolor_cabeza` (
  `pre_id3` int(11) NOT NULL,
  `pre_descripcion` varchar(30) CHARACTER SET utf8 COLLATE utf8_swedish_ci NOT NULL,
  PRIMARY KEY (`pre_id3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_dolor_cabeza`
--

INSERT INTO `pregunta_dolor_cabeza` (`pre_id3`, `pre_descripcion`) VALUES
(20189150, 'Dol'),
(24156088, 'dol');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_estacion_med`
--

CREATE TABLE IF NOT EXISTS `pregunta_estacion_med` (
  `pre_id1` int(11) NOT NULL,
  `pre_descripcion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`pre_id1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_estacion_med`
--

INSERT INTO `pregunta_estacion_med` (`pre_id1`, `pre_descripcion`) VALUES
(24156088, 'ataques, se le va el ojo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_medicamentos`
--

CREATE TABLE IF NOT EXISTS `pregunta_medicamentos` (
  `pre_id2` int(11) NOT NULL,
  `pre_descripcion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`pre_id2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_medicamentos`
--

INSERT INTO `pregunta_medicamentos` (`pre_id2`, `pre_descripcion`) VALUES
(20189150, 'dexometasona y dormir wdd d'),
(24156088, 'fenobarbital');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_orl`
--

CREATE TABLE IF NOT EXISTS `pregunta_orl` (
  `pre_id5` int(11) NOT NULL,
  `pre_descripcion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `pre_cuando` date NOT NULL,
  `pre_operacion` smallint(3) NOT NULL,
  PRIMARY KEY (`pre_id5`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_orl`
--

INSERT INTO `pregunta_orl` (`pre_id5`, `pre_descripcion`, `pre_cuando`, `pre_operacion`) VALUES
(20189150, 'tabique desviado', '2011-01-08', 101),
(24156088, 'Nariz torcida', '2012-01-05', 110);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE IF NOT EXISTS `servicio` (
  `servicio` int(11) NOT NULL AUTO_INCREMENT,
  `ser_nombre` varchar(30) NOT NULL,
  `ser_precio` float NOT NULL,
  `ser_descripcion` varchar(45) NOT NULL,
  `ser_status` varchar(1) NOT NULL,
  PRIMARY KEY (`servicio`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`servicio`, `ser_nombre`, `ser_precio`, `ser_descripcion`, `ser_status`) VALUES
(1, 'mmmm', 150, 'qwertyuiop', 'A'),
(2, 'mama', 150, 'wertyu', 'A'),
(3, 'qwe', 120, 'qwe', 'A'),
(4, 'andrade', 150, 'tyhjkl', 'A'),
(5, 'loli', 150, 'wertyui', 'A'),
(6, 'manuel', 12, 'afefs', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `usuario` int(11) NOT NULL AUTO_INCREMENT,
  `usu_tipocedula` varchar(2) NOT NULL,
  `usu_cedula` varchar(8) NOT NULL,
  `usu_nombres` varchar(30) NOT NULL,
  `usu_apellidos` varchar(30) NOT NULL,
  `usu_id` varchar(20) NOT NULL,
  `usu_contraseña` varchar(15) NOT NULL,
  `usu_nivel` varchar(1) NOT NULL,
  `usu_status` varchar(1) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usuario`, `usu_tipocedula`, `usu_cedula`, `usu_nombres`, `usu_apellidos`, `usu_id`, `usu_contraseña`, `usu_nivel`, `usu_status`) VALUES
(1, 'V-', '21203413', 'jesus', 'de andrade', 'deandrade92', '4294967296', '1', 'A'),
(2, 'V-', '8741965', 'mercedes', 'de andrade', 'merce', '123456', '1', 'A'),
(3, 'V-', '24308951', 'tulio', 'vargas', 'tulito', '12345', '1', 'A'),
(4, 'V-', '18432760', 'a', 'c', 'v', 'aa', '1', 'A'),
(5, 'V-', '00000000', 'a', 'c', 'v', '12', '1', 'A'),
(6, 'V-', '24156088', 'ariany crisel', 'rodriguez rangel', 'ary', '12345', '1', 'A'),
(7, 'V-', '21203411', 'efesf', 'wadada', 'sefefesf', '123', '1', 'A'),
(8, 'V-', '12345678', 'root', 'toor', 'root', '12345', '0', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `ventas` int(11) NOT NULL AUTO_INCREMENT,
  `ven_tipocecula` varchar(2) NOT NULL,
  `ven_cedula` varchar(8) NOT NULL,
  `ven_fecha` varchar(12) NOT NULL,
  `ven_tfactura` float NOT NULL,
  PRIMARY KEY (`ventas`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`ventas`, `ven_tipocecula`, `ven_cedula`, `ven_fecha`, `ven_tfactura`) VALUES
(6, 'V-', '8741965', '2014-01-25', 2136.96);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD CONSTRAINT `historia_clinica_ibfk_1` FOREIGN KEY (`hist_pac_paciente`) REFERENCES `paciente` (`pac_paciente`) ON UPDATE CASCADE,
  ADD CONSTRAINT `historia_clinica_ibfk_2` FOREIGN KEY (`pre_id1`) REFERENCES `pregunta_estacion_med` (`pre_id1`) ON UPDATE CASCADE,
  ADD CONSTRAINT `historia_clinica_ibfk_3` FOREIGN KEY (`pre_id2`) REFERENCES `pregunta_medicamentos` (`pre_id2`) ON UPDATE CASCADE,
  ADD CONSTRAINT `historia_clinica_ibfk_4` FOREIGN KEY (`pre_id3`) REFERENCES `pregunta_dolor_cabeza` (`pre_id3`) ON UPDATE CASCADE,
  ADD CONSTRAINT `historia_clinica_ibfk_5` FOREIGN KEY (`pre_id4`) REFERENCES `pregunta_dificultad_mas` (`pre_id4`) ON UPDATE CASCADE,
  ADD CONSTRAINT `historia_clinica_ibfk_6` FOREIGN KEY (`pre_id5`) REFERENCES `pregunta_orl` (`pre_id5`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
