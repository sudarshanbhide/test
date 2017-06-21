package package1;

import package2.Class1Pakage2;
import random.Foo;

public class Class1Package1 {

	public void method1() {
	
		int size = (int) Math.random();
		Integer i = size;
		
		String[] array1 = new String[size];
		
		Class1Pakage2 class1Pakage2;
		for (String string : array1) {
			class1Pakage2 = new Class1Pakage2();
			class1Pakage2.method2();
		}
		class1Pakage2.i = 10;

		Foo abc = new Foo();
		abc.bar();

	}
	
	public float method2Package1(double d) {
		return 2.0;
	}
}
