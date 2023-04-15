package javaBasics;

import java.util.*;

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
		System.out.println(stringList.size());
		System.out.println(stringList);
		System.out.println(stringList.toArray().length);
		
		
		// list of objects
		// store user defiled class objects in arraylist
		StudentDetails sd1 = new StudentDetails("fname1","lname1", 1, "townOfResidence1", true);
		StudentDetails sd2 = new StudentDetails("fname2","lname2", 2, "townOfResidenc2", false);
		StudentDetails sd3 = new StudentDetails("fname3","lname3", 3, "townOfResidenc3", true);
		
		ArrayList<StudentDetails> StudentList=new ArrayList<StudentDetails>();
		
		StudentList.add(sd1);
		StudentList.add(sd2);
		StudentList.add(sd3);
		
		System.out.println(StudentList.size());
		// iterator to loop through
		
		Iterator<StudentDetails> it = StudentList.iterator();
		
		while(it.hasNext()) {
			
			StudentDetails st = it.next();
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
	//	stringList.removeAll(stringList2); // to remove all members from another list, will also remove the duplicate ones
		System.out.println("=================================");
		System.out.println(stringList.size());
		System.out.println(stringList2.size());
		
		//retainAll - to check the common methods between 2 list
		stringList.retainAll(stringList2);
		System.out.println(stringList);
		

	}

}
