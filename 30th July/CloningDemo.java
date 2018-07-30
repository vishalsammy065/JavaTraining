class Student implements Cloneable {
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloningDemo {

	public static void main(String[] args) {
		Student s = new Student(101, "Vishal");
		System.out.println(s+" and info is : "+s.name+" "+s.roll);
		try {
			Student s2 = (Student) s.clone();
			System.out.println(s2+" and info is : "+s.name+" "+s.roll);
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone not supported!");
		}
	}

}
