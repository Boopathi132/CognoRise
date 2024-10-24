package manytomany;

public class CourseManagementApp 
{
	
	    public static void main(String[] args)
	    {
	        
	        Course course1 = new Course("CS101", "Introduction to Computer Science", "Basics of programming", 30, "Mon 10-12");
	        Course course2 = new Course("MATH101", "Calculus I", "Introduction to Calculus", 25, "Tue 2-4");

	       
	        Courselisting courseListing = new Courselisting();
	        courseListing.addCourse(course1);
	        courseListing.addCourse(course2);

	      
	        courseListing.displayAvailableCourses();

	        Student student1 = new Student("S001", "John Doe");

	        
	        StudentRegistration registration = new StudentRegistration(courseListing);
	        registration.registerStudentForCourse(student1, "CS101");

	        
	        registration.removeStudentFromCourse(student1, "CS101");
	    }
	}



