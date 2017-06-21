package com.sample.test;

class Main {
	
	public Main(){
		super();
	}
	public void reflectionAPI1(){
		Class c = boolean.class;   
		Class c2 = Main.class;   
	}
	
	public void reflectionAPI2() throws ClassNotFoundException{
		Class<?> booleanClass = boolean.class;

		Class<?> cDouble = Double.TYPE;

		Class<?> cDoubleArray = Class.forName("[D");

		Class<?> twoDStringArray = String[][].class;
	}
}
