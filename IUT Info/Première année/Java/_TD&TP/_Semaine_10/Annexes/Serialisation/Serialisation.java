/**
 * @(#)Serialisation.java
 *
 *
 * @author
 * @version 1.00 2016/5/4
 */

import java.io.*;
public abstract class Serialisation
{
	public static void save(String fileName, Object o) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		try{ oos.writeObject(o); }

		finally{ oos.close(); }

	}

	public static Object load (String fileName) throws IOException
	{
		Object o = null;
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));

		try {
			o = ois.readObject();
		}
		catch(Exception e){	}
		finally { ois.close(); }
		return o;
	}

}