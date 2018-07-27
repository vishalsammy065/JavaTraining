package SecondWeekAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

class EmployeeVo {
	int empID;
	String empName;
	double annualIncome, incomeTax;

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name is " + empName + "\nEmp ID is " + empID + "\nIncome=" + annualIncome + "\nIncome Tax=" + incomeTax
				+ "";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empID;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (((EmployeeVo) obj).empID == this.empID)
			return true;
		return false;
	}

	public EmployeeVo(String empName, int empID, double annualIncome, double incomeTax) {
		// TODO Auto-generated constructor stub
		this.empName = empName;
		this.empID = empID;
		this.incomeTax = incomeTax;
		this.annualIncome = annualIncome;
	}

}

class EmployeeBo {
	public void calincomeTax(EmployeeVo e) {
		e.incomeTax = e.annualIncome * 0.33;
	}
}

class EmployeeSort implements Comparator<EmployeeVo> {

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		// TODO Auto-generated method stub
		if (o1.incomeTax > o2.incomeTax)
			return -1;
		else
			return 1;
		// return 0;
	}
}

public class IncomeTax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter number of employees");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		// int choice;
		// double result = 0.0;
		int empID;
		String empName;
		double annualIncome, incomeTax;
		n = Integer.parseInt(br.readLine());
		EmployeeVo emps[] = new EmployeeVo[n];
		EmployeeBo eb = new EmployeeBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter emp id");
			empID = Integer.parseInt(br.readLine());
			System.out.println("Enter emp name");
			empName = br.readLine();
			System.out.println("ENter annual income");
			annualIncome = Double.parseDouble(br.readLine());
			emps[i] = new EmployeeVo(empName, empID, annualIncome, 0.0);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Employee " + i + " details are:\n" + emps[i]);
			eb.calincomeTax(emps[i]);
		}

		TreeSet<EmployeeVo> ts = new TreeSet(new EmployeeSort());
		for (int i = 0; i < n; i++) {
			ts.add(emps[i]);
		}

		System.out.println();
		System.out.println("Sorted details are ");
		for (EmployeeVo e : ts) {
			System.out.println("Employee " + e.empName + " details are:\n" + e);
			System.out.println();
		}

	}

}
