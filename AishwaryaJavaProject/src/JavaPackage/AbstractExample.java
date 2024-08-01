package JavaPackage;

abstract class A {
	
	abstract void method1();
	abstract void method2();
	void method3() {
		System.out.println("This is method 3");
	}
}

class B extends A {
	void method1() {
		System.out.println("This is method 1");
	}
	void method2() {
		System.out.println("This is method 2");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		
		B b=new B();
		b.method1();
		b.method2();
		b.method3();

	}

}
