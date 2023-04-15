package javaBasics;

public class Loops {
	
	static Conditions condition = new Conditions();

	public static void main(String[] args) {
			
		// For loop
		
		for (int i = 0; i < 10; i++) {
			//  System.out.println(i);
			//  condition.checkdayOfTheWeekUsingSwitch(i);
			}
		
		// while loop
		
		int i = 0;
		while (i < 5) {
		  System.out.println("Testing While loop: "+ i);
		  i++;
		}
		
		// Do while
		int j = 0;
		do {
		  System.out.println(j);
		  j++;
		}
		while (j < 5);
		
		
		// break
		for (int b = 0; b < 10; b++) {
			  if (b == 4) {
			    break;
			  }
			  System.out.println(b);
			}
		
		
		
		//continue
		for (int a = 0; a < 10; a++) {
		      if (a == 4) {
		        continue;
		      }
		      System.out.println(a);
		    } 

	}

}
