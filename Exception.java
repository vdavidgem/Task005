package Exceptionhandling;

public class Exception {
	public static void main(String[] args) {
		try {
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException f) {
			System.out.println("divide by 0:" + f);
		} catch (ArrayIndexOutOfBoundsException k) {
			System.out.println("array index oob" + k);
		} finally {
			System.out.println("i always executed");
		}
		System.out.println("rest of the code");
	}
}
