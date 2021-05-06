-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-05-2021 a las 23:48:06
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_university`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subject`
--

CREATE TABLE `subject` (
  `id` int(11) NOT NULL,
  `cupos_inscripcion` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `disponible` bit(1) NOT NULL,
  `horario` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `subject`
--

INSERT INTO `subject` (`id`, `cupos_inscripcion`, `descripcion`, `disponible`, `horario`, `name`) VALUES
(1, 50, 'Juan Pérez', b'0', '9:30 - 12:00', 'Programación'),
(2, 60, 'Facundo Mercado', b'0', '14:30 - 16:00', 'Diseño Grafico'),
(3, 50, 'Roberto Carlos', b'0', '12:30-14:00', 'Fisica'),
(4, 60, 'Alberto Jose', b'0', '9:30-12:00', 'Derecho'),
(5, 50, 'Santiago Hernandez', b'0', '15:00-16:30', 'Analisis'),
(6, 40, 'Sebastian Lopez', b'0', '16:00 - 17:00', 'IPC');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `subject`
--
ALTER TABLE `subject`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
