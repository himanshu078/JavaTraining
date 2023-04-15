package inheritanceConcepts;


public class Courses extends Students {

	private String courseName; 
	private String instructorName;
	private int availableSeats;
	private boolean enrollmentCompleted;
	

	
	public String getCourseName() {
		return courseName ;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public boolean isEnrollmentCompleted() {
		return enrollmentCompleted;
	}
	public void setEnrollmentCompleted(boolean enrollmentCompleted) {
		this.enrollmentCompleted = enrollmentCompleted;
	}
	
	public void testsuper() {
		System.out.println("This is in child class");
		super.testsuper();
	}
	


}
