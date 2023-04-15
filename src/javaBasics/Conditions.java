package javaBasics;

public class Conditions {

	public static void main(String[] args) {

//only have one if-else statement
		
		//		int marks = 41;
		//		
		//		if (marks> 40) {
		//			System.out.println("Result is : " + "Pass");
		//		}
		//		
		//		else {
		//			System.out.println("Result is : " + "Fail");
		//		}

		//have multiple if, else if statements
		int studentMarks = 89;

		if (studentMarks< 40) {
			System.out.println("Grade is : " + "F");
		}

		else if (studentMarks>= 40 && studentMarks<=50){
			System.out.println("Grade is : " + "E");
		}
		else if (studentMarks> 50 && studentMarks<=60){
			System.out.println("Grade is : " + "D");
		}
		else if (studentMarks> 60 && studentMarks<=70){
			System.out.println("Grade is : " + "C");
		}
		else if (studentMarks> 70 && studentMarks<=80){
			System.out.println("Grade is : " + "B");
		}
		else if (studentMarks> 80 && studentMarks<=100){
			System.out.println("Grade is : " + "A");
		}
		else {
			System.out.println("Invalid input. Enter a valid number");
		}

//		checkGradeUsingIfElse(75);
//		checkGradeUsingIfElse(45);
//		checkGradeUsingIfElse(23);
//		checkGradeUsingIfElse(90);
//		checkGradeUsingIfElse(-1);
		
		// use of Switch statement
//		int day = 0;
//		switch (day) {
//		  case 1:
//		    System.out.println("Monday");
//		    break;
//		  case 2:
//		    System.out.println("Tuesday");
//		    break;
//		  case 3:
//		    System.out.println("Wednesday");
//		    break;
//		  case 4:
//		    System.out.println("Thursday");
//		    break;
//		  case 5:
//		    System.out.println("Friday");
//		    break;
//		  case 6:
//		    System.out.println("Saturday");
//		    break;
//		  case 7:
//		    System.out.println("Sunday");
//		    break;
//		  default:
//		    System.out.println("Looking forward to the Weekend");
//		}
		
		checkdayOfTheWeekUsingSwitch(0);
		checkdayOfTheWeekUsingSwitch(1);
		checkdayOfTheWeekUsingSwitch(4);
		checkdayOfTheWeekUsingSwitch(7);
		checkdayOfTheWeekUsingSwitch(8);


	}

	public static void checkGradeUsingIfElse(int studentMarks) {


		if (studentMarks >= 0 && studentMarks< 40) {
			System.out.println("Grade is : " + "F");
		}

		else if (studentMarks>= 40 && studentMarks<=50){
			System.out.println("Grade is : " + "E");
		}
		else if (studentMarks> 50 && studentMarks<=60){
			System.out.println("Grade is : " + "D");
		}
		else if (studentMarks> 60 && studentMarks<=70){
			System.out.println("Grade is : " + "C");
		}
		else if (studentMarks> 70 && studentMarks<=80){
			System.out.println("Grade is : " + "B");
		}
		else if (studentMarks> 80 && studentMarks<=100){
			System.out.println("Grade is : " + "A");
		}
		else {
			System.out.println("Invalid input. Enter a valid number");
		}

	}
	
	public static void checkdayOfTheWeekUsingSwitch(int dayOfTheWeek) {
		
		switch (dayOfTheWeek) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
	}

}
