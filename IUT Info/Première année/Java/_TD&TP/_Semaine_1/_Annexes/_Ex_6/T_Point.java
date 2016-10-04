/**
* IUT de Nice / Departement informatique / Module M213
* Annee 2014_2015 - Package Geometrie
*
* Classe T_Point - Exemple de mise en oeuvre de la classe Point
*
* @author Alain Thuaire - Universite de Nice/IUT - Departement informatique
*
**/

public class T_Point {

   public static void main (String[] args) {
   	
   Point O= new Point();
   Point A= new Point(1., 1.);
   Point B= new Point(1, 4.5);
   
      System.out.println("Point A"+A.toString());
      System.out.println("Point B"+B.toString());
      
      System.out.println("Distance OA= " + O.distance(A));
      System.out.println("Distance AB= " + A.distance(B));
   }
} 
