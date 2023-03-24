package com.java.HashMap;
import java.util.*; 
public class HashMapExample {
	 
	 public static void main(String args[]){  
		//Creating HashMap    
	   HashMap<Integer,String> map=new HashMap<Integer,String>();
	 //Put elements in Map   //Put elements in Map  
	   map.put(10,"Apple");    
	   map.put(9,"Banana");   
	   map.put(8,"Grapes"); //trying duplicate key  
	        
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  
	}  
