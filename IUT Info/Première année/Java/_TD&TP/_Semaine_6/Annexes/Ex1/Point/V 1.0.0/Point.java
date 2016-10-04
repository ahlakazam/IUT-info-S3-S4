/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2013_2014 - Package Geom2D
*
* Classe Point
*
* Edition A    : edition initiale
*
*     + version 0.0.0	:	version initiale
*	  + version	1.0.0   :   ajout des tests unitaires
*
* @author Gaelle Le Mur
*
**/


public class Point
{
	private double abscisse;
	private double ordonnee;
	private final double EPSILON= 1./10000;
/**
* Constructeur par defaut
**/

   public Point ()
   {
      abscisse= 0.;
      ordonnee= 0.;
   }

/**
* Constructeur normal
**/

   public Point (double uneAbs, double uneOrd)
   {
      abscisse= uneAbs;
      ordonnee= uneOrd;
   }

/**
* Accesseurs de consultation
* @return Retourne la coordonnee correspondante
**/

   public double getAbscisse() {return abscisse;}
   public double getOrdonnee() {return ordonnee;}

/**
* Methode standard toString
* @return Retourne une forme externe de l'objet support
**/

   public String toString()
   {
      return "(" + abscisse + " , " + ordonnee + ")";
   }


/**
* Methode standard equals
* @return Retourne vrai si le contenu de l'objet en paramètre
* est égal au contenu de l'objet support, faux sinon
*
**/

   public boolean equals(Object p)
   {
   		 // return((this.abscisse == ((Point)p).abscisse) && (this.ordonnee == ((Point)p).ordonnee));
   		 return this.confondus((Point)p);
   }

/**
* Methode standard clone
* @return Retourne un nouveau point qui a le même contenu que l'objet support
*
**/

   public Object clone()
   {
   		return(new Point (this.abscisse, this.ordonnee));
   }

/**
* Methode standard distance
* @return Retourne la distance entre le point support et le point designe
* par parametre
**/

   public double distance(Point unB)
   {
   		double deltaX= abscisse - unB.abscisse;
   		double deltaY= ordonnee - unB.ordonnee;
      	return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
   }

/**
* Methode standard projX
* @return Retourne le point projete sur X
**/

   public Point projX()
   {
      return new Point(this.abscisse,0);
   }

/**
* Methode standard projY
* @return Retourne le point projete sur Y
**/

   public Point projY()
   {
      return new Point(0,this.ordonnee);
   }

/**
* Methode standard symetrie
* @return Retourne le point symetrique par symetrie centrale
**/

   public Point symetrie()
   {
      return new Point(-this.abscisse,-this.ordonnee);
   }

/**
* Methode standard translation
* @return Retourne le point translaté
**/

   public Point translation(Vecteur v)
   {
      return new Point(this.abscisse+v.getAbscisse(),this.ordonnee+v.getOrdonnee());
   }

/**
* Methode standard homothétie
* @return Retourne le point transformé par homothétie
**/

   public Point homothetie(double k)
   {
      return new Point(k * this.abscisse,k * this.ordonnee);
   }

   public Point homothetie(Point C, double k)
   {
	  double x = C.getAbscisse() + k * (this.abscisse - C.getAbscisse());
	  double y = C.getOrdonnee() + k * (this.ordonnee - C.getOrdonnee());
      return new Point(x,y);
   }

/**
* Methode standard rotation
* @return Retourne le point transformé par rotation
**/

   public Point rotation(double angle)
   {
   		double angleRad = Math.PI*angle/180;
   		double x = this.abscisse * Math.cos(angleRad) - this.ordonnee * Math.sin(angleRad);
   		double y = this.abscisse * Math.sin(angleRad) + this.ordonnee * Math.cos(angleRad);
		return new Point(x,y);
   }

/**
* Methode standard confondus
* @return Retourne true si point support est confondu avec le point passé en paramètre
**/

	public boolean confondus (Point p)
	{
		return ((Math.abs(this.abscisse - p.abscisse) <= EPSILON) && (Math.abs(this.ordonnee - p.ordonnee) <= EPSILON ));
	}
}

