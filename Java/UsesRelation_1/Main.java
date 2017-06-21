package com.sample.test;

public class Main {

	int field;
	public String useInReturn(){
		String j = null ;
		return j;
	}
	
	public void useInMethodCall(){
		
		int k = 0;
		tempMethod(k);
		k = field;
	}
	
	public void useInMethodCallForField(){
		tempMethod(field);
	}
	
	public void useInsideMethodCall(){
		int parameterInMethod;
		tempMethod(parameterInMethod=field);
	}
	
	public void useForParameterInMethodCall(int parameterUse){
		int parameterInMethod;
		tempMethod(parameterInMethod=parameterUse);
	}

	public void useInIterator(){
		int forVar;
		for(forVar=0;forVar<5;forVar++){
			
		}
		
		int arrayInt[] = new int[10];
		for (int forEachVar : arrayInt) {
			
		}
		
		int whileVar=9;
		do{
			
		}while(whileVar > 0);
		
		int ifVar=0;
		
		if(ifVar >4){
			
		}
		
		int ternaryVar=0;
		
		boolean result = true ? ternaryVar>0 : ternaryVar<0;
	}
	private void tempMethod(int i) {
		
	}
}
