package manytomany;

public class StudentRegistration {

	private Courselisting courseListing;

	public StudentRegistration(Courselisting courseListing) 
	{
		this.courseListing = courseListing;
	}

	public boolean registerStudentForCourse(Student student, String courseCode)
	{
		Course course = courseListing.findCourseByCode(courseCode);
		if (course != null && student.registerCourse(course))
		{
			System.out.println("Student " + student.getName() + " registered for course: " + course.getTitle());
			return true;
		}
		System.out.println("Registration failed for course: " + courseCode);
		return false;
	}

	public boolean removeStudentFromCourse(Student student, String courseCode) 
	{
		Course course = courseListing.findCourseByCode(courseCode);
		if (course != null && student.dropCourse(course)) 
		{
			System.out.println("Student " + student.getName() + " dropped course: " + course.getTitle());
			return true;
		}
		System.out.println("Failed to drop course: " + courseCode);
		return false;
	}
}
