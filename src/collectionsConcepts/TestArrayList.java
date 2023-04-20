package collectionsConcepts;

import java.util.*;

import javaBasics.StudentDetails;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();// non generic arraylist
		
		//generic arraylist
		ArrayList<String> stringList=new ArrayList<String>();//Creating arraylist 
		ArrayList<Integer> intList=new ArrayList<Integer>();
	//	ArrayList<E> List=new ArrayList<E>(); -- if we don't know what type of data will be stored in the list
		
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		System.out.println(stringList.size());
		System.out.println(stringList);
		System.out.println(stringList.toArray().length);
		
		//using for each for array list
		for(String num:stringList)    
		    System.out.println(num);  
		
		System.out.println("=============================================");
		// Sorting of list
		Collections.sort(stringList); 
		for(String num:stringList)    
			System.out.println(num);
		
		// reverse sort of list
		System.out.println("=============================================");
		Collections.reverse(stringList); 
		for(String num:stringList)    
			System.out.println(num);
	
		// add element at a specific position
		stringList.add(4, "four");
		System.out.println(stringList);
		
		System.out.println("=============================================");
		System.out.println("index " + stringList.indexOf("one")); // to get index of elements in the list
		System.out.println("index " + stringList.indexOf("five")); // to chgeck the index of element not found in the list
		
		System.out.println("last index " + stringList.lastIndexOf("one"));
		// to calculate frequency of element
		System.out.println("frequency " + Collections.frequency(stringList, "one"));
		
		// to get sublist
		List<String> stringSubList= new ArrayList<String>();
		stringSubList = stringList.subList(0, 4);
		System.out.println("sublist " + stringSubList + " sublist size " + stringSubList.size());
		
		
		// list of objects
		// store user defiled class objects in arraylist
		StudentDetailsCollections sd1 = new StudentDetailsCollections("fname1","lname1", 1, "townOfResidence1", true);
		StudentDetailsCollections sd2 = new StudentDetailsCollections("fname2","lname2", 2, "townOfResidenc2", false);
		StudentDetailsCollections sd3 = new StudentDetailsCollections("fname3","lname3", 3, "townOfResidenc3", true);
		
		ArrayList<StudentDetailsCollections> StudentList=new ArrayList<StudentDetailsCollections>();
		
		StudentList.add(sd1);
		StudentList.add(sd2);
		StudentList.add(sd3);
		
		for(StudentDetailsCollections b:StudentList){  
	        System.out.println(b.fname+" "+b.lname+" "+b.rollNum+" "+b.townOfResidence+" "+b.learningJava);  
	    }  
		
		System.out.println("========================================");
		System.out.println(StudentList.size());
		// iterator to loop through
		
		Iterator<StudentDetailsCollections> it = StudentList.iterator();
		
		while(it.hasNext()) {
			
			StudentDetailsCollections st = it.next();
			System.out.println(st.fname);
			System.out.println(st.lname);
			System.out.println(st.rollNum);
			System.out.println(st.townOfResidence);
			System.out.println(st.learningJava);
			System.out.println("=====================");
			
		}
		
		
		
	//	adding all elements of one list to another.  use addall()
		ArrayList<String> stringList2=new ArrayList<String>();
		
		stringList2.add("four");
		stringList2.add("five");
		stringList2.add("six");
		stringList2.add("one");
		stringList2.add("two");
		
		System.out.println(stringList.size());
		System.out.println(stringList2.size());
		
	//	stringList.addAll(stringList2); // to add all members from another list
		System.out.println("=================================");
		System.out.println(stringList.size());
		System.out.println(stringList2.size());
		stringList.removeAll(stringList2); // to remove all members from another list, will also remove the duplicate ones
		System.out.println("=================================");
		System.out.println(stringList.size());
		System.out.println(stringList2.size());
		
		//retainAll - to check the common methods between 2 list
		stringList.retainAll(stringList2);
		System.out.println(stringList);
		

	}

}
