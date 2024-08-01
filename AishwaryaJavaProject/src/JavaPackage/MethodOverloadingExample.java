package JavaPackage;

class Addition {
	
	public static int adding(int a, int b) {
		return a+b;
	}
	
	public static int adding(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int adding(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static void method1() {
		System.out.println("This is method 1");
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		System.out.println(Addition.adding(10, 20));
		System.out.println(Addition.adding(10, 20, 30));
		System.out.println(Addition.adding(10, 20, 30, 40));
		Addition.method1();

	}

}
