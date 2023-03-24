package com.java.ArrayList;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
	    ArrayList<String> bikes= new ArrayList<String>();
	    bikes.add("pulsar");
	    bikes.add("ktm");
	    bikes.add("honda");
	    bikes.add("r15");
	    for (int i = 0; i < bikes.size(); i++) {
	      System.out.println(bikes.get(i));
	    }
	  }
	}
