--TABLAS
create table cliente(
	id int identity not null,
	nombre varchar(max) not null,
	apellidos varchar(max) not null,
	correo varchar(max) not null,
	dni varchar(max) not null,
	direccion varchar(max) not null,
	estado varchar(max) not null,
	constraint pk_cliente primary key (id)
)
create table categoria(
	id int identity not null,
	nombre varchar(max) not null,
	estado varchar(max),
	constraint pk_categoria primary key(id)
)
create table producto(
	id int identity not null,
	id_categoria int not null,
	nombre varchar(max) not null,
	precio decimal(5,2) not null,
	stock int not null,
	estado varchar(max),
	constraint pk_producto primary key(id),
	constraint fk_producto_categoria  foreign key(id_categoria) references categoria(id)
)
create table modo_pago(
	id int identity not null,
	nombre varchar(max),
	otros_detalles varchar(max),
	estado varchar(max),
	constraint pk_modo_pago primary key(id)
)
create table factura(
	id int identity not null,
	id_cliente int not null,
	id_modo_pago int not null,
	monto decimal (5,2),
	fecha varchar(max),
	estado varchar(max),
	constraint pk_factura primary key(id),
	constraint fk_factura_cliente foreign key(id_cliente) references cliente(id),
	constraint fk_factura_modo_pago foreign key(id_modo_pago) references modo_pago(id)
)
create table detalle(
	id int identity not null,
	id_factura int not null,
	id_producto int not null,
	cantidad int not null,
	precio decimal (5,2) not null,
	estado varchar(max),
	constraint pk_detalle primary key(id),
	constraint fk_detalle_factura foreign key(id_factura) references factura(id),
	constraint fk_detalle_producto foreign key(id_producto) references producto(id)
)
--INSERTAR 
insert into cliente(nombre,apellidos,correo,dni,direccion,estado) values('Prueba','Java','Java@p.com','12345678','Lima-peru','Activo')
insert into cliente(nombre,apellidos,correo,dni,direccion,estado) values('PruebaPHP','PHP','PHP@p.com','87654321','Lima-peru','Activo')
insert into categoria(nombre,estado) values ('Abarrotes', 'Activo');
insert into categoria(nombre,estado) values ('Carnes', 'Activo');
insert into categoria(nombre,estado) values ('Verduras', 'Activo');
insert into categoria(nombre,estado) values ('Frutas', 'Activo');
insert into categoria(nombre,estado) values ('Limpieza', 'Activo');
insert into categoria(nombre,estado) values ('Juguetes', 'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (1, 'Bolsa de arroz', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (2, 'Carne de res', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (2, 'Filete de pollo', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Manzanas', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Peras', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Mandarinas', 10.00, 5,'Activo');
insert into modo_pago(nombre,otros_detalles,estado) values ('Efectivo', 'solo se acepta moneda nacional','Activo');
insert into factura(id_cliente,id_modo_pago,monto,fecha,estado) values (1, 1, 150.30,'8-11-2020','Activo')
insert into detalle(id_factura,id_producto,cantidad,precio,estado) values (1, 1, 2,20.00,'Activo');

--SELECT
select * from cliente;
select * from categoria;
select * from producto;
select * from modo_pago;
select * from factura;
select * from detalle;
