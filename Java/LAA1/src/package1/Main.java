package package1;

public class Main {

	private int var1;

	public void method1() {
		int var2 = var1++;
		
		method2(var2);
	}
	
	public void method2(int var2) {
		var1 = var2;
	}
}
