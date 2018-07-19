package com.vishal.nineteen;
import com.vishal.packageexample.*;

/**19th July Examples
* Encapsulation
* Creating new Packages and importing them
* explicit type casting
*/

class NineteenJuly {
	public static void main(String[] args) {
		PackageExample pe = new PackageExample();
		System.out.println(pe);
		
		//implicit type casting and dynamic binding
		Employee emp = new Employee(); //possible
		Employee empHR = new HR(); //possible 
		Employee empTech = new Technical(); //possible
		Technical t = new JavaPM(); //possible
		
		//down casting
		Employee e = new HR();
		if (e instanceof HR) {
			HR hr = (HR) e;
			System.out.println("Possible");
		} else {
			System.out.println("Not possible");
		}
		
		//not possible gives ClassCastException
		//HR hrEmp = (HR) new Employee();
		//JavaPM jpm = (JavaPM) new Technical();
	}
}
