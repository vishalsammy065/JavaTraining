package com.vishal.nineteen;
/*
 * super class of Technical and HR
 * 
 */
public class Employee {
	int empId;
	double salary;
	String dept;
	Address add;
	public Employee(int empId, double salary, String dept, Address add) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
		this.add = add;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId= " + empId + ", salary= " + salary + ", dept= " + dept + ", add= " + add + "]";
	}
	
	public static void main(String[] arsg) {
		Employee e = new Employee(101, 50000, "IT", new Address("101", "Main Street", "Banglore"));
		System.out.println(e);
	}
}



