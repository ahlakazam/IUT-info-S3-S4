#! /bin/bash
#


# Pour utiliser ce script ailleurs il suffit de modifier TPHOME
TPHOME=~/M111/TP9

# On v�rifie qu'il y a bien eu un param�tre saisi apr�s le nom du script sur la ligne de commande
# Sinon on affiche un message d'erreur et on sort du script avec le code de retour 1

[[ $# -ne 1 ]] && echo "usage: $0 n" && exit 1

N=$1 # On va cr�er $N fichiers de test : test1 .. testN

# on v�rifie que le param�tre est un nombre valide
if [[ $N =~ [^0-9] ]]
then
	echo "$N n'est pas un nombre!"
	exit 1
fi

echo "On va cr�er les fichiers test1 � test$N"

# Nettoyage du r�pertoire TEST (s'il n'existe pas on le cr�e)

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
# si vous voulez cr�er 10 fichiers tests, vous appelez le script � l'aide de la commande 
#./fabrique_test.sh 10

