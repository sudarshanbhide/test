package com.testcode.package1;

public class CustomObject {
	
	public CustomObject() {
		BaseClass baseClass = new DerivedClass();
		method1(baseClass);
	}
	
	public void method1(BaseClass baseClass) {
		
	}
	
	public void method2(DerivedClass derivedClass) {
		
	}
}
