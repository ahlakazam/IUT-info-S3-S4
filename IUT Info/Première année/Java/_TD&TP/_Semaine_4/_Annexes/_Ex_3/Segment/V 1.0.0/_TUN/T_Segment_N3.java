//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires des accesseurs
// 					de consultation
//
//

public class T_Segment_N3
{
   public static void main (String[] args)
   	{
      Tests.Begin("Geom2D.Segment", "1.0.0");

         Tests.Design("Controle des accesseurs de consultation", 3);
         {
         	Point p1= new Point(1, 2);
            Point p2= new Point(1.5, -2);
            Point p3= new Point (-1, 2.25);
            Point p4= new Point (-1, -2);

            Tests.Case("Methode getOrigine");
            {
            	try
            	{
           			Segment s1 = new Segment(p1,p2);
					Tests.Unit("(1.0 , 2.0)",  s1.getOrigine().toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s1 = new Segment(p3,p4);
					Tests.Unit("(-1.0 , 2.25)",  s1.getOrigine().toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}
            }

            Tests.Case("Methode getExtremite");
            {
            	try
            	{
           			Segment s1 = new Segment(p1,p2);
					Tests.Unit("(1.5 , -2.0)",  s1.getExtremite().toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s1 = new Segment(p3,p4);
					Tests.Unit("(-1.0 , -2.0)",  s1.getExtremite().toString());
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
