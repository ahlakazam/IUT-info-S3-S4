INDIVIDU (NUMI, Nom, Prénom, DateNaiss, VilleNaiss)
JOUER (NUMA, NUMF, Role, Salaire)
FILM (NUMF, NUMR, Titre, Genre, Annee, Longueur, Budget)
PROJECTION (NUMC, NUMF, DateProj)
CINEMA (NUMC, Nom, Adresse, Ville, NombreSalles)

select Nom
from INDIVIDU 
where NUMI not in (
	select NUMR
	from FILM

);


select * 
from FILM
where Budget > (

	select Budget
	from FILM
	where Titre = 'Titanic'
);

select Nom
from INDIVIDU
where NUMI in (

	select NUMA
	from JOUER J inner join FILM F on (J.NUMF = F.NUMF)
	where Genre = 'Comique'
);

select Nom
from INDIVIDU
where NUMI in (

	select NUMR
	from FILM
	where Annee = 2008
);

select *
from FILM
where NUMF not in (

	select NUMF
	from PROJECTION
);

select Nom
from CINEMA C
where not exists (

	select *
	from FILM F
	where not exists (

			select *
			from PROJECTION P
			where P.NUMF = F.NUMF and P.NUMC = C.NUMC
		)
);

select count(NUMF) as NB, sum(Budget) as BudgetTotal, avg(Budget) as BudgetMoyen
from FILM;

select Titre, Annee
from FILM
where Budget = (

	select max(Budget)
	from FILM
);

select count(*) as NBAnneeInconnue
from FILM
where Annee is null;

15)

select count(NUMF) as nbfilm, Genre
from FILM
group by Genre


select Titre, count(*), as NbProj
from FILM F inner join PROJECTION P on (F.NUMF = P.NUMF)
group by Titre
having count(*) > 100;