package com.sample.test;

public class Main {

	static int k ;
	final static  String finalString;
	String sampleString;
	static {
		k = 10;
		finalString = "a";
	}
	public void display(){
		
		Test.city.concat("a");
		
	}
	
	public void displayAgain(){
		sampleString = "sampleString";
		Test.city = "A";
	}
}
