//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires des methodes clone et equals
//
//

public class T_Point_N2
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
         Tests.Design("Controle des methodes clone et equals", 3);
         {
         	Point p1= new Point(1.5, 3.5);
        	Point p2= new Point(0.5, 2.);
        	Point p3= new Point(-3., 4.);
        	Point p4= new Point(5., 1.2);
        	Point p5= new Point(3.6, 2.3);

            Tests.Case("Methode clone");
            {
                Tests.Unit("(1.5 , 3.5)",  p1.clone().toString());
				Tests.Unit("(0.5 , 2.0)",  p2.clone().toString());
				Tests.Unit("(-3.0 , 4.0)",  p3.clone().toString());
				Tests.Unit("(5.0 , 1.2)",  p4.clone().toString());
				Tests.Unit("(3.6 , 2.3)",  p5.clone().toString());
            }

            Tests.Case("Methode equals");
            {
                Tests.Unit(true,  p1.equals(new Point(1.5, 3.5)));
				Tests.Unit(false,  p2.equals(new Point(0.4, 2.)));
				Tests.Unit(false,  p3.equals(new Point(-3., 6.)));
				Tests.Unit(true,  p4.equals(new Point(5., 1.2)));
				Tests.Unit(true,  p5.equals(new Point(3.6, 2.3)));
            }
         }
      Tests.End();
   }
}