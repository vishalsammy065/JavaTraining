package com.deloitte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;
	int rows;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//user defined method
	public void insertRow(Employee e) {
		int empId = e.getEmpId();
		String empName = e.getEmpName();
		int deptId = e.getDeptId(); 
		String sql = "INSERT INTO EMPLOYEE1 VALUES("+empId+",'"+empName+"',"+deptId+")";
		int rows = jdbcTemplate.update(sql);
		if (rows > 0)
			System.out.println("Successfully inserted the values...");
		else
			System.out.println("Failed inserting the values...");		
	}
	
	public void deleteRow(Employee e) {
		String eName = e.getEmpName();
		String sql = "DELETE FROM EMPLOYEE1 WHERE EMPNAME = '"+eName+"'";
		int rows = jdbcTemplate.update(sql);		
		
		if(rows == 0)
			System.out.println("Not found..");
		else
			System.out.println("Records deleted successfully...");
	}
	
	public void insertMultipleRows(ArrayList e) {
		Iterator it = e.iterator();
		while(it.hasNext()) {
			Employee em = (Employee) it.next();
			int empId = em.getEmpId();
			String empName = em.getEmpName();
			int deptId = em.getDeptId(); 
			String sql = "INSERT INTO EMPLOYEE1 VALUES("+empId+",'"+empName+"',"+deptId+")";
			rows = jdbcTemplate.update(sql);
		}
		
		if(rows > 0 ) {
			System.out.println(e.size()+" records added...");
		}
	}
	
	public void updateRow(Employee e) {
		int empId = e.getEmpId();
		String empName = e.getEmpName();
		int deptId = e.getDeptId();
		String sql = "UPDATE EMPLOYEE1 SET EMPNAME = '"+empName+"', DEPTID = "+deptId+" WHERE EMPID = "+empId;
		int rows = jdbcTemplate.update(sql);
		if(rows > 0)
			System.out.println("Updated...");
		else 
			System.out.println("Error updating...");		
	}
	
	public ArrayList<Employee> readAllEmployees() {
		List<Employee> allEmployees = null;
		String sql = "SELECT * FROM EMPLOYEE1";
		allEmployees = jdbcTemplate.query(sql, (RowMapper) (rs, rowNum) -> {
			int empId = rs.getInt(1);
			String name = rs.getString(2);
			int deptId = rs.getInt(3);
			Employee e = new Employee();
			e.setEmpId(empId);
			e.setEmpName(name);
			e.setDeptId(deptId);
			return e;
		});
		return (ArrayList<Employee>) allEmployees;
	}
}
