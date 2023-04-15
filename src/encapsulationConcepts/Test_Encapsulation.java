package encapsulationConcepts;


public class Test_Encapsulation  {

	public static void main(String []args)
	{

		StudentsEncap John = new StudentsEncap();
		
		John.setFname("Rajan");
		John.setFname("John");
		John.setMname("NA");
		John.setLname("Doe");
		John.setRollNum(1);
		John.setTownOfResidence("Mississauga");
		John.setLearningJava(true);
		John.setCourseEnrolled("Java");
	//	John.CourseStudying();\
	
		
		System.out.println(John.getFname());
		System.out.println(John.getMname());
		System.out.println(John.getLname());
		System.out.println(John.getRollNum());
		System.out.println(John.getTownOfResidence());
		System.out.println(John.isLearningJava());
		System.out.println(John.getCourseEnrolled());
		System.out.println();
		
		
		John.setMname("Matthew");
		System.out.println(John.getFname());
		System.out.println(John.getMname());
		System.out.println(John.getLname());
		System.out.println(John.getRollNum());
		System.out.println(John.getTownOfResidence());
		System.out.println(John.isLearningJava());
		System.out.println(John.getCourseEnrolled());
		
		// when need to add a common data to a variable
//		Sam.setFname("Sam");
//		Sam.addName(" 123 ");
//		John.addName(" 123 ");
//		System.out.println(Sam.getFname());
//		System.out.println(John.getFname());
		
		
	}

}
