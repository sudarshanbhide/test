package com.sample.test;


public class Main extends Base{
	
	public void test(){
		new NameImpl().getName().endVisit();
	}
	
	public void testCalls(){
		Main m =new Main();
		m.baseMethod();
		m.baseMethodToDisplay();
	}
	
	public void baseMethod(){
		
	}
}

class Base{
	
	public void baseMethod(){}
	public void baseMethodToDisplay(){}
	
}
class NameImpl{
	Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
}
class Name{
	
	public void endVisit(){}
}
