#include <stdio.h>
#include <stdlib.h>

void remplissage (int T[5][5])
{
    int i=3;
    int a=2;
    int n=1;

    while (n <= 25)
    {
        T[i][a]=n;
        a++;
        if (a > 4)
            a=0;
        i++;
        if (i > 4)
            i=0;
        n++;
        if (T[i][a]!=0)
        {
            a--;
            i++;
            if (i > 4)
                i=0;
            while (T[i][a]!=0)
            {
                i+=2;
                if (i > 4)
                    i=0;
            }
        }
    }
}
