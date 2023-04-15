package javaBasics;

public class LearnConstructors  {
	
	public static void main(String []args)
    {
		// object of the class is created
			StudentDetails John = new StudentDetails();
		
			John.fname = "John";
			John.lname = "Doe";
			John.rollNum = 1;
		//	John.townOfResidence = "Mississauga";
			John.learningJava = true;
			John.Student();
		
		
		StudentDetails Rajan = new StudentDetails();
		Rajan.fname = "Rajan";
		Rajan.lname = "Agarwal";
		Rajan.rollNum = 6;
		//Rajan.townOfResidence = "Brampton";
		Rajan.learningJava = true;
		Rajan.Student();
		
		// To test constructor without parameter
		StudentDetails Sachin = new StudentDetails();
		Sachin.fname = "Sachin";
		Sachin.lname = "Tendulkar";
		Sachin.rollNum = 2;
		//Student2.townOfResidence = "Brampton";
		Sachin.learningJava = true;
		Sachin.Student();
		
		
		// Constructor overloading
		// To test constructor with one parameter
		StudentDetails Virat = new StudentDetails("Kohli");
		Virat.fname = "Virat";
//		Student3.lname = "Tendulkar";
		Virat.rollNum = 3;
		Virat.townOfResidence = "Ajax";
		Virat.learningJava = true;
		Virat.Student();
		
		// To test constructor with multiple parameters
		StudentDetails Steve = new StudentDetails("Steve", "Smith", 4, "", false );
		Steve.Student();
		
		StudentDetails Ashwin = new StudentDetails("R", "Ashwin", 5, "Hamilton", true );
		Ashwin.Student();
		
    }
	
	

}
