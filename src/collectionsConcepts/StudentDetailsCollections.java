package collectionsConcepts;

public class StudentDetailsCollections {


	String fname;
	String lname;
	String mname;
	int rollNum;
	String townOfResidence;
	boolean learningJava;
	


	//constructor without argument
	public StudentDetailsCollections() {
		townOfResidence = "Mississauga";
		System.out.println("This is a default constructor");
	}


	//constructor with 1 argument
	public StudentDetailsCollections(String lname) {
		this.lname = lname;
		System.out.println("This is a constructor with 1 param");
	}

	//constructor with multiple arguments
	public StudentDetailsCollections(String fname,String lname, int rollNum, String townOfResidence, boolean learningJava ) {

		this.fname = fname;
		this.lname = lname;
		this.rollNum = rollNum;
		this.townOfResidence = townOfResidence;
		this.learningJava = learningJava;
	//	System.out.println("This is a constructor with 4 param");

	}

	public void Student() {

		System.out.println();
		System.out.println("Name of Student is -  " + fname + " " + lname );
		System.out.println("Roll number of " + fname + " is " + rollNum );
		System.out.println(fname + " lives in " + townOfResidence );
		System.out.println("Interested in learning Java " + learningJava);

	}

}

