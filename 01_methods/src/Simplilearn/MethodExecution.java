package Simplilearn;

public class MethodExecution {
	public static void main (String[] args) {
		// create an instance of MethodExectuion class
		MethodExecution instance = new MethodExecution();
		
		// invoke a method multiply
		int result = instance.multiply(10, 3);
		System.out.println("the result of multiplication of 10,3 is : "+result);
	}
	// define multiply
	int multiply(int x, int y) {
		int z = x * y;
		return z;
	}
}
