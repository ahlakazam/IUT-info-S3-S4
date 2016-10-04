create table personnage (
	idpersonnage varchar(3),
	idclasse varchar(2),
	nom varchar(20), 
	race varchar(20), 
	niveau tinyint,
	datecreation date
) ;

create table posseder (
	idpersonnage varchar(3),
	numobjet integer,
	quantite smallint,
	dateacquisition date
) ;

create table connaitre (
	idpersonnage varchar(3), 
	idsort varchar(3),
	dateconnu date
) ;

create table sort (
	idsort varchar(3),
	nom varchar(20), 
	niveau tinyint,
	action varchar(50)
) ;	

create table composer (
	idsort varchar(3),
	numingredient integer,
	quantite smallint
) ;