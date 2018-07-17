public class Student {
	String name;
	int marks1, marks2, marks3;
	double totalMarks;
	double result;
	char grade;
	boolean isPass = false;
	public Student(String name, int marks1, int marks2, int marks3, char grade) {
		super();
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.grade = grade;
	}
	
	public void calcResult() {
		this.result = (this.marks1 + this.marks2 + this.marks3) / 3;
		if(result >= 35)
			isPass = true;
	}
	
	public void display() {
		
	}
}
