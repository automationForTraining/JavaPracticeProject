package JavaPackage;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		
		try {
			String s="Sai";	
			System.out.println(s.length());
		} catch(Exception e) {
			System.out.println("Oh Sorry!! Something went wrong. We are trying to fix the issue.");
		} finally {
			System.out.println("DB connections are closed in this block");
		}
		
		
		System.out.println("Code after exception");
		

	}

}
