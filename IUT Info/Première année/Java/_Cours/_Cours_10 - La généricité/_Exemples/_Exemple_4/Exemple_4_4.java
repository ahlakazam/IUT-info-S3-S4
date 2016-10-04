//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2011_2012 - Extensions Java 5
//
// Classe Exemple_4_4 - Calcul de la moyenne d'un tableau de notes
//                      (AVEC usage des generics dans les attributs)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_4 {
private LinkedList<Float> notes= new LinkedList<Float>();

   public Exemple_4_4 (float[] releve) {
   	  
      for (int i= 0; i < releve.length; i++) notes.add(releve[i]);
   }
   
   public float moyenne () {
   float somme=0.0f; 
     
      for (float val : notes) somme += val;

      return somme/notes.size();
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer une instance de la classe Exemple_4_4
      // 
      float[] notes = new float[4];
      
      notes[0]= 12.5f;
      notes[1]=  8.f;
      notes[2]= 10.0f;
      notes[3]= 14.f;
      
      Exemple_4_4 exemple= new Exemple_4_4(notes);
        	
      float moyenne= exemple.moyenne();
      
      System.out.println("M= " + moyenne);
   }
} 
