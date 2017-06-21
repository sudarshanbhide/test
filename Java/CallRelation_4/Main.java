package com.sample.test;

public class Main {

	public Test displayTest(){
		String a = "hello";
		a.toLowerCase();
		return new Test();
	}
	
	public void display(){
		String a = "hello";
		a.toLowerCase().toCharArray().toString().concat(a);
		new Test().test();
	}
}
