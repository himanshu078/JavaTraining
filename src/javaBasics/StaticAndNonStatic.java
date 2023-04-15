package javaBasics;

public class StaticAndNonStatic {

	String name = "Himanshu"; // not static global variable
	static int age =10; //  static global variable
	
	// scope of global variable is across all the methods
	
	static StaticAndNonStatic obj = new StaticAndNonStatic();

	public static void main(String[] args) {
		
		 StaticAndNonStatic obj1 = new StaticAndNonStatic();

		//direct calling
		TestMethod1();
		System.out.println(age);
		//call by class name
		StaticAndNonStatic.TestMethod1();
		System.out.println(StaticAndNonStatic.age);
		
		
		obj1.TestMethod();
		obj1.name = "10";
		


	}

	public void TestMethod() {

		System.out.println("This is a non static method");
	}

	static public void TestMethod1() {

		System.out.println("This is a static method");
	}

}
