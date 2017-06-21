package com.sample.test;



public class Main {

	
	public void testInstanceOf(){
		Main n = new Main();
		if(n instanceof Main){
			
		}
	}
	
	public void testInstanceOfParameter(Main m){
		if(m instanceof Main){
			
		}
	}
	
	public void testCoupleRelation(){
		ProgramImpl p=null;
		p.getProgram();
	}
}

class ProgramImpl{
	Program p;
	
	public Program getProgram(){
		return new Program();
	}
}
class Program{
	
	
	
}