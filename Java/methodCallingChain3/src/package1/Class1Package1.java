package package1;

import package2.Class1Pakage2;
import package2.Class2Package2;

public class Class1Package1 {
	
	public void method1() {
		Class1Pakage2 mainClassPakage2 = new Class1Pakage2();
		Class2Package2 class2Package2 = new Class2Package2();
		
		try {
			mainClassPakage2.methodPackage2().getMethod("method2", null);
		} catch (NoSuchMethodException e) {

		} catch (SecurityException e) {

		}
	}
}
