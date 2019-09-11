-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 11-09-2019 a las 22:03:14
-- Versión del servidor: 5.7.17-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `healthfocus`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datospersonales`
--

CREATE TABLE `datospersonales` (
  `idPersona` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL COMMENT 'Nombre de la persona',
  `apellidos` varchar(45) NOT NULL COMMENT 'Apellidos del a persona',
  `sexo` enum('masculino','femenino') NOT NULL COMMENT 'Sexo de la persona',
  `fechaNacimiento` date NOT NULL COMMENT 'Fecha de nacimiento',
  `domicilio` varchar(45) NOT NULL,
  `cp` varchar(5) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `estatura` int(11) NOT NULL COMMENT 'Estatura de la persona\n',
  `rol` enum('administrador','nutriologo','paciente') NOT NULL DEFAULT 'nutriologo' COMMENT 'Rol del usuario dentro del sistema',
  `contrasena` varchar(64) NOT NULL DEFAULT '123456789'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `datospersonales`
--

INSERT INTO `datospersonales` (`idPersona`, `codigo`, `nombre`, `apellidos`, `sexo`, `fechaNacimiento`, `domicilio`, `cp`, `ciudad`, `estatura`, `rol`, `contrasena`) VALUES
(207448228, 0, 'Rafael', 'Muñoz Pérez', 'masculino', '1992-07-21', 'Pedro de Gante 175 - A', '47140', 'San Miguel el Alto', 172, 'nutriologo', '123456789'),
(207448229, 2074482299, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448230, 2074482230, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448231, 1234567891, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448232, 1234567892, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448233, 1234567852, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448234, 1234567852, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', '25'),
(207448235, 1234567852, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', '25'),
(207448236, 2074482299, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'cesar'),
(207448237, 2074482299, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448238, 2074482299, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin'),
(207448239, 2074482299, 'Kevin', 'Alcantar Almaraz', 'femenino', '1997-12-25', 'Tierra morada # 26', '47140', 'Acatic, Jalisco', 165, 'nutriologo', 'kevin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`) VALUES
(207448228),
(207448229);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datospersonales`
--
ALTER TABLE `datospersonales`
  ADD PRIMARY KEY (`idPersona`),
  ADD UNIQUE KEY `idPersona_UNIQUE` (`idPersona`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `idNutriologo_UNIQUE` (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datospersonales`
--
ALTER TABLE `datospersonales`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=207448240;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
