package javaBasics;

//This is a simple Java program. 
//Call this file "HelloWorld.java".
public class HelloWorld2 {

	
	public static void main(String []args)
    {
//		System.out.println("Hello World");
//		System.out.println("My First Java Program.");
		
		// Data Types
		String studentName = "John";
		int noOfStudents = 14;
		double gasPrice = 1.623;
		char batchname = 'A';
		boolean learningJava = false;
			
		System.out.println("Name of Student is " + studentName);
		System.out.println("noOfStudents " + noOfStudents );
		System.out.println("gasPrice is " + gasPrice );
		System.out.println("Your batchname is " + batchname);
		System.out.println("Are you learning Java " + learningJava);
		
		noOfStudents = 20;
		System.out.println("new count of students " + noOfStudents );
		
	
		// public method can be accessed by creating object for the same class
		HelloWorld2 hello = new HelloWorld2();
		//hello.printMultipleTimes(5, "Java Training");
		
		// static method can be accessed directly in a method no need for a object
	//	printMultiples(5, "Learn Java");
		
    }
	
	  public void printMultipleTimes(int a, String toBePrinted) {
			
			for (int i=0; i<a; i++) {
				System.out.println(toBePrinted);
			}
		}
	  
	 static public void printMultiples(int a, String toBePrinted) {
			
			for (int i=0; i<a; i++) {
				System.out.println(toBePrinted);
			}
		}
	
}
