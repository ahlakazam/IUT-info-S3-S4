#! /bin/bash
#

# calculs.sh : lit les valeurs des variables X, Y, Z et n sur l'entree standard et affiche le resultat 
# des expressions numeriques suivantes sur la sortie standard.
# On donnera les resultats avec les 4 methodes suivantes : let, expr, (()) et typeset.
# X+Y+Z
# X^n
# (X*Y)+Z
# X/n

read -p "Entrez 4 nombres entiers séparés par des espaces : " X Y Z n

echo "Calculs des formules avec let"

let "V = $X + $Y + $Z"
echo "$X+$Y+$Z vaut:" $V

let "V = $X ** $n"
echo "$X^$n vaut:" $V

let "V = $X * $Y + $Z"
echo "$X*$Y+$Z vaut:" $V

let "V = $X / $n"
echo "$X/$n vaut:" $V

echo "Calculs des formules avec expr"

V=$(expr $X + $Y + $Z)
echo "$X+$Y+$Z vaut:" $V

#V=$(expr X ** $n) n'existe pas
echo "$X^$n ne se calcule pas directement avec expr" 

V=$(expr $X \* $Y + $Z)
echo "$X*$Y+$Z vaut:" $V

V=$(expr $X / $n)
echo "$X/$n vaut:" $V

echo "Calculs des formules avec (( ))"

(( V = $X + $Y + $Z ))
echo "$X+$Y+$Z vaut:" $V

(( V = $X ** $n ))
echo "$X^$n vaut:" $V

(( V = $X * $Y + $Z ))
echo "$X*$Y+$Z vaut:" $V

(( V = $X / $n ))
echo "$X/$n vaut:" $V

echo "Calculs des formules avec typeset -i"

typeset -i V X Y Z n

V=X+Y+Z
echo "$X+$Y+$Z vaut:" $V

V=X**n
echo "$X^$n vaut:" $V

V=X*Y+Z
echo "$X*$Y+$Z vaut:" $V

V=X/n
echo "$X/$n vaut:" $V