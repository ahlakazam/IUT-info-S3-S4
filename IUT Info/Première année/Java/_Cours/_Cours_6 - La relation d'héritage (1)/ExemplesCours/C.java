/**
 * @(#)C.java
 *
 *
 * @author
 * @version 1.00 2013/3/6
 */


public class C extends B{

    public C() {}
    public void m3() {System.out.println("m3 de C");}

    public static void main(String[] args)
    {
    	C c = new C();
		c.m0();
		c.m1();
		c.m2();
		c.m3();
		System.out.println();

		B b = c;
		b.m0();
		b.m1();
		b.m2();
		System.out.println();


		A a = c;
		a.m0();
		a.m1();
		System.out.println();

    }


}