package inheritanceConcepts;

public class Students { //extends Object {


	private String fname; // member variable is for object
	private String lname;
	private String mname;
	private int rollNum;
	private String townOfResidence;
	private boolean learningJava;
	private String courseEnrolled;
	private String teacherName;
	
	Students() {
		System.out.println("This is Student class");
	}
	
	Students(boolean learningJava, String courseEnrolled) {
		this.learningJava = learningJava;
		this.courseEnrolled = courseEnrolled;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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
	
	public void testsuper() {
		System.out.println("This is in parent class");
	}

	
	
}

