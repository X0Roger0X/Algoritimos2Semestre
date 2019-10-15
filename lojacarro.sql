create database lojacarro;

use lojacarro;

create table carro(

	idcarro int auto_increment,
    modelo varchar(30) not null,
    ano int not null,
    valor double not null,
    
    primary key(idcarro) 
);

insert into carro (modelo, ano, valor)
    values
    ('golbola',1995, 13000);