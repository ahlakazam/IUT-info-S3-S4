//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 4 - Exploiter un dictionnaire
//
// Auteur : A. Thuaire
//

import java.util.*;
import java.io.*;
import java.lang.*;

public class Exemple_4 {

   public static void main(String[] args) {

      // Construire un dictionnaire de test
      //
      HashMap notes= new HashMap();

      notes.put("API",     new Double(14.5));
      notes.put("Maths",   new Double(8.5));
      notes.put("Anglais", new Double(12));
      notes.put("ASR",     new Double(12));

      Iterator i= notes.keySet().iterator();
      double total= 0.;
      Object matiere;
      double note;

      while (i.hasNext()) {
         matiere= i.next();
         note = ((Double)notes.get(matiere)).doubleValue();
         System.out.println((String) matiere + " " + note);
         total += note;
      }

      System.out.println("Moyenne= " + total / notes.size());


      // recherche inversée
      Double val = new Double(12.0);
      Iterator j= notes.keySet().iterator();

      while (j.hasNext())
      	{
         matiere= j.next();
         if (((Double)notes.get(matiere)).doubleValue() == val)
         	System.out.println(matiere);
      }

   }
}
