package collectionsConcepts;

import java.util.*;

import javaBasics.StudentDetails;

public class TestHashMap {

	public static void main(String[] args) {

		/*
		 * Java HashMap contains values based on the key. 
		 * Java HashMap contains only unique keys. 
		 * Java HashMap may have one null key and multiple null values.
		 * Java HashMap is non synchronized. 
		 * Java HashMap maintains no order.
		 */

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		// Key, Value
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("India", "New Delhi");
		capitalCities.put("Canada", "Ottawa");
		capitalCities.put("Srilanka", "Colombo");
		System.out.println(capitalCities + " size is " + capitalCities.size());

		System.out.println(capitalCities.get("England"));

		//	System.out.println(capitalCities.remove("England") + " size is " + capitalCities.size() + " " + capitalCities);

		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : capitalCities.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  

		//key-based removal  
		capitalCities.remove("Germany");  
		System.out.println(capitalCities+ " size is " + capitalCities.size());  
		//key-value pair based removal  
		capitalCities.remove("Srilanka", "Colombo");  
		System.out.println(capitalCities+ " size is " + capitalCities.size());  

		//replace the value directly
		capitalCities.replace("England", "Nottingham");
		System.out.println(capitalCities+ " size is " + capitalCities.size()); 

		//replace the value by giving old and new value
		capitalCities.replace("USA", "Washington DC", "Chicago");
		System.out.println(capitalCities+ " size is " + capitalCities.size()); 

		// add element if absent
		capitalCities.putIfAbsent("South Africa", "Johannesburg");
		System.out.println(capitalCities+ " size is " + capitalCities.size()); 

		//Here, we specify the if and else statement as arguments of the method  
		System.out.println(capitalCities.getOrDefault("Kenya", "Not Found"));  
		System.out.println(capitalCities.getOrDefault("India", "Not Found")); 
		
		
		System.out.println(capitalCities.hashCode());


		HashMap<Integer, StudentDetailsCollections> testStudentMap = new HashMap<Integer, StudentDetailsCollections>();

		StudentDetailsCollections sd1 = new StudentDetailsCollections("fname1","lname1", 1, "townOfResidence1", true);
		StudentDetailsCollections sd2 = new StudentDetailsCollections("fname2","lname2", 2, "townOfResidenc2", false);
		StudentDetailsCollections sd3 = new StudentDetailsCollections("fname3","lname3", 3, "townOfResidenc3", true);

		testStudentMap.put(4, sd1);
		testStudentMap.put(5, sd2);
		testStudentMap.put(6, sd3);

		for(Map.Entry<Integer, StudentDetailsCollections> entry:testStudentMap.entrySet()){     
			StudentDetailsCollections b=entry.getValue(); 
			System.out.println(entry.getKey()+" "+ b.fname+" "+b.lname+" "+b.rollNum+" "+b.townOfResidence+" "+b.learningJava); 
		}

		

	}

}
