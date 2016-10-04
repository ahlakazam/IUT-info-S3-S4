//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires de la methode
// 					homothetie
//
//

public class T_Segment_N7
{
   public static void main (String[] args)
   	{
      Tests.Begin("Geom2D.Segment", "1.0.0");

         Tests.Design("Controle de la methode homothetie", 3);
         {
            Tests.Case("Methode homothetie");
            {
            	Point o= new Point();
   				Point p1= new Point(1., 1.);
   				Point p2= new Point(1., 4.5);
   				Point p3= new Point(-1, -2);
            	Point p4= new Point(1.5, -2);
            	Point p5= new Point (-1, 2.25);

 				try
 				{
 					Segment s = new Segment(o,p3);
     				Tests.Unit("[ (0.0 , 0.0),(-0.5 , -1.0) ]",  s.homothetie(0.5).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

 				try
 				{
 					Segment s = new Segment(p1,p2);
     				Tests.Unit("[ (-1.25 , -1.25),(-1.25 , -5.625) ]",  s.homothetie(-1.25).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

 				try
 				{
 					Segment s = new Segment(p4,p5);
     				Tests.Unit("[ (4.5 , -6.0),(-3.0 , 6.75) ]",  s.homothetie(3.).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}
            }
         }
      Tests.End();
   }
}
