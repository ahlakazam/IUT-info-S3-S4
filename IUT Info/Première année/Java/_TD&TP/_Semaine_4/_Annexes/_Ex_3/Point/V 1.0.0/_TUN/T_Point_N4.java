//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires des methodes distance, projX et projY
//
//

public class T_Point_N4
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle des methodes distance, projX et projY", 3);
         {

            Tests.Case("methode distance");
            {
            	Point p1= new Point();
	        	Point p2= new Point(0., 2.);
	        	Point p3= new Point(1.0, 0.);
	        	Point p4= new Point(6.0, 0.);

				Tests.Unit(0.0,  p1.distance(p1));
				Tests.Unit(1.0,  p1.distance(p3));
				Tests.Unit(2.0,  p1.distance(p2));
				Tests.Unit(6.0,  p1.distance(p4));
            }

            Tests.Case("methode projX");
            {
            	Point p1= new Point();
	        	Point p2= new Point(0., 2.);
	        	Point p3= new Point(1.0, 0.);
	        	Point p4= new Point(6.4, 4.2);

 				Tests.Unit("(0.0 , 0.0)",  p1.projX().toString());
 				Tests.Unit("(0.0 , 0.0)",  p2.projX().toString());
 				Tests.Unit("(1.0 , 0.0)",  p3.projX().toString());
 				Tests.Unit("(6.4 , 0.0)",  p4.projX().toString());
            }

            Tests.Case("methode projY");
            {
            	Point p1= new Point();
	        	Point p2= new Point(0., 2.);
	        	Point p3= new Point(1., 0.);
	        	Point p4= new Point(6.4, 4.2);

 				Tests.Unit("(0.0 , 0.0)",  p1.projY().toString());
 				Tests.Unit("(0.0 , 2.0)",  p2.projY().toString());
 				Tests.Unit("(0.0 , 0.0)",  p3.projY().toString());
 				Tests.Unit("(0.0 , 4.2)",  p4.projY().toString());
            }
         }
      Tests.End();
   }
}