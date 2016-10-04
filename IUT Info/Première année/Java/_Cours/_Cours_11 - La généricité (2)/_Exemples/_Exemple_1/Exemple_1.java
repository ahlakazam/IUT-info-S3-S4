//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_1 - Autoboxing et unboxing
// 
// Auteur : A. Thuaire
//
import java.util.*;

public class Exemple_1 {
private Integer a1;
private HashMap m1;

// ---                                                  Constructeurs

   public Exemple_1()          { a1= 0; }
   public Exemple_1(int v, HashMap h) {
   Integer i1= new Integer(1); 
   
      a1= i1 + v;
      m1= h;
   }
   
// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer deux instances de la classe Exemple_1
      //   	
      Exemple_1 o1= new Exemple_1();
      
      HashMap source= new HashMap();
      
      source.put("cle_A", 12);
      source.put("cle_B", true);
      
      Exemple_1 o2= new Exemple_1(8, source);
   }
} 
