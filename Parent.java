package Inheritance;

class parent {
	public void display() {
		System.out.println("This is parent class");
	}
}

// inheritance method using extends keyword
class child extends parent {
	public void display1() {
		System.out.println("This is child class");
	}
}

class main_fun {
	public static void main(String[] args) {
		// create object for class
		child o1 = new child();
		o1.display();
		o1.display1();
	}
}
