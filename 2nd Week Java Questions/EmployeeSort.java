import java.util.Comparator;

class EmployeeSort implements Comparator<EmployeeVo> {

	public int compare(EmployeeVo o1, EmployeeVo o2) {
		if (o1.incomeTax > o2.incomeTax)
			return -1;
		else
			return 1;
		// return 0;
	}
}