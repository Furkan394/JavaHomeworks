
public class InstructorManager extends UserManager{
	
	public void addCourse(Logger logger) {
		System.out.println("The course is added");
		logger.log();
	}
	public void deleteCourse(Logger logger) {
		System.out.println("The course is deleted");
		logger.log();
	}
	public void updateCourse(Logger logger) {
		System.out.println("The course is updated");
		logger.log();
	}
	public void addHomework(Logger logger) {
		System.out.println("The homework is added");
		logger.log();
	}
}
