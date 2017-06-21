package com.sample.test;

public class Main {

	public String setInReturn(){
		String j ;
		return (j ="return");
	}
	
	public void setInMethodCall(int g){
		
		
	}
	
	public void setInMethodCall(){
		int parameterInMethod;
		setInMethodCall(parameterInMethod=9);
	}
}
