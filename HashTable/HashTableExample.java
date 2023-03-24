package com.java.HashTable;
import java.util.*;
public class HashTableExample {
	 
	
	 public static void main(String args[]){  
	  Hashtable<Integer,String> list=new Hashtable<Integer,String>();  
	  
	  list.put(100,"Amit");  
	  list.put(102,"Ravi");  
	  list.put(101,"Vijay");  
	  list.put(103,"Rahul");  
	  
	  for(Map.Entry m:list.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}
