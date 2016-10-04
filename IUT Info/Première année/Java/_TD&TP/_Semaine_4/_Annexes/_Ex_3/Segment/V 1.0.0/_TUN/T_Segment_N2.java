//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires des methodes
//                  clone et equals
//
//

public class T_Segment_N2
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Segment", "1.0.0");
         Tests.Design("Controle des methodes clone et equals", 3);
         {
         	Point p1= new Point(1, 2);
            Point p2= new Point(1.5, -2);
            Point p3= new Point (-1, 2.25);
            Point p4= new Point (-1, -2);
            Point p5= new Point (-1.00005, -2.00005);

            Tests.Case("Methode clone");
            {
            	try
            	{
           			Segment s1 = new Segment(p1,p2);
					Tests.Unit("[ (1.0 , 2.0),(1.5 , -2.0) ]",  ((Segment)s1.clone()).toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s1 = new Segment(p3,p4);
					Tests.Unit("[ (-1.0 , 2.25),(-1.0 , -2.0) ]",  ((Segment)s1.clone()).toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}
            }

            Tests.Case("Methode equals");
            {
            	try
            	{
           			Segment s1 = new Segment(p1,p2);
           			Segment s2 = new Segment((Point)p1.clone(),(Point)p2.clone());
               		Tests.Unit(true, s1.equals(s2));
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s1 = new Segment(p1,p4);
           			Segment s2 = new Segment(p1,p5);
               		Tests.Unit(true, s1.equals(s2));
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s1 = new Segment(p1,p2);
           			Segment s2 = new Segment(p3,p4);
               		Tests.Unit(false, s1.equals(s2));
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