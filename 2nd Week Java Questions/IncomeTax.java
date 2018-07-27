import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

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
