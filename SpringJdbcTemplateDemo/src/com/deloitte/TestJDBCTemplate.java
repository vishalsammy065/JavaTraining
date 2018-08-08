package com.deloitte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBCTemplate {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDAO empDao = (EmployeeDAO) ac.getBean("eDao");
		
		Employee emp1 = new Employee(102,"Aman",5);
		Employee emp2 = new Employee(102,"Ram",6);
		Employee emp3 = new Employee(103,"Shyam",9);
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		//invoke the DAO method
		
		//Insertion: empDao.insertRow(emp1);
		
		//Deletion: empDao.deleteRow(emp1);	
		
		//empDao.insertMultipleRows(empList);
		
		//Update: empDao.updateRow(emp1);
		
		//Select operation
		List<Employee> listemp = empDao.readAllEmployees();
		Iterator<Employee> it = listemp.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getDeptId());
		}
	}

}
