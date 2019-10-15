create database lojamvc;

use lojamvc;

create table cliente (

	idcliente int auto_increment,
    nome varchar(40) not null,
    cpf numeric(11) unique key not null,
    
    primary key(idcliente)
);
	
    insert into cliente (nome, cpf)
    values
    ('joão',12445378911);
    
    