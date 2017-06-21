package com.sample.test;

public class Main {

	static {
		getVal("testStaticCall");
	}
	public Main(){
		getVal("A");
	}
	public static String getVal(String a){
		return "test";
	}
	
	public static String getValTest(){
		return "test";
	}
	
	public void main(){
		Main.getVal(getValTest());
	}
	
	public void callsTest(){
		
		String name = null ;
		name.concat(getValTest().toLowerCase().toUpperCase().toString());
	}
	
	public String testReturnCall(){
		return getValTest();
	}
}
