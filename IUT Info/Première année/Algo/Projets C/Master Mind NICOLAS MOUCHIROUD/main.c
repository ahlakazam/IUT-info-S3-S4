#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    printf("Realise par NICOLAS Thomas et MOUCHIROUD Axel\n\n");
    printf("Voulez-vous un Depart automatique ou manuel ? (A/M)\n");
    char choix=' ', saisie[5];
    char depart[5], avancement[5] = {'-','-','-','-','-'};
    int i=0;

    //Gestion des erreurs de saisie du mode de départ

    while (choix != 'A' && choix !='M')
        {
            choix = getchar(); fflush(stdin);
            if (choix != 'A' && choix !='M')
            {
                system("cls"); printf("Voulez-vous un Depart automatique ou manuel ? (A/M)\n");
            }
        }

    //Choix du mode de départ

    switch (choix)
    {
    case 'A':
        departAuto(depart);
        break;
    case 'M':
        departManuel(depart);
        break;
    }

    //Gestion des 10 essais autoriés

    for (i=0;i<10;i++)
    {
        system("cls");
        printf("Couleurs deja trouvees : "); afficheTableau(avancement);
        printf("\n\nEssai numero %d : ('R', 'J', 'V', 'B', 'O', 'W', 'P', 'F')\n", i+1);
        saisieUser(saisie);
        printf("\n\n");
        comparaison(depart,saisie,avancement);
        system("pause");
        if (testVictoire(avancement))
        {
            system("cls");
            printf("Vous avez gagne !\n");
            return 0;
        }
    }
    system("cls");
    printf("Vous avez perdu !\n");
    return 0;
}
