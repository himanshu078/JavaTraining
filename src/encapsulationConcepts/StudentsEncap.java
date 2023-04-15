package encapsulationConcepts;

public class StudentsEncap { //extends Object {


	private String fname; // member variable is for object
	private String lname;
	private String mname;
	private int rollNum;
	private String townOfResidence;
	private boolean learningJava;
	private String courseEnrolled;
	private String teacherName;
	
	public StudentsEncap() {
		//System.out.println("This is Student class");
	}
	
//	StudentsDetails(boolean learningJava, String courseEnrolled) {
//		//System.out.println("This is Student class");
//		this.learningJava = learningJava;
//		this.courseEnrolled = courseEnrolled;
//	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {  // local variable
		
		this.fname = fname;
	//	System.out.println("from the set method - " + fname); // this is the name we are setting in the main method
	//	System.out.println("default value - " + this.fname); // dthis.fname - is the default value. default initialization for string is null and int is 0
		
		if (fname.equals("NA")) { // can add logic if we need to contol the data flowing in
			this.fname = fname;
		}
		
		
//		System.out.println("again - " +fname);
//		System.out.println("this one again - " + this.fname);
	}
	
	public void addName(String name) {
		this.fname = this.fname.concat(name);
		
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getTownOfResidence() {
		return townOfResidence;
	}

	public void setTownOfResidence(String townOfResidence) {
		this.townOfResidence = townOfResidence;
	}


	public boolean isLearningJava() {
		return learningJava;
	}

	public void setLearningJava(boolean learningJava) {
		this.learningJava = learningJava;
	}


	public String getCourseEnrolled() {
		//return "Test";
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void CourseStudying() {
		System.out.println(getCourseEnrolled());
	}
	
	// Polymorphism
	// Method Overloading
	
	public  String fullName(String fname, String lname) {
		String fullName = fname + lname;
		return fullName;	
	}
	// changed no.of arguments
	public  String fullName(String fname, String mname, String lname) {
		String fullName = fname + mname + lname;
		return fullName;	
	}
	// changed data type
	public  String fullName(String fname, int mname, String lname) {
		String fullName = fname + mname + lname;
		return fullName;	
	}
	
	public  String fullName(String fname, boolean learningJava, String lname) {
		String fullName = fname + learningJava + lname;
		return fullName;	
	}
	
	
	// method overriding
	public String Teacher() {
	//	return getTeacherName();
		return "Parent Teacher " + getTeacherName();
		
	}
	
	
	
	
}

