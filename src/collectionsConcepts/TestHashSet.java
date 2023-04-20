package collectionsConcepts;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    //BMW added twice but printed once
	    System.out.println(cars + "  " + "Size is: " + cars.size());
	    
	    System.out.println(cars.contains("BMW"));
	    
	    
	    /* cannot get index of element directly in a set for that need to convert
	    // Convert LinkedHashSet to ArrayList
	     * 
	     */
        ArrayList<String> elements = new ArrayList<>(cars);
        
        for (String x: elements) {
        	System.out.println("index of " + x+ ": " + elements.indexOf(x));
        }
        
       
        
	    
	    /*
	    cars.remove("BMW");
	    System.out.println(cars + "  " + "Size is: " + cars.size());
	    
	   cars.clear();
	    System.out.println(cars + "  " + "Size is: " + cars.size());
	    
	    */
	    
	    for (String i : cars) {
	    	  System.out.println(i);
	    	}
	    
	    
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);

	    // Show which numbers between 1 and 10 are in the set
	    for(int i = 1; i <= 10; i++) {
	      if(numbers.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	      }
	    }
	    
	}

}
