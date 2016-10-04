/**
* IUT de Nice / Departement informatique / Module M213
* Annee 2014_2015 - Package Geometrie
*
* Classe Point - Element de la modelisation du plan euclidien
*
* Edition A    : edition initiale  
*
*    @version 1.0.0	:	version initiale
*
* @author Alain Thuaire - Universite de Nice/IUT - Departement informatique
*
**/

public class Point {
private double abscisse;
private double ordonnee;       

/**
* Constructeur par defaut 
**/

   public Point () {

      abscisse= 0.;
      ordonnee= 0.; 
   }
   
/**
* Constructeur normal 
**/

   public Point (double uneAbs, double uneOrd) {

      abscisse= uneAbs;
      ordonnee= uneOrd; 
   }

/**
* Accesseurs de consultation
* @return Retourne la coordonnee correspondante
**/
   
   public double getAbscisse() {return abscisse;}
   public double getOrdonnee() {return ordonnee;}
   
/**
* Methode standard toString
* @return Retourne une forme externe de l'objet support
**/
   
   public String toString() {
   	
      return "(" + abscisse + " , " + ordonnee + ")"; 
   }
 
/**
* Methode standard distance
* @return Retourne la distance entre le point support et le point designe
* par parametre
**/  
   public double distance(Point unB) {
   double deltaX= abscisse - unB.abscisse;
   double deltaY= ordonnee - unB.ordonnee;
      return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
   }          
} 
