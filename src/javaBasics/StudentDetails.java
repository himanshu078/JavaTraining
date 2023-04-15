package javaBasics;

public class StudentDetails {


	String fname;
	String lname;
	String mname;
	int rollNum;
	String townOfResidence;
	boolean learningJava;
	


	//constructor without argument
	public StudentDetails() {
		townOfResidence = "Mississauga";
		System.out.println("This is a default constructor");
	}


	//constructor with 1 argument
	public StudentDetails(String lname) {
		this.lname = lname;
		System.out.println("This is a constructor with 1 param");
	}

	//constructor with multiple arguments
	public StudentDetails(String fname1,String lname1, int rollNum1, String townOfResidence1, boolean learningJava1 ) {

		fname = fname1;
		lname = lname1;
		rollNum = rollNum1;
		townOfResidence = townOfResidence1;
		learningJava = learningJava1;
		System.out.println("This is a constructor with 4 param");

	}

	public void Student() {

		System.out.println();
		System.out.println("Name of Student is -  " + fname + " " + lname );
		System.out.println("Roll number of " + fname + " is " + rollNum );
		System.out.println(fname + " lives in " + townOfResidence );
		System.out.println("Interested in learning Java " + learningJava);

	}

}

