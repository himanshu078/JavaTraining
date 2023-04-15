package javaBasics;

public class TestArrays {

	public static void main(String[] args) {
		
		//Single dimensional array
		//declaration, instantiation and initialization 
		// int array
		// while creating array show in excel the positions 
		int[] myNum = {10, 20, 30, 40};
	//	int[] myNum1 = {10, 20, 30, 40, 12.32};
	//	int[] myNum2 = {10, 20, 30, 40, "50"};
		//String array
		String names[] = {"Tom", "Jerry", "Alladin", "Robocop"};
		
		// boolean array, char array, double array
		
		//static array - size is fixed  -> to overcome use collections
		// should have same data type -> to overcome use object array
		//declaration and instantiation 
		int a[]=new int[5]; 
		//initialization 
		a[0]=10; 
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
	//	a[5]=60;
		
		// for each - advanced type of for loop
		for(int i:a)  
			System.out.println(i);  
		
		int size = a.length;
		System.out.println(size);
		System.out.println("===========================================");
		
		for (int x=0; x<size; x++) {
			System.out.println(a[x]);
		}
			
		System.out.println("===========================================");
		//multidimensional array
		int[][] myArray = new int[3][4];

		myArray[0][0] = 1;
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		myArray[0][3] = 4;

		myArray[1][0] = 5;
		myArray[1][1] = 6;
		myArray[1][2] = 7;
		myArray[1][3] = 8;

		myArray[2][0] = 9;
		myArray[2][1] = 10;
		myArray[2][2] = 11;
		myArray[2][3] = 12;
		
		// size of 2D array
		int rows = myArray.length;
		int columns = myArray[0].length;
		int size1 = rows * columns;

		System.out.println("Rows: " + rows);
		System.out.println("Columns: " + columns);
		System.out.println("Size: " + size1);
			
		for(int i=0;i<rows;i++){  
			 for(int j=0;j<columns;j++){  
			   System.out.print(myArray[i][j]+" ");  
			 }  
			 System.out.println();  
			}  
		System.out.println("===========================================");
		// Object Array - Object is a class - used to store different data types
		
		Object ob[] = new Object[5];
		ob[0]= 1;
		ob[1]= "Tom";
		ob[2]= 12.23;
		ob[3]= true;
		ob[4]= "M";
		
		
		
		System.out.println(ob.length);	
		System.out.println(ob[2]);
		System.out.println("===========================================");
		// storing variables in a array
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		int a5 = 5;
		
		int test[]=new int[5];
		int[] myNum4 = {a1, a2, a3, a4, a5};
		
		for(int i:myNum4)  
			System.out.println(i);
		
		
		// cloning array
		String Orignames[] = {"Tom", "Jerry", "Alladin", "Robocop"};
		
		String CloneNames[] = Orignames.clone();
		
		for(String i:Orignames)  
			System.out.println(Orignames == CloneNames);
		
		//Jagged Array -it is an array of arrays with different number of columns.
		System.out.println("===========================================");
		 int arr[][] = new int[3][];  
	        arr[0] = new int[3];  
	        arr[1] = new int[4];  
	        arr[2] = new int[2];  
	        //initializing a jagged array  
	        int count = 0;  
	        for (int i=0; i<arr.length; i++)  
	            for(int j=0; j<arr[i].length; j++)  
	                arr[i][j] = count++;  
	   
	        //printing the data of a jagged array   
	        for (int i=0; i<arr.length; i++){  
	            for (int j=0; j<arr[i].length; j++){  
	                System.out.print(arr[i][j]+" ");  
	            }  
	            System.out.println();//new line  
	        }  

	}

}
