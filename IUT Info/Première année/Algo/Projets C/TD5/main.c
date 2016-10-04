#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int vies =10,compteur=0;
    int i=0;
    char mot[500], lettre;
    char reponse[500]="";
    printf("Entrez le mot mystere (sans majuscules) : ") ; scanf("%s", mot);
    system("cls"); //Efface l'écran
    for(i=0;i<strlen(mot);i++)
    {
        reponse[i] = '-'; //Brouille le texte de la réponse
    }
    i=0;
    while (strcmp(mot,reponse)!=0 && (vies != 0))
    {
        printf("%d vies restantes.\n", vies);
        printf("Voila votre mot : ");
        printf("%s\n", reponse);
        printf("Proposez une lettre : ");
        fflush(stdin);
        scanf("%c",&lettre);
        for (i=0;i<strlen(mot);i++)
        {
            if (mot[i] == lettre)
            {
                reponse[i] = lettre; //Cherche la lettre dans le mot et remplace dans la réponse
                vies++;
            }
        }
        system("cls");
        vies--;
        compteur++;
    }
    if (vies == 0)
        printf("Perdu !");
    else
        printf("Bien ouej bro ! Trouve en %d coups", compteur);
    return 0;
}
