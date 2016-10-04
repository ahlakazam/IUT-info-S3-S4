//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires des constructeurs
//                  (cas nominaux)
//
//

public class T_Point_N1
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
         Tests.Design("Controle des constructeurs", 3);
         {
            Tests.Case("Constructeur par defaut");
            {
            	Point p0= new Point();
				Tests.Unit("(0.0 , 0.0)",  p0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Point p1= new Point(1, 2);
            	Point p2= new Point(1.5, -2);
            	Point p3= new Point (-1, 2.25);
            	Point p4= new Point (-1, -2);

               	Tests.Unit("(1.0 , 2.0)",    p1.toString());
               	Tests.Unit("(1.5 , -2.0)",   p2.toString());
               	Tests.Unit("(-1.0 , 2.25)",   p3.toString());
               	Tests.Unit("(-1.0 , -2.0)",  p4.toString());
            }
         }
      Tests.End();
   }
}