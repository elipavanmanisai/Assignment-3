package com.java.Enerumate;
import java.util.*;
public class EnerumateExample {
	 public static void main(String[] args) {
		      // Create a vector
		      Vector<String> vector = new Vector<String>();
		      
		      // Add elements to the vector
		      vector.add("name1");
		      vector.add("name2");
		      vector.add("name3");

		      // Get an enumeration of the elements in the vector
		      Enumeration<String> enumeration = vector.elements();

		      // Iterate through the elements in the vector using enumeration
		      while (enumeration.hasMoreElements()) {
		         String element = enumeration.nextElement();
		         System.out.println(element);
		      }
		   }
}
