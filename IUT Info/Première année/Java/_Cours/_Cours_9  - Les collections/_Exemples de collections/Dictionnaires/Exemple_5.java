//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 5 - Dupliquer un dictionnaire
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_5 {

   public static void main(String[] args) {

      // Construire un dictionnaire de test
      //
      HashMap annuaire= new HashMap();

      annuaire.put("Durand", "04.93.77.18.00");
      annuaire.put("Dupuy",  "04.93.66.38.76");
      annuaire.put("Leroy",  "04.92.94.20.00");

      HashMap duplicata= (HashMap)annuaire.clone();
      annuaire.remove("Durand");
      System.out.println("Annuaire= " + annuaire);
      System.out.println("Duplicata= " + duplicata);
      if (duplicata.equals(annuaire)) System.out.println("OK");
      else System.out.println("NOK");
   }
}
