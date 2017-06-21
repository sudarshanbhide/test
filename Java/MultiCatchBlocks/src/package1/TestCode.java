package package1;

//commets

import java.io.IOException;

public class TestCode {
	
	//commets
	
	void method() {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
			
			throw new IOException();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | IOException   e) {
			System.out.println("ArithmeticException | ArrayIndexOutOfBoundsException | IOException");
		} 
	}
}
