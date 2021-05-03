
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,
					"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
					"(C# + ANGULAR)", "Engin Demiro�", 36);
		Course course2 = new Course(2,
					"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
					"(JAVA + REACT)", "Engin Demiro�", 72);
		Course course3 = new Course(3,
					"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
					"Programlamaya Giri� i�in Temel Kurs",
					"Engin Demiro�", 0);
			
		Course[] courses = {course1, course2, course3};
		
		for(Course course : courses) {
			System.out.println(course.name + " " + course.detail + " " 
						+ course.instructor + " " + course.progression);
		}
		
		Category category1 = new Category(1,"Programlama (3)");
		Category[] categories = {category1};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		Instructor instructor1 = new Instructor(1,"Engin Demiro�");
		Instructor[] instructors = {instructor1};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		courseManager.deleteCourse(course3);
		
		
	}	
}