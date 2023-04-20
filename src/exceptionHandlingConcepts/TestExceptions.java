package exceptionHandlingConcepts;

import java.io.*;

public class TestExceptions {

	public static void main(String[] args) throws IOException {

		// using try alone - 
		//	testTryblock();

		System.out.println("----------------try catch--------------------");
		// using try - catch
		testTryCatch();
		System.out.println("----------------try catch finally--------------------");
		testTryCatchFinally();

		
		System.out.println("----------------multiple Catch Blocks specific exception--------------------");
		// but at any time only one exception will occur
		multipleCatchBlocksArithmetic();
		multipleCatchBlocksArray();
		multipleCatchBlocksNull();
		System.out.println("----------------multiple Catch Blocks parent Exception--------------------");
		multipleCatchBlocksParent();
		System.out.println("----------------Test Throw--------------------");
		testThrow(25);
		testThrow(15);
		testThrow(20);
		System.out.println("----------------checked Exception with Throws--------------------");
		//	testCheckedExceptionWithThrows();
		//	testCheckedExceptionTryCatch();

	}


	public static void testTryblock() {

		System.out.println("Program started......");
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[10]); // ArrayIndexOutOfBoundsException
		System.out.println("code after exception occured......");
		System.out.println(); 

	}

	public static void testTryCatch() {

		System.out.println("Program started......");
		try {
			//	int data=100/0; // Unchecked - Arithmetic exception

			//	String s=null;  
			//	System.out.println(s.length());//Unchecked - NullPointerException  

			String x="abc";  
			int i=Integer.parseInt(x);//Unchecked - NumberFormatException 

			//	PrintWriter pw = new PrintWriter("jtp.txt"); //may throw exception   
			//   pw.println("saved");  

		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		}
		System.out.println("code after exception occured......");
		System.out.println(); 

	}

	public static void testTryCatchFinally() {

		System.out.println("Program started......");
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
		System.out.println("code after exception occured......");
		System.out.println(); 

	}

	public static void testCheckedExceptionWithThrows() throws IOException {

		System.out.println("Program started......");

		FileReader file = new FileReader("C:\\test\\a.txt");
		//FileReader file = new FileReader("C:\\Users\\Swati\\Desktop\\Automation\\testing.txt");


		// Creating object as one of ways of taking input
		BufferedReader fileInput = new BufferedReader(file);

		// Printing first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());
		fileInput.close();
		System.out.println("code after exception occured......");
		System.out.println(); 

	}

	public static void testCheckedExceptionTryCatch() {

		System.out.println("Program started......");

		FileReader file = null;
		BufferedReader fileInput = null;
		try {
			file = new FileReader("C:\\test\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fileInput = new BufferedReader(file);
		}


		for (int counter = 0; counter < 3; counter++)
			try {
				System.out.println(fileInput.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					fileInput.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		System.out.println("code after exception occured......");
		System.out.println(); 

	}

	public static void multipleCatchBlocksArithmetic() {

		try{    
			int a[]=new int[5];    
			a[5]=30/0;    
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs  "  + e);  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs  "  + e);  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs  " + e);  
		}             
		System.out.println("code after exception occured......");  
		System.out.println(); 
	}

	public static void multipleCatchBlocksArray() {

		try{    
			int a[]=new int[5];    
			System.out.println(a[10]);      
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs  "  + e);  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs  " + e);  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs  " + e);  
		}             
		System.out.println("code after exception occured......");  
		System.out.println(); 
	}

	public static void multipleCatchBlocksNull() {

		try{    
			String s=null;  
			System.out.println(s.length());        
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs  "  + e);  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs  " + e);  
		}   
		catch(NullPointerException e)  
		{  
			System.out.println("Null Pointer Exception occurs  " + e);  
		}
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs  " + e);  
		}             
		System.out.println("code after exception occured......");  
		System.out.println(); 
	}


	public static void multipleCatchBlocksParent() {

		try{    
			String s=null;  
			System.out.println(s.length());        
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs  "  + e);  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs  " + e);  
		}   
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs  " + e);  
		}             
		System.out.println("code after exception occured......");   
		System.out.println(); 
	}
	
	public static void testThrow(int age) {
		
		if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old. Current age is " + age);
		    }
		    else {
		      System.out.println("Access granted - You are old enough!  Age is " + age);
		    }
		
		System.out.println();
	}


}



