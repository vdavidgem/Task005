package Overriding;

class Mobil {
	int getRateOfInterest() {
		return 00;
	}
}

class Vivo extends Mobil {
	int internetspeed() {
		return 100;
	}
}

class NOKIA extends Mobil {
	int internetspeed() {
		return 200;
	}
}

class ONEPLUS extends Mobil {
	int internetspeed() {
		return 300;
	}
}

class Test2 {
	public static void main(String args[]) {
		Vivo v = new Vivo();
		NOKIA n = new NOKIA();
		ONEPLUS o = new ONEPLUS();
		System.out.println("Vivo Speed of Interest: " + v.internetspeed());
		System.out.println("NOKIA Speed of Interest: " + n.internetspeed());
		System.out.println("AXIS Speed of Interest: " + o.internetspeed());
	}
}
