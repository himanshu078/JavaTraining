package polymorphismConcepts;


public class CoursesPoly extends StudentsDetails{

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

	//when parameters are different in the same method which is in parent and child class
	public void Testing(int a, int b) {
		System.out.println("This method is in Course Poly" + (a+b));

	}
	
	// when parameters are same in the same method which is in parent and child class
	public String Teacher() {
		//	return getTeacherName();
			System.out.println("This method is in Course Details");
			return "Child Teacher " + getInstructorName();
			
		}

}


