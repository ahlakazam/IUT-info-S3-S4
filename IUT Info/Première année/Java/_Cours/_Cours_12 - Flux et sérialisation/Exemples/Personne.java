/**
 * @(#)Personne.java
 *
 *
 * @author
 * @version 1.00 2016/4/25
 */

import java.io.*;
import java.util.*;

public class Personne implements Serializable
{
    String nom;
    int age;
    ArrayList enfants;

    public Personne(String n, int a, ArrayList e)
    {
		nom = n; age = a; enfants = e;
    }

    public String toString()
    {
		return nom + " " + age + " : " + enfants;
    }

    public static void save(String fileName, Personne p) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		try{ oos.writeObject(p); }

		finally{ oos.close(); }

	}

	public static Personne load (String fileName) throws IOException
	{
		Personne p = null;
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));

		try {
			p = (Personne) ois.readObject();
		}
		catch(Exception e){	}
		finally { ois.close(); }
		return p;
	}

	public static void main(String[] args) throws Exception
 	{
 		/*
		{
		    	ArrayList enfants = new ArrayList();
		    	enfants.add ("toto");
		    	enfants.add ("tata");
		    	Personne p = new Personne("titi", 40, enfants);
		    	Personne.save("titi.data", p);
				// ou p.save("titi.data");
		}
		*/

		{
		    	Personne p1 = Personne.load("titi.data");
				System.out.println(p1);
		}
	}

}
