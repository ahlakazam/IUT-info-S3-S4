/**
 * @(#)Decroissant.java
 *
 *
 * @author
 * @version 1.00 2013/4/1
 */

import java.util.*;
public class Decroissant implements Comparator<String>
{

    public int compare(String o1, String o2)
	{
		// a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
		int resu = o1.compareTo(o2);
		if (resu<0) return 1;
		if (resu>0) return -1;
		return resu;
	}
}