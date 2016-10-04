#ifndef PROTOTYPES_H_INCLUDED
#define PROTOTYPES_H_INCLUDED

typedef struct {
    int cardinal;
    int *element;

}ensemble;
int appartient_element (ensemble e, int valeur);
void construire_element (ensemble* e);
int get_cardinal (ensemble e);
void ajouter_element (ensemble *e, int valeur);
void union_ensemble (ensemble *e1, ensemble *e2, ensemble *e3);
int is_void (ensemble e);
void inter_ensemble (ensemble *e1, ensemble *e2, ensemble *e3);





#endif // PROTOTYPES_H_INCLUDED
