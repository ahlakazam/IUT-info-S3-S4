#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int coups =10;
    int i=0;
    char mot[50], lettre;
    char reponse[50]="";
    printf("Entrez le mot mystere (sans majuscules) : ") ; scanf("%s", mot);
    system("cls");
    for(i=0;i<strlen(mot);i++)
    {
        reponse[i] = '-';
    }
    i=0;
    while (strcmp(mot,reponse)!=0 && (coups != 0))
    {
        printf("%d coups restants.\n", coups);
        printf("Voila votre mot : ");
        printf("%s\n", reponse);
        printf("Proposez une lettre : ");
        fflush(stdin);
        scanf("%c",&lettre);
        for (i=0;i<strlen(mot);i++)
        {
            if (mot[i] == lettre)
            {
                reponse[i] = lettre;
                coups++;
            }
        }
        system("cls");
        coups--;
    }
    if (coups == 0)
        printf("Perdu !");
        system("pause");
    else
        printf("Bien ouej bro ! Trouve en %d coups", coups);
        system("pause");
    return 0;
}
