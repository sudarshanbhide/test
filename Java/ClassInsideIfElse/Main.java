package com.sample.test;

public class Main
{
  
	public void checkMethodInIfCondition(){
		
		if(true){
			
			abstract class Innerclass {
				
				int employeeNumber;
				public void innerMethod1(){
					
				}
				public void innerMethod2(){
					innerMethod1();
				}
			}
			 final class InnerClassImpl extends Innerclass{
				 String name;
				Innerclass innerClass = new Innerclass() {
					@Override
					public void innerMethod1(){
						InnerClassImpl innerClassImpl = new InnerClassImpl();
						innerClassImpl.employeeNumber = 2;
						innerClassImpl.name = "name";
						innerMethod1();
					}
				};
				
				
			}
			
		}
	}
    
}