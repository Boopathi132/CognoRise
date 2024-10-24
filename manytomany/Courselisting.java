package manytomany;

import java.util.ArrayList;
import java.util.List;

public class Courselisting 
{
	
	    private List<Course> courses;

	    public Courselisting() {
	        courses = new ArrayList<>();
	    }

	    public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public void displayAvailableCourses() {
	        for (Course course : courses) {
	            System.out.println(course);
	        }
	    }

	    public Course findCourseByCode(String courseCode) {
	        for (Course course : courses) {
	            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
	                return course;
	            }
	        }
	        return null;
	    }
	}



