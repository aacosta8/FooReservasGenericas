CREATE DATABASE IF NOT EXISTS reservas;
USE reservas;

CREATE TABLE IF NOT EXISTS producto (
	idProducto int(11) NOT NULL AUTO_INCREMENT, 
	nombre varchar(100) NOT NULL, 
	descripcion varchar(5000) NOT NULL,
	precio float NOT NULL,
	cantidadDisponible int(11) NOT NULL,
	tipo varchar(100) NOT NULL, 
	PRIMARY KEY (idProducto)
);

CREATE TABLE IF NOT EXISTS cliente (
	numeroID int NOT NULL,
    nombre varchar(100) NOT NULL, 
	apellidos varchar(100) NOT NULL, 
	PRIMARY KEY (numeroID)
);

CREATE TABLE IF NOT EXISTS reserva (
	idReserva int(11) NOT NULL AUTO_INCREMENT, 
	fechaReserva datetime NOT NULL, 
	fechaUso datetime NOT NULL, 
	cantidad int NOT NULL,
	numeroIDCliente int(11),
    idProducto int(11),
	PRIMARY KEY (idReserva),
	FOREIGN KEY (numeroIDCliente) REFERENCES cliente(numeroID),
    FOREIGN KEY (idProducto) REFERENCES producto(idProducto)
);

drop table  reserva;
drop table cliente;
drop table producto;


