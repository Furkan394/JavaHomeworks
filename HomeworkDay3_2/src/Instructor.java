
public class Instructor extends User {
	
	private int instructorNumber;
	
	public Instructor() {
		
	}

	public Instructor(int instructorNumber) {
		super();
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
