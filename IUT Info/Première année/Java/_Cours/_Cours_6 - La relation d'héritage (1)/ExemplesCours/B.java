/**
 * @(#)B.java
 *
 *
 * @author
 * @version 1.00 2013/3/6
 */


public class B extends A{

    public B() {}
    public void m1() {System.out.println("m1 de A redefinie dans B");}
    public void m2() {System.out.println("m2 de B");}

    public static void main(String[] args)
    {
		B b = new B();
		b.m0();
		b.m1();
		b.m2();
		System.out.println();
		A a = b;
		a.m0();
		a.m1();
		//a.m2(); error cannot find symbol m2

    }

}