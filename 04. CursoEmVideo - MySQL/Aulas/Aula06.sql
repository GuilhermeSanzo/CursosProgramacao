/* Primeira parte */
desc pessoas;

select * from pessoas;

alter table pessoas
add column profissao varchar(10);

alter table pessoas
drop column profissao;

alter table pessoas
add column profissao varchar(10) after nome;

alter table pessoas
add codigo int first;

alter table pessoas
modify column profissao varchar(20) not null default '';

alter table pessoas
change column profissao prof varchar(20);

alter table pessoas
rename to gafanhotos;

/* Segunda parte */
create table if not exists gafanhotos (teste int);

create table if not exists cursos(
	nome varchar(30) not null unique,
    descricao text,
    carga int unsigned,
    totaulas int unsigned,
    ano year default '2016'
) default charset=utf8;

alter table cursos
add column idcurso int first;

alter table cursos
add primary key (idcurso);

describe cursos;

/* Terceira parte */
create table if not exists teste (
	id int,
    nome varchar(10),
    idade int
);

insert into teste value
('1', 'Pedro', '22'),
('2', 'Maria', '12'),
('3', 'Maricota', '77');

select * from teste;

drop table if exists alunos;

drop table if exists teste;
