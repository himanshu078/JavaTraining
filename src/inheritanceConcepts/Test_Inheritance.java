package inheritanceConcepts;

public class Test_Inheritance  {

	public static void main(String []args)
	{

		Students John = new Students();		
		
		// Single Inheritance
		
		Courses Agile = new Courses();
		
		// From courses class - Child class
		Agile.setCourseName("Agile");
		Agile.setEnrollmentCompleted(false);
		Agile.setAvailableSeats(20);
		Agile.setFname("John");
		Agile.setInstructorName("Alex");
		Agile.setCourseName("Python");
		
		System.out.println("===================");
		Agile.testsuper();
		System.out.println("===================");
		System.out.println("Inheritance");
		System.out.println(Agile.getFname());
		System.out.println(Agile.getCourseName());
		System.out.println(Agile.isEnrollmentCompleted());
		System.out.println(Agile.getAvailableSeats());
		System.out.println(Agile.getInstructorName());
	    System.out.println(John.getCourseEnrolled());

		
		
		
		// Multilevel inheritance 
		
		CourseDetails details = new CourseDetails();
		
		//From courseDetails class - Grandchild class to StudentsDetails class and child class to courseDetails class
		details.setCourseHours(32);
		details.setCourseTopics("JIRA Fundamentals");
		// From courses class - Child class
		details.setCourseName("Agile");
		details.setInstructorName("Rajan");
		// From StudentsDetails class - Parent class
		details.setFname("John");
		
//		System.out.println(details.getCourseHours());
//		System.out.println(details.getCourseTopics());
//		System.out.println(details.getCourseName());
//		System.out.println(details.getFname());
		
		
		// Hierarchical inheritance - When two or more classes inherits a single class,
		Exams exam = new Exams();
		exam.setPassingMarks(40);
		exam.setCourseName("Database");
//		System.out.println(exam.getPassingMarks());
//		System.out.println(exam.getCourseName());
		
	}

}
