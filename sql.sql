CREATE DATABASE IF NOT EXISTS reservas;
USE reservas;

CREATE TABLE IF NOT EXISTS producto (
id_producto bigint NOT NULL AUTO_INCREMENT, 
nombre varchar(100) NOT NULL,
descripcion varchar(200), 
precio bigint NOT NULL,
cantidad_disponible bigint,
tipo varchar(20),
PRIMARY KEY (id_producto)
);


CREATE TABLE IF NOT EXISTS reservacion(
id_reservacion bigint NOT NULL AUTO_INCREMENT, 
fecha_reservacion datetime NOT NULL,
fecha_uso datetime,
cantidad int NOT NULL,
costo_total bigint,
cc_cliente varchar(20),
id_producto_reservado bigint,
PRIMARY KEY(id_producto),
FOREIGN KEY(id_producto_reservado)
	REFERENCES producto(id_producto)
);