package javaBasics;

public class TestMethods {
	
	static BasicCalculator basic = new BasicCalculator();
	static BasicCalculator basic1 = new BasicCalculator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 40; int y = 21;
		double z = x/y; 
		
		// Behavior of an object
		basic.info(); // method without argument
		basic.addition(x, y); // passing argument to a method
		basic.addition(100, 200);
		basic.division(x, y);
		basic.substraction(x, y);
		basic.multiply(x, y);
		basic.z = 5;
		basic.multiply(basic.z , y);
		
		// Identity of an object
		System.out.println(basic);
		System.out.println(basic1);
	}

}
