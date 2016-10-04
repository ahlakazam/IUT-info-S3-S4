#include <stdio.h>
#include <math.h>

int main ()
{
    int i=0, age=0;
    char reponse='o';
    float moyenne=0;
    while(reponse != 'N')
    {
        fflush(stdin);
        scanf("%d", &age);
        moyenne += age;
        i++;
        printf("Encore une personne ? O/N : ");
        fflush(stdin);
        scanf("%c", &reponse);
    }
    moyenne /= (float)i;
    printf("\nMoyenne d'ages des %d personnes  : %f", i, moyenne);
    return 0;

}
