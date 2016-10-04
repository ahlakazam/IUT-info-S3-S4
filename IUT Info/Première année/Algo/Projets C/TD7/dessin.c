#include <stdio.h>
#include <stdlib.h>
#include <string.h>



void ligne (int L, char caractere)
{
    int i=0;
    for (i=0;i<L;i++)
    {
        printf("%c", caractere);
    }
}

void rectangle (int L, int h, char caractere)
{
    int i=0;
    for (i=0;i<h;i++)
    {
        ligne(L, caractere);
        printf("\n");
    }
}

void triangle_rectangle(int h, char caractere)
{
    int i=0;
    for (i=0;i<h;i++)
    {
        ligne(i, caractere);
        printf("\n");
    }
}

void triangle_isocele(int h, char caractere)
{
    int i=0;
    for (i=0 ; i<h ; i++)
    {
        ligne(h-i, ' ');
        ligne(2*i+1, caractere);
        printf("\n");

    }
}




