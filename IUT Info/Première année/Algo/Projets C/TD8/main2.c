#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"
int main()
{
	int T[10],i=0,somme=0;
 	for (i=0;i<10;i++)
  	  {
 	      T[i]=i+1;   //exercice 1
 	  }
 	  somme_pair(&somme, T);
 	  printf("%d", somme);
 	  return 0;
}
