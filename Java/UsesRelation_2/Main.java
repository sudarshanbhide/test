package com.sample.test;

public class Main {

	int globalField ;
	String globalString;
	static String staticString;
	static String usesStaticString;
	public void testUsesRelationForMethod(){
		int localfield;
		localfield = globalField;
	}

	public void testUsesRelation(){
		
		globalString.toLowerCase().toUpperCase();
	}
	
	static {
		staticString = "testString";
		usesStaticString = staticString;
	}
}
