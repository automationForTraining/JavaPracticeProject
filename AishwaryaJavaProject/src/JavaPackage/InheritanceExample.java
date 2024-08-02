package JavaPackage;

class Animal {
	
	public void eat() {
		System.out.println("eating..");
		System.out.println("Animals eat food");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
		System.out.println("Animals sleep all day");
	}
}

class Dog extends Animal {
	
	public void bark() {
		System.out.println("Barking...");
	}
}

class Cat extends Dog {
	
	public void meow() {
		System.out.println("meowing..");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		
		Cat cat=new Cat();
		
		cat.bark();
		cat.meow();
		cat.sleep();
		cat.eat();
		
	}

}
