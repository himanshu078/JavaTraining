package polymorphismConcepts;


public class Test_polymorphism  {

	public static void main(String []args)
	{

		StudentsDetails John = new StudentsDetails();
		
	//	compile time polymorphism (static polymorphism)
		CoursesPoly course = new CoursesPoly();
		
		John.setTeacherName("Himanshu");
		course.setInstructorName("Rajan");
		
		
	
		// without overloading - need 2 methods to get the name
		John.firstAndLastName("Sachin ", "Tendulkar");
		John.fullNameWithMiddleName("Sachin ", "Ramesh ","Tendulkar");
		John.fullNameWithSuffix("Sachin ", "Tendulkar ","Jr.");
		
	
		// Method Overloading
		
//		John.fullName("Steve ", "Smith");
//		John.fullName("Sachin ", "Ramesh ","Tendulkar");	
//		John.fullName("Sachin ", 11 ," Tendulkar");
//		John.fullName("Sachin ", true ," Tendulkar");
		
		
		
		// Method overriding
	//	John.Testing();
	//	course.Testing(5,10);
		
		System.out.println(course.Teacher());
		
		// runtime polymorphoism - dynamic polymorphism
		StudentsDetails sd = new CoursesPoly();
		
		sd.setTownOfResidence("Test");
		System.out.println(sd.Teacher());
		
		
		
	}

}
