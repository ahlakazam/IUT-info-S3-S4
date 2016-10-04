#! /bin/bash
#


# Pour utiliser ce script ailleurs il suffit de modifier TPHOME
TPHOME=~/M111/TP9

# On vérifie qu'il y a bien eu un paramètre saisi après le nom du script sur la ligne de commande
# Sinon on affiche un message d'erreur et on sort du script avec le code de retour 1

[[ $# -ne 1 ]] && echo "usage: $0 n" && exit 1

N=$1 # On va créer $N fichiers de test : test1 .. testN

# on vérifie que le paramètre est un nombre valide
if [[ $N =~ [^0-9] ]]
then
	echo "$N n'est pas un nombre!"
	exit 1
fi

echo "On va créer les fichiers test1 à  test$N"

# Nettoyage du répertoire TEST (s'il n'existe pas on le crée)

if [[ -d $TPHOME/TEST ]]
then
    /bin/rm -rf $TPHOME/TEST/*
else
    mkdir $TPHOME/TEST
fi

for ((NBFICH=1; NBFICH<=$N; NBFICH++))
do
	LIGNE="test$NBFICH test$NBFICH test$NBFICH"
	
	for (( i=1 ; i<=100 ; i++))
	do
		echo $LIGNE >> $TPHOME/TEST/test$NBFICH
	done
done
# si vous voulez créer 10 fichiers tests, vous appelez le script à l'aide de la commande 
#./fabrique_test.sh 10

