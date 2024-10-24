package manytomany;

public class Course
{
	
	    private String courseCode;
	    private String title;
	    private String description;
	    private int capacity;
	    private String schedule;
	    private int enrolledStudents;

	    public Course(String courseCode, String title, String description, int capacity, String schedule) {
	        this.courseCode = courseCode;
	        this.title = title;
	        this.description = description;
	        this.capacity = capacity;
	        this.schedule = schedule;
	        this.enrolledStudents = 0;
	    }

	    public String getCourseCode() {
	        return courseCode;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public String getSchedule() {
	        return schedule;
	    }

	    public int getCapacity() {
	        return capacity;
	    }

	    public int getAvailableSlots() {
	        return capacity - enrolledStudents;
	    }

	    public boolean enrollStudent() {
	        if (enrolledStudents < capacity) {
	            enrolledStudents++;
	            return true;
	        }
	        return false;
	    }

	    public void dropStudent() {
	        if (enrolledStudents > 0) {
	            enrolledStudents--;
	        }
	    }

	    @Override
	    public String toString() {
	        return courseCode + ": " + title + " (" + description + "), Capacity: " + capacity +
	                ", Schedule: " + schedule + ", Available Slots: " + getAvailableSlots();
	    }
	}


