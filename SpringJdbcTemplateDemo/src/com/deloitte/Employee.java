package com.deloitte;

public class Employee {
	private int empId;
	private String empName;
	private int deptId;
	
	Employee() {
		
	}
	Employee(int empId, String empName, int deptId) {
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}
