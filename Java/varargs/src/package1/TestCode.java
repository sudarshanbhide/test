package package1;

public class TestCode { 

	public void main(){  

		test(215, "India", "Delhi");
		test(147, "United States", "New York", "California");

		System.out.printf("%s: %d, %s%n", "name", 5, "address 5");

	}

	public static void test(int some, String... args) {
		System.out.print("\n" + some);
		for(String arg: args) {
			System.out.print(", " + arg);
		}
	}

}
