
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Furkan Emre");
		student.setLastName("Çakıroğlu");
		student.setStudentNumber(12345);
		
		System.out.println("Student name:" + " " + student.getFirstName() + " " + student.getLastName() + " , " +
							"Student number:" + " " + student.getStudentNumber());
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(new CourseLogger());
		instructorManager.addEmail(new DatabaseLogger());
		
		StudentManager studentManager = new StudentManager();
		studentManager.addEmail(new DatabaseLogger());
		studentManager.registerCourse(new RegisterLogger());
	}

}
