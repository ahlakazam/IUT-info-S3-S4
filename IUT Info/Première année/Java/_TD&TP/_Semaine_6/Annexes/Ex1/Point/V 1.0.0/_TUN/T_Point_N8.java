//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la methode rotation
//
//

public class T_Point_N8
{
   public static void main (String[] args)
   {
      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle de la methode rotation", 3);
         {

            Tests.Case("methode rotation");
            {
            	Point p0 = new Point();
   				Point p1 = new Point(1., 1.);
   				Point p2 = new Point(1., 4.5);

   				Tests.Unit("(0.0 , 0.0)",  p0.rotation(90).toString());
    			Tests.Unit("-1.0 , 1.0)",  p1.rotation(90).toString());
    			Tests.Unit("(-4.5 , 1.0)",  p2.rotation(90).toString());

    			Tests.Unit("(0.0 , 0.0)",  p0.rotation(180).toString());
    			Tests.Unit("(-1.0 , -1.0)",  p1.rotation(180).toString());
    			Tests.Unit("(-1.0 , -4.5)",  p2.rotation(180).toString());
            }
         }
      Tests.End();
   }
}