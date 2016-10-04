//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_3 - Mise en oeuvre d'une enumeration
// 
// Auteur : A. Thuaire
//

public class Exemple_3 {
private Ressource[] ressources;

// ---                                             Constructeur normal

   public Exemple_3(Ressource[] tirage) { 
   
      ressources= tirage; 
   }
   
   
// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer une instance de la classe Exemple_3
      // 
      Ressource[] tirage= new Ressource[5];
      
      tirage[0]= Ressource.sel;
      tirage[1]= Ressource.sel;
      tirage[2]= Ressource.sel;
      tirage[3]= Ressource.jade;
      tirage[4]= Ressource.or;
        	
      Exemple_3 o1= new Exemple_3(tirage);
      
      System.out.println("R= " + tirage[0]);
   }
} 
