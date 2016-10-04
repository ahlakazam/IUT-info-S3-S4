/**
 * @(#)Exemple1.java
 *
 *
 * @author
 * @version 1.00 2016/4/25
 */

import java.io.*;
public class Exemple1
{

    	public static void main(String[] args) throws Throwable
    	{
    		String s = "abc\ndef\nghi";
			StringReader sr = new StringReader(s);
			BufferedReader entree = new BufferedReader(sr);

			FileWriter fw = new FileWriter("fic.data");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter sortie = new PrintWriter(bw);
			String s1;
			while ((s1=entree.readLine())!=null)
			{
				sortie.println(s1);
				//System.out.println(s1);
			}
			sortie.close();

    	}

}