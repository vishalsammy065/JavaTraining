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