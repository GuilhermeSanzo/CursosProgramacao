/* Exercicio 01 - Uma lista com as profissöes dos gafanhotos e seus respectivos quantitativos */
select profissao, count(*) from gafanhotos group by profissao;

/* Exercicio 02 - Quantos gafanhotos homens e quantas mulheres nasceram após 01/Jan/2005? */
select sexo, count(*) from gafanhotos where nascimento > '2005-01-01' group by sexo;

/* Exercicio 03 - Uma lista com os gafanhotos que nasceram fora do Brasil, mostrando o país de origem e o total de pessoas nascidas lá. Só nos interessam os países que tiverem mais de 3 gafanhotos com essa nacionalidade */
select nacionalidade, count(*) from gafanhotos where not nacionalidade = 'Brasil' group by nacionalidade having (count(*)) > 3; 

/* Exercicio 04 - Uma lista agrupada pela altura dos gafanhotos, mostrando quantas pessoas pesam mais de 100Kg e que estão acima da média de altura de todos os cadastrados */
select * from gafanhotos where peso > 100 group by altura having altura > (select avg(altura) from gafanhotos);
