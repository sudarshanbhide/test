package package1;

public class TestCode {

	public void main() {

	    String[] myArgs = { "A", "B", "C" };
	    System.out.println(append("Z", myArgs));
	    // prints "[ A ][ B ][ C ][ Z ]"

	    System.out.println(prepend(myArgs, "Z"));
	    // prints "[ Z ][ A ][ B ][ C ]"
	}

	static <T> T[] append(T lastElement, T... arr) {
	    final int N = arr.length;
	    arr = java.util.Arrays.copyOf(arr, N+1);
	    arr[N] = lastElement;
	    return arr;
	}
	
	static <T> T[] prepend(T[] arr, T firstElement) {
	    final int N = arr.length;
	    arr = java.util.Arrays.copyOf(arr, N+1);
	    System.arraycopy(arr, 0, arr, 1, N);
	    arr[0] = firstElement;
	    return arr;
	}
}
