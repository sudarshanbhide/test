package com.sample.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	
	int name;
	Main m ;
	
	public boolean testCall(){
		return true;
	}
	public void setName(Name name) {
	}

	private void method(){
		m.setName(new Name());
		if(true && testCall()){
		}
		Map<Name,String> hashMap;
	}
	
	private List<String> methodList(){
		m.setName(new Name());
		if(true && testCall()){
		}
		return null;
	}
	
	public boolean returnValu(){
		List<String> files = new ArrayList<String>();
		for (String f : m.methodList()) {
			}
		return m.testCall();
	}
	
	public void checkCoupleRelation(){
		returnValu();	
	}
	
}

class Name{
	
}
