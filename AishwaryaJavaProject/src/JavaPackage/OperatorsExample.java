package JavaPackage;

public class OperatorsExample {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a<b&&a>c);  //logical and operator
		System.out.println(a<b||a>c);  //logical or operator
		System.out.println(a>b&&a<c);
		System.out.println(a>b||a<c);
		System.out.println(a<b&a>c);   //bitwise and operator
		System.out.println(a<b|a>c);   //bitwise or operator
		System.out.println(a>b&a<c);
		System.out.println(a>b|a<c);
		
		
	}

}
