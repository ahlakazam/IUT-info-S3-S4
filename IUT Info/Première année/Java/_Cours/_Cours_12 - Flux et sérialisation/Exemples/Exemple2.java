/**
 * @(#)Exemple2.java
 *
 *
 * @author
 * @version 1.00 2016/4/25
 */

import java.io.*;
public class Exemple2
{

    	public static void main(String[] args) throws Throwable
    	{
    		File f = new File("fic.data");
			if (!f.exists()) return;
			if (!f.isFile()) return;

			String s2;
			BufferedReader entree = new BufferedReader(new FileReader("fic.data"));

			while((s2=entree.readLine())!=null)
				System.out.println(s2);
			entree.close();


    	}

}