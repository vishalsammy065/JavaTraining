package com.vishal.nineteen;
/*type casting and multi-level inheritance
 * 
 */

public class A {
	int a = 60;
	public int getA() {
		return a;
	}
}

class B extends A {
	int b = 50;
	int a = 6;
}

class C extends B {
	int c;
	public static void main(String[] args) {
		C obj = new C();
		System.out.println("A's varible a: "+((A)obj).a + " " + obj.getA());
		System.out.println("B's variable a: "+((B)obj).a);
	}
}