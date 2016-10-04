/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2013_2014 - Package Geom2D
*
* Classe Vecteur - Modelisation de l'espace vectoriel RxR
*
* Edition A    : edition initiale
*
*    + Version 0.1.0	: Version initiale
*    + Version 1.0.0    : ajout méthodes clone et equals
*
*
* @author Alain Thuaire - Universite de Nice/IUT - Departement informatique
*
**/



public class Vecteur
{
	private double x;
	private double y;
 	private final double EPSILON= 1./10000;

/**
* Constructeur par defaut
**/

   public Vecteur () { x= 0.; y= 0.;}

/**
* Constructeur normal
**/

   public Vecteur (double uneAbs, double uneOrd) { x= uneAbs;y= uneOrd; }

/**
* Accesseurs de consultation
* @return Retourne la coordonnee correspondante
**/

   public double getAbscisse() {return x;}
   public double getOrdonnee() {return y;}

/**
* Methode standard toString
* @return Retourne une forme externe de l'objet support
**/

   public String toString() {return "(" + x + ", " + y + ")";}


/**
* Methode standard equals
* @return Retourne vrai si le contenu de l'objet en paramètre
* est égal au contenu de l'objet support, faux sinon
*
**/

   public boolean equals(Object o)
   {
   	Vecteur v = (Vecteur) o;
   	return (
   		(Math.abs(x - v.getAbscisse())<= EPSILON) &&
   		(Math.abs(y - v.getOrdonnee())<= EPSILON)
   			);
   }

/**
* Methode standard clone
* @return Retourne un nouveau vecteur qui a le même contenu que l'objet support
*
**/

   public Object clone()
   {
   	return new Vecteur (x,y);
   }

/**
* Methode norme
* @return Retourne la norme du vecteur support
**/

   public double norme() {return Math.sqrt(x*x + y*y);}

/**
* Methode add
* @return Retourne la somme du vecteur support et de celui transmis en
* parametre
**/

   public Vecteur add (Vecteur op2)
   {
    return new Vecteur (x + op2.x, y + op2.y);
   }

/**
* Methode sub
* @return Retourne la difference entre le vecteur support et de celui
* transmis en parametre
**/

   public Vecteur sub (Vecteur op2)
   {
    return new Vecteur (x - op2.x, y - op2.y);
   }

/**
* Methode sub
* @return Retourne le vecteur oppose au vecteur support
**/
   public Vecteur sub ()
   {
    return new Vecteur (-x, -y);
   }

/**
* Methode mul
* @return Retourne le produit du vecteur support par le scalaire transmis
* en parametre
**/

   public Vecteur mul (double op2)
   {
    return new Vecteur (x*op2, y*op2);
   }

/**
* Methode produit scalaire
* @return Retourne le produit scalaire du vecteur support par le vecteur
* transmis en parametre
**/

   public double produitScalaire (Vecteur op2)
   {
    return x*op2.x + y*op2.y;
   }

/**
* Methode colineaire
* @return Retourne true si le vecteur support est colineaire avec le vecteur
* transmis en parametre
**/

   public boolean colineaire (Vecteur op2)
   {
    return Math.abs(x*op2.y - op2.x*y) <= EPSILON;
   }

/**
* Methode orthogonal
* @return Retourne true si le vecteur support est orthogonal avec le vecteur
* transmis en parametre
**/

   public boolean orthogonal (Vecteur op2)
   {
    return Math.abs(x*op2.x + y*op2.y) <= EPSILON;
   }

/**
* Methode memeSens
* @return Retourne true si le vecteur support a le meme sens que le vecteur
* transmis en parametre
**/

   public boolean memeSens (Vecteur op2)
   {

      // Controler la direction
      //
      if (!colineaire(op2)) return false;

      // Controler le sens
      //
      return (x*op2.x >= 0.) && (y*op2.y >= 0.);
   }
}
