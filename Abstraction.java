package Abstraction;

abstract class Abstraction {

	void print()

	{
		System.out.println("Good morning");
	}
}

class Abstraction1 extends Abstraction {

	void run() {
		System.out.println("Good night");
	}

	public static void main(String[] args) {
		Abstraction1 obj = new Abstraction1();
		obj.run();
		obj.print();
	}
}