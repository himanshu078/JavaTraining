package javaBasics;

public class Operators {

	public static void main(String[] args) {

		int x = 40; int y = 21;
		double z = x/y; 
				//Arithmetic operators
				
				System.out.println("Addition is " + (x+y));
				System.out.println("Substraction is " + (x-y));
				System.out.println("Division is " + (x/y));
				System.out.println("Multiplication is " + (x*y));
				System.out.println("Modulus is " + (x%y));
				System.out.println("Increment is " + (++y));
				System.out.println("Decrement is " + (--x));
				
				//assignment  operators
				System.out.println("increment " + (x += 3));
				System.out.println("decrement " + (x -= 3));
				System.out.println("Multiplication " + (x *= 3));
				System.out.println("Division " + (x /= 3));
				System.out.println("Modulus " + (x %= 3));
				
				//Comparison  operators
				
				System.out.println(" x & y are Equal to  - " + (x == y));
				System.out.println(" x & y are Not equal  - " + (x != y));
				System.out.println(" x & y are Greater than  - " + (x > y));
				System.out.println(" x & y are Lesser than - " + (x < y));
				System.out.println(" x & y are Lesser than or equal to  - " + (x <= y));
				System.out.println(" x & y are Greater than or equal to  - " + (x >= y));
				
				//Logical  operators
				System.out.println(" Logical and  - " + (x>10 && x<50));// Returns true if both statements are true
				System.out.println(" Logical and  - " + (x>10 && x<30));
				System.out.println(" Logical or - " + (x<20 || y<10)); // Returns true if one of the statements is true
				System.out.println(" Logical not - " + !(x>40 && y>10)); // Reverse the result, returns false if the result is true
				

	}

}
