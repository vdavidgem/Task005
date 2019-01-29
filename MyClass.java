package Methodoverloading;

public class MyClass {

	public static void main(String[] args) {
		System.out.println(Add(5, 30));
		System.out.println(Add(8.5, 3.0));
		System.out.println(Add("David", "gem"));
	}

	public static int Add(int a, int b) {
		return (a + b);
	}

	public static double Add(double a, double b) {
		return (a + b);
	}

	public static String Add(String a, String b) {
		return (a + b);
	}
}
