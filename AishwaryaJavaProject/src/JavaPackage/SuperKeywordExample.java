package JavaPackage;

class Car {
	String color="white";
	 int speed=90;
	
	void increaseSpeed() {
		speed=100;
		System.out.println(speed);
	}
}

class BMW extends Car {
	String color="blue";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.printColor();
		b.increaseSpeed();

	}

}
