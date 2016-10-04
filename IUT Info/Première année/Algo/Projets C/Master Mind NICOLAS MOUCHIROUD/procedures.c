#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"
#include <time.h>

void departManuel (char depart[5])
{
    int i=0;
    char lettre;
    system("cls"); printf("Vous avez choisi : Depart Manuel\n\nEntrez 5 couleurs : ('R', 'J', 'V', 'B', 'O', 'W', 'P', 'F')\n");

    //Saisie de la combinaison

    for (i=0;i<5;i++)
    {
        do
        {
            lettre = getchar(); fflush(stdin);
            depart[i] = lettre;
        }while (!testSaisie(lettre));
    }

    //Verification de la saisie utilisateur

    system("cls"); printf("Vous avez entre : ");
    for (i=0;i<5;i++)
    {
        printf("%c ", depart[i]);
    }
    printf("\n"); system("pause"); system("cls");
}

void departAuto (char depart[5])
{
    int i=0;
    char plage [8] = {'R', 'J', 'V', 'B', 'O', 'W', 'P', 'F'};
    time_t nb_secondes;
    srand (time(&nb_secondes));

    //Création auto de la séquence de 5 couleurs

    for (i=0;i<5;i++)

    {
        depart[i] = plage[rand()%8];
    }

}

void saisieUser (char saisie[5])
{
    int i=0;
    char lettre;

    //Demande les 5 propositions du joueur

    for (i=0;i<5;i++)
    {
        do
        {
            lettre = getchar(); fflush(stdin);
            saisie[i] = lettre;

            //Teste si la couleur entrée existe

        }while (!testSaisie(lettre));
    }
}

void comparaison (char depart[5], char saisie[5], char avancement[5])
{
    int i=0, a=0;
    int test=0;

    //Test des couleurs bien placées

    for (i=0;i<5;i++)
    {
        if (depart[i] == saisie[i])
        {
            printf("Vous avez trouve un %c a la bonne place !\n", saisie[i]);

            //Supprime de la saisie les couleurs trouvées et enregistre le placement de la couleur

            avancement[i] = saisie[i];
            saisie[i] = '-';
            depart[i] = '*';
            test=1;
        }
    }

    //Même chose pour les couleurs mal placées

    for (i=0;i<5;i++)
    {
        for (a=0;a<5;a++)
        {
            if (depart[a] == saisie[i] && avancement[i] != saisie[i])
            {
                printf("Vous avez trouve un %c a la mauvaise place !\n", saisie[i]);
                saisie[i] = '-';
                depart[i] = '*';
                test=1;
            }
        }
    }
    if (test==0)
        printf("Dommage, aucune correspondance...");
    printf("\n\n");



}

void afficheTableau(char tableau[5])
{
    int i=0;
    for (i=0;i<5;i++)
    {
        printf("%c ", tableau[i]);
    }
}





