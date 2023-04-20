package javaBasics;

public class TestStringConcepts {

	public static void main(String[] args) {
		
		String s = "Welcome to the Journey of Automation. Welcome again to Automation!";
		String s1 = "WelcometotheJourneyofAutomation";
		
		System.out.println("Length of the string is  " + s.length());
		System.out.println("Length of the string is  " + s1.length());
		
		String t1 = "Testing";
		String t2 = "testing";
		String t3 = "Testing";
		String t4 = "TESTING";
		
		// String Equals using equals
		
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equals(t3)); // true
		System.out.println(t1.equals(t4)); // false
		System.out.println(t1.equalsIgnoreCase(t4)); // true
		
		// String Equals using ==
		System.out.println(t1==t2); // false
		System.out.println(t1==t3); // true
		System.out.println(t1==t4); // false
		
		System.out.println("Test upper case -  " + s.toUpperCase()); 
		System.out.println("Test Lower case -  " + s.toLowerCase()); 
		
		System.out.println("Test index of a word - " + s.indexOf("Automation"));
		
		String a1 = "Hello"; 
		String a2 = "World"; 
		
		System.out.println("String concatenation using + -> " + a1 + a2);
		System.out.println("String concatenation using concat -> " + a1.concat(a2));
		
		System.out.println("----test contains------"); 
		System.out.println(s.contains("Journey of Automation"));  
		System.out.println(s.contains("again"));
		System.out.println(s.contains("test"));
		
		System.out.println(s.charAt(4));
		System.out.println("----test substring------"); 
		System.out.println("using only begin index - " + s.substring(8));
		System.out.println("using both begin/end index - " + s.substring(8,36));
		
		System.out.println("----convert sting to char------");
		String b1 = "Hello World";
		char[] ch = b1.toCharArray();  
        System.out.println("length of String converted to array - " + ch.length);
        
        for (char i : ch) {
        	System.out.println(i);
        }
        
        System.out.println("----using Trim------");
        String c1 = "      Hello World        ";
        String c3 = "people";
        System.out.println("Length of the string before trimming  " + c1.length() + "  " + c1.concat(c3));
        String c2 = c1.trim();
        System.out.println("Length of the string after trimming  " + c2.length() + "  " + c2.concat(c3) );
        
        System.out.println("----using Value of------");
        int q = 30;
        
        String q1 = String.valueOf(q);
        System.out.println(q + 10011);
        System.out.println(q1 + 10011);
        
        System.out.println("----using split------");
        
        String[] words= s.split(" ");
        for (String i : words) {
        	System.out.println(i);
        }
        
        String[] words1= s.split(" ",3);
        for (String i : words1) {
        	System.out.println(i);
        }
        
        String[] words2= s.split(" ",4);
        for (String i : words2) {
        	System.out.println(i);
        }
        
        
        
        
		
		
	}

}
