package org.greens;

public class Employee {
	public void vignesh() {

		System.out.println("vignesh");
	}
	
	
	
	public void sample() {
String s1 ="mahesh";
String s2="this is mahesh";
// to find the length of the string
//vignesh worked
  




int len = s1.length();
System.out.println(len);
char charAt = s1.charAt(2);
System.out.println(charAt);


//to convert the string to uppercase
String upp = s1.toUpperCase();
System.out.println(upp);

//to convert the string to lowercase
String low = s1.toLowerCase();
System.out.println(low);
 
//to find the index of the given character
int e = s1.indexOf('h');
System.out.println(e);
 
//to find the last index of the given character
int last = s1.lastIndexOf('h');
System.out.println(last);
 
//to find the index of the character
//char ch = s1.charAt(5);
System.out.println(s1.charAt(5));
 
//to compare the two strings
boolean equ = s1.equals(s2);
System.out.println(equ);
 
// to compare equals ingore case sensitive
boolean ign = s1.equalsIgnoreCase(s2);
System.out.println(ign);

//to check the given word is present or not
boolean con = s2.contains("is");
System.out.println(con);

//to replace the one string with another
String replace = s2.replace("mahesh", "aswin");
System.out.println(replace);
 
//start with
boolean st = s1.startsWith("ma");
System.out.println(st);
 
//endswith
boolean end = s2.endsWith("sh");
System.out.println(end);

//trim (trimming the space)
String tri = s2.trim();
System.out.println(tri);
 
//empty
boolean emp = s2.isEmpty();
System.out.println(emp);

//substring(to the string from the given index
String sub = s2.substring(6);
System.out.println(sub);
 
//start and end
String su = s2.substring(5, 9);
System.out.println(su);


	}
	public static void main(String[] args) {
		Employee s = new Employee();
		s.sample();
		s.vignesh();
		
	}
}
