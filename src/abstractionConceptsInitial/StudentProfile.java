package abstractionConceptsInitial;

public class StudentProfile implements CourseDetails , StudentDetails {

	public static void main(String args[]) {

		StudentProfile sp = new StudentProfile();
		//	sp.courseName("JAVA");

		System.out.println(sp.courseName("PYTHON"));
		System.out.println(sp.InstructorName("Himanshu"));
		System.out.println(sp.couseDuration(40));
		System.out.println(sp.residence("Milton"));
		sp.studentName("Baljeet");
		sp.rollNumber(12345);
		sp.courseLearning("JAVA");
		
		System.out.println();

	}





	public void studentName(String name) {
		System.out.println(name);

	}

	public void rollNumber(int roll) {
		System.out.println(roll);

	}

	public void courseLearning(String Course){
		System.out.println(Course);

	}


	public String courseName(String name) {

		return name;

	}


	public String InstructorName(String name1) {
		return name1;
	}


	public int couseDuration(int duration) {

		return duration;
	}

	public String residence(String city) {
		return city;
	}



}


