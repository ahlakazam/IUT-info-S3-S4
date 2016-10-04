//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 2 - Acceder a une association
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_2 {

   public static void main(String[] args) {

      // Construire un dictionnaire de test
      //
      HashMap annuaire= new HashMap();
      ArrayList l = new ArrayList();
      l.add (new String("04.93.77.18.00"));
      l.add (new String("04.93.66.38.76"));
      annuaire.put(10, l);

      ArrayList numeros= (ArrayList)annuaire.get(10);

      System.out.println("10 : " + numeros + "\n");
   }
}
