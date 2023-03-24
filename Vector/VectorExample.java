package com.java.Vector;
import java.util.*;
public class VectorExample {
	public static void main(String args[]) {  
        //Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("sai");  
        vec.add("pavan");  
        vec.add("manisa");  
        vec.add("pooja");  
        //Adding elements using addElement() method of Vector  
        vec.addElement("Reshma");  
        vec.addElement("sindu");  
        vec.addElement("prasanna");  
          
        System.out.println("Elements are: "+vec);  
     }  
}  

