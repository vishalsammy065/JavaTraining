package com.vishal.packageexample;

public class Trainer {
	private String name;
	private int age;
	protected double salary;
	
	Trainer() {
		
	}
	
	public Trainer(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public double getSalary() {
			return this.salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
