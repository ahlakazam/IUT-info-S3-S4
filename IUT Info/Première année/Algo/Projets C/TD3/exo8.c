#include <stdio.h>
#include <malloc.h>
#include <string.h>
#include <math.h>

int main ()
{
    int i=0;
    char nom[20], precedent[20];
    strcpy (nom, "pierre");
    strcpy (precedent, "jean");
    while (strcmp(nom,precedent))
    {
        strcpy (precedent, nom);
        scanf("%s", nom);
        printf("\n");
        i++;
    }
    printf("\n%d", i-1);
    return 0;
}
