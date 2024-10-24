package manytomany;

import java.util.ArrayList;
import java.util.List;

public class Student 
{
	private String studentId;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentId, String name)
    {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public boolean registerCourse(Course course) {
        if (registeredCourses.size() < 5 && course.enrollStudent()) { // Assuming max 5 courses per student
            registeredCourses.add(course);
            return true;
        }
        return false;
    }

    public boolean dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.dropStudent();
            return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return "Student ID: " + studentId + ", Name: " + name;
    }

	
	    
}



