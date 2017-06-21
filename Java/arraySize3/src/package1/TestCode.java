package package1;

public class TestCode {
	
	//commets
	int var = 5;
	
	void method() {
	String[] array1 = new String[getArraySize1()];
	String[] array2 = new String[this.getArraySize2()];
	String[] array3 = new String[getArraySize3()];
	String[] array4 = new String[getArraySize4()];
	String[] array5 = new String[TestCode.getArraySize4()];
	}
	
	int getArraySize1() {
		return 5;
	}
	
	public int getArraySize2() {
		return var;
	}
	
	public Integer getArraySize3() {
		return Integer.getInteger("5");
	}
	
	static int getArraySize4() {
		return 5;
	}
}
