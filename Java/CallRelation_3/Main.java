package com.sample.test;

public class Main {

	public void displayTest(){
		TestImpl t1 = new TestImpl();
		t1.test();
		
		Test t2 = new TestImpl();
		t2.test();
		t2.test(2);
	}
}
