#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int testSaisie(char lettre)
{
    char plage [8] = {'R', 'J', 'V', 'B', 'O', 'W', 'P', 'F'};
    int i=0, test=0;

    //Parcourt le tableau des couleurs existantes

    for (i=0;i<8;i++)
    {
        if (plage[i] == lettre)
        {
            test=1;
        }
    }

    //Teste l'existence de la couleur entrée par l'utilisateur

    if (test == 0)
        printf("Erreur de saisie, veuillez recommencer...\n");
    return test;

}

int testVictoire (char avancement[5])
{
    int i=0;
    for (i=0;i<5;i++)
    {
        if (avancement[i] == '-')
            return 0;
    }
    return 1;
}

