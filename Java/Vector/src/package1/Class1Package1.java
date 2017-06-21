package package1;

import package2.Class1Pakage2;

public class Class1Package1 {

	public void method1() {
	
		int size = (int) Math.random();
		
		String[] array1 = new String[size];
		
		Class1Pakage2 class1Pakage2;
		for (String string : array1) {
			class1Pakage2 = new Class1Pakage2();
			class1Pakage2.method2();
		}
	}
	
	public void method2Package1() {
		
	}
}
