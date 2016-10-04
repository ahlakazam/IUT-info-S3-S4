//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2014_2015 - DUT/S2
//
// Classe Vecteur - Modelisation de l'espace vectoriel RxR
//
// Edition "Draft"  : le point d'entree simule les tests unitaires
//
//    + Version 0.0.0	: Cours_2
//    + Version 0.1.0   : Cours_5 (suppression du main interne)
//
// Auteur : A. Thuaire
//

public class Vecteur {
private double m_x;
private double m_y;
private final double EPSILON= 1./10000;

   // ---                                               Constructeur par defaut

   public Vecteur() {

      // Fixer les deux attributs de la fraction (element neutre)
      //
      m_x= 0;
      m_y= 0;
   }

   // ---                                                   Constructeur normal

   public Vecteur(double x, double y) {

      // Fixer les deux attributs du vecteur
      //
      m_x= x;
      m_y= y;
   }

   // ---                                                      Methode toString

   public String toString() {return "(" + m_x + ", " + m_y + ")";}

   // ---                                                           Methode add

   public Vecteur add (Vecteur op2) {

      return new Vecteur (m_x + op2.m_x, m_y + op2.m_y);
   }

   // ---                                                           Methode sub

   public Vecteur sub (Vecteur op2) {

      return new Vecteur (m_x - op2.m_x, m_y - op2.m_y);
   }

   public Vecteur sub () {

      return new Vecteur (-m_x, -m_y);
   }

   // ---                                                           Methode mul

   public Vecteur mul (double op2) {

      return new Vecteur (m_x*op2, m_y*op2);
   }

   // ---                                               Methode produitScalaire

   public double produitScalaire (Vecteur op2) {

      return m_x*op2.m_x + m_y*op2.m_y;
   }

   public boolean colineaire (Vecteur op2) {

      return Math.abs(m_x*op2.m_y - op2.m_x*m_y) < EPSILON;
   }

   public boolean orthogonal (Vecteur op2) {

      return Math.abs(m_x*op2.m_x + m_y*op2.m_y) < EPSILON;
   }

   public boolean memeSens (Vecteur op2) {

      // Controler la direction
      //
      if (!colineaire(op2)) return false;

      // Controler le sens
      //
      return (m_x*op2.m_x >= 0) && (m_y*op2.m_y >= 0);
   }
}