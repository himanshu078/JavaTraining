package collectionsConcepts;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Acura");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Aston Martin");
		System.out.println(cars + "  " + "Size is: " + cars.size());

		cars.addFirst("Toyota");
		System.out.println(cars + "  " + "Size is: " + cars.size());

		cars.addLast("Mercedes");
		System.out.println(cars + "  " + "Size is: " + cars.size());

		cars.removeFirst();
		System.out.println(cars + "  " + "Size is: " + cars.size());

		cars.removeLast();
		System.out.println(cars + "  " + "Size is: " + cars.size());

		System.out.println(cars.getFirst());

		System.out.println(cars.getLast());

		// remove the first element
		//	cars.remove();
		System.out.println(cars + "  " + "Size is: " + cars.size());

		//	cars.removeAll(cars);
		//	System.out.println(cars + "  " + "Size is: " + cars.size());

		System.out.println(cars.contains("BMW"));

		//using for each for array list
		for(String car:cars)    
			System.out.println(car); 

		System.out.println("=============================================");

		// Sorting of list
		Collections.sort(cars); 
		for(String car:cars)    
			System.out.println(car);

	}

}
