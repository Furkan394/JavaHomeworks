
public class Student extends User {
	
	private int studentNumber;

	public Student() {
		
	}
	
	public Student(int studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
