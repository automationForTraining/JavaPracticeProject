package JavaPackage;

public class ThrowExample {
	
	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		validateAge(20);
		
		System.out.println("Registering for voting");
		Thread.sleep(3000);
		
	}

}
