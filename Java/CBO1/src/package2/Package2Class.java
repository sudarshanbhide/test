package package2;

import package1.BaseClass;
import package1.DerivedClass;

public class Package2Class {

	DerivedClass derivedClass1;
	
	public void method1() {
		DerivedClass derivedClass = new DerivedClass();
		
		DerivedClass derivedClass2 = new DerivedClass();
		derivedClass2.method1();
		
		BaseClass baseClass = new DerivedClass();
		baseClass.methodBase2();
		
		DerivedClass derivedClass3 = new DerivedClass(new DerivedClass());
	}
}
