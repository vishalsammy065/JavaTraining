
public class Employee {
	private int empId;
	private String empName;
	private double sal;
	private static String companyName = "Deloitte";
	
	public Employee() {
		super();
		this.empId = 0;
		this.empName = "No Name";
		this.sal = 0.0;
	}
	
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	
	public double calculateBonus() {
		if(this.sal <= 5000)
			return this.sal * 0.2;
		else
			return this.sal * 0.1;
	}
	
	public static String getCompanyName() {
		return companyName;
	}
}
