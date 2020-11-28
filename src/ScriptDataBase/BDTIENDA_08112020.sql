
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
	precio decimal not null,
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
	precio decimal not null,
	estado varchar(max),
	constraint pk_detalle primary key(id),
	constraint fk_detalle_factura foreign key(id_factura) references factura(id),
	constraint fk_detalle_producto foreign key(id_producto) references producto(id)
)



--INSERTAR 

insert into cliente(nombre,apellidos,correo,dni,direccion,estado) values ('Alberto', 'Velasquez', 'avelasquez@velasquez.com', '1234', 'Lima-Peru','Activo');
insert into cliente(nombre,apellidos,correo,dni,direccion,estado) values('Marco','Emocional','no lo voy a','123','confesar','Activo')
insert into categoria(nombre,estado) values ('Abarrotes', 'Activo');
insert into categoria(nombre,estado) values ('Carnes', 'Activo');
insert into categoria(nombre,estado) values ('Verduras', 'Activo');
insert into categoria(nombre,estado) values ('Frutas', 'Activo');
insert into categoria(nombre,estado) values ('Limpieza', 'Activo');
insert into categoria(nombre,estado) values ('Juguetes', 'Activo');

insert into producto(id_categoria,nombre,precio,stock,estado) values (1, 'Bolsa de arroz', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Manzanas', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Peras', 10.00, 5,'Activo');
insert into producto(id_categoria,nombre,precio,stock,estado) values (4, 'Mandarinas', 10.00, 5,'Activo');

insert into modo_pago(nombre,otros_detalles,estado) values ('Efectivo', 'solo se acepta moneda nacional','Activo');
insert into factura(id_cliente,id_modo_pago,fecha,estado) values (1, 1,'8-11-2020','Activo');
insert into detalle(id_factura,id_producto,cantidad,precio,estado) values (1, 1, 2,20.00,'Activo');

--ACTUTALIZAR
update categoria set nombre = 'Muebles' where id = 7;
update categoria set nombre = ? where id = ?
update cliente set nombre = 'Pedro', apellidos = 'Suarez', correo = 'asdas', dni = '987654', direccion = 'peru' where id = 1;
update producto set nombre = 'Agua san mateo', precio = 2.50, stock = 10 where id = 1;

--ELIMINAR / BORRADO LOGICO 
update categoria set estado = 'Activo' where id = 5;
update producto set estado = 'Inactivo' where id = 2;
update cliente set estado = 'Inactivo' where id = 2;

--ELIMINAR / BORRADO FISICO
delete cliente where id = ?;
delete categoria where id = 7;
delete producto where id = 2;
delete modo_pago where id = ?;
delete factura where id = ?;
delete detalle where id = ?;


--BUSCAR POR ID
select * from categoria where id = 4;
select * from cliente where id = 1;




--LISTAR TODOS LOS DATOS 
select * from cliente;
select * from cliente where dni = '123';
select * from categoria
select * from producto;
select * from modo_pago;
select * from factura;
select * from detalle;
--LISTAR + JOIN
select p.id , p.nombre, c.nombre, p.precio, p.stock, p.estado from producto as p 
inner join categoria as c on p.id_categoria = c.id
where c.estado = 'Activo' and p.estado = 'Activo' and c.nombre ='Frutas' and p.id =3;


drop table detalle
drop table factura
drop table modo_pago
drop table producto
drop table categoria
drop table cliente
