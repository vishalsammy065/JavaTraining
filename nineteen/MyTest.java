package com.vishal.nineteen;
import com.vishal.packageexample.LabTrainer;

public class MyTest{

	public static void main(String[] args) {
		LabTrainer ltObj = new LabTrainer("Vishal", "Python" ,6000);
		System.out.println(ltObj.getSalary());
	}
}