#ifndef PROTOTYPES_H_INCLUDED
#define PROTOTYPES_H_INCLUDED

typedef struct {
    int cardinal;
    int *element;

}ensemble;
int appartient_element (ensemble e, int valeur);
void construire_element ();
int get_cardinal (ensemble e);
void ajouter_element (ensemble *e, int valeur);
void union_ensemble (ensemble *e1, ensemble *e2, ensemble *e3);




#endif // PROTOTYPES_H_INCLUDED
