package javaBasics;

public class BasicCalculator {
	
	 static int z = 10;
	 final static int i = 100;
	 

	public int addition(int a, int b) {

		int add = a + b;
		System.out.println("Addition is " + add);
		return add;
	}
	
	
	public int substraction(int a, int b) {

		int diff = a - b;
		System.out.println("Difference is " + diff);
		return diff;
	}
	
	public int multiply(int a, int b) {

		int mult = a * b;
		System.out.println("Product is " + mult);
		return mult;
	}
	
	public int division(int a, int b) {

		int div = a / b;
		System.out.println("Division is " + div);
		return div;
	}
	
	static public void printMultipleTimes(int a, String toBePrinted) {
		
		
		for (int i=0; i<a; i++) {
			System.out.println(toBePrinted);
		}
	}
	public void info() {

		System.out.println("This is the basic calculator");
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("value of Z is " + z);
//		System.out.println("value of i is " + i);
//		addition(5,3);	
//		
//	}

}
