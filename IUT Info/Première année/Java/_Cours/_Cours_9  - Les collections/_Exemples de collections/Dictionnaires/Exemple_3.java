//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 3 - Visualiser le contenu d'un dictionnaire
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_3 {

   public static void main(String[] args) {

      // Construire un dictionnaire de test
      //
      HashMap annuaire= new HashMap();

      annuaire.put("Durand", "04.93.77.18.00");
      annuaire.put("Dupuy",  "04.93.66.38.76");
      annuaire.put("Leroy",  "04.92.94.20.00");


      System.out.println("Annuaire= " + annuaire);
      annuaire.put("toto", "111111");
      annuaire.put("toto", "2222222");
      System.out.println("Annuaire= " + annuaire);
   }
}
