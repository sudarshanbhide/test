package package1;

public class TestCode {

	public void main() {

		method1(addOne(5) + 5);
	}

	protected void method1(int value) {
		
	}
	
	int addOne(int var) {
		return var++;
	}
	
}
