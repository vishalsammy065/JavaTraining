package com.vishal.nineteen;

import com.vishal.packageexample.Trainer;

public class Test{

	public static void main(String[] args) {
		MySchool msObj = new MySchool("Vishal", 500, "Varanasi");
		System.out.println(msObj.nameOfSchool +" "+msObj.noOfStudents+" "+msObj.city);
		
		Trainer trainerObj = new Trainer("Guru", 40, 300000);
		System.out.println(trainerObj.getName()+" "+trainerObj.getAge()+" "+trainerObj.getSalary());
		
	}

}
