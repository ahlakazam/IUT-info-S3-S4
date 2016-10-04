/**
* IUT de Nice / Departement informatique / Module M213
* Annee 2014_2015 - Package Geometrie
*
* Classe T_Vecteur - Exemple de mise en oeuvre de la classe Vecteur
*
* @author Alain Thuaire - Universite de Nice/IUT - Departement informatique
*
**/

public class T_Vecteur {

   public static void main (String[] args) {
   	
      // Creer quatre vecteurs distincts
      //
      Vecteur v1= new Vecteur();
      Vecteur v2= new Vecteur(1, 1);
      Vecteur v3= new Vecteur(2, 5);
      Vecteur v4= new Vecteur(1./2, 1./4);
      
      Vecteur v5= new Vecteur(1./3, 4./7);
      
      System.out.println("V1= " + v1.toString());
      System.out.println("V2= " + v2.toString());
      System.out.println("V3= " + v3.toString());
      System.out.println("V4= " + v4.toString());
      System.out.println();
      
      // Montrer le cas des erreurs d'arrondi
      //
      System.out.println("V5= " + v5.toString());
      System.out.println();
      
      // Calculer la somme des deux premiers vecteurs
      //
      System.out.println("R1= " + v1.add(v2).toString());
      
      // Calculer la somme des deux suivants
      //
      System.out.println("R2= " + v3.add(v4).toString());
      System.out.println();
      
      // Calculer la difference des deux premiers
      //
      System.out.println("R3= " + v1.sub(v2).toString());
      
      // Calculer la difference des deux suivants
      //
      System.out.println("R4= " + v3.sub(v4).toString());
      System.out.println();
      
      // Calculer le produit de V5 par le scalaire 3
      //
      System.out.println("R5= " + v5.mul(3).toString());
      System.out.println();
   }
} 
