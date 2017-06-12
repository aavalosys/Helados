-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-06-2017 a las 02:46:10
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `helados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `Id_Producto` int(11) NOT NULL,
  `NombreProducto` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Id_Producto`, `NombreProducto`) VALUES
(1, 'Paletas'),
(2, 'Conos'),
(3, 'Pasteles'),
(4, 'Bebidas'),
(5, 'Yougurt'),
(6, 'Vainilla'),
(7, 'Ron_Con_Patas'),
(8, 'Marihuana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prosabores`
--

CREATE TABLE `prosabores` (
  `Sabores_Id_Sabor` int(11) NOT NULL,
  `Productos_Id_Producto` int(11) NOT NULL,
  `Tamano_Id_Tamano` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sabores`
--

CREATE TABLE `sabores` (
  `Id_Sabor` int(11) NOT NULL,
  `NombreSabor` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sabores`
--

INSERT INTO `sabores` (`Id_Sabor`, `NombreSabor`) VALUES
(1, 'Cocholate'),
(2, 'fresa'),
(3, 'mania'),
(4, 'caramelo'),
(5, 'ron con pasas'),
(6, 'napolitano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tamano`
--

CREATE TABLE `tamano` (
  `Id_Tamano` int(11) NOT NULL,
  `Tamano` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tamano`
--

INSERT INTO `tamano` (`Id_Tamano`, `Tamano`) VALUES
(1, 'Pequeno'),
(2, 'Mediano'),
(3, 'Grande');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Id_Producto`);

--
-- Indices de la tabla `prosabores`
--
ALTER TABLE `prosabores`
  ADD KEY `fk_table1_Sabores_idx` (`Sabores_Id_Sabor`),
  ADD KEY `fk_table1_Productos1_idx` (`Productos_Id_Producto`),
  ADD KEY `fk_table1_Tamano1_idx` (`Tamano_Id_Tamano`);

--
-- Indices de la tabla `sabores`
--
ALTER TABLE `sabores`
  ADD PRIMARY KEY (`Id_Sabor`);

--
-- Indices de la tabla `tamano`
--
ALTER TABLE `tamano`
  ADD PRIMARY KEY (`Id_Tamano`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `Id_Producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `sabores`
--
ALTER TABLE `sabores`
  MODIFY `Id_Sabor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tamano`
--
ALTER TABLE `tamano`
  MODIFY `Id_Tamano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `prosabores`
--
ALTER TABLE `prosabores`
  ADD CONSTRAINT `fk_table1_Productos1` FOREIGN KEY (`Productos_Id_Producto`) REFERENCES `productos` (`Id_Producto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_table1_Sabores` FOREIGN KEY (`Sabores_Id_Sabor`) REFERENCES `sabores` (`Id_Sabor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_table1_Tamano1` FOREIGN KEY (`Tamano_Id_Tamano`) REFERENCES `tamano` (`Id_Tamano`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
