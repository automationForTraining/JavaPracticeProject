package JavaPackage;

class RBI {
	public int  getRateOfInterest() {
		return 7;
	}
}

class SBI extends RBI {
	public int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends RBI {
	public int getRateOfInterest() {
		return 9;
	}
}

class Axis extends RBI {
	public int getRateOfInterest() {
		return 10;
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		

		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		
		System.out.println("The interest rate of SBI is:"+s.getRateOfInterest());
		System.out.println("The interest rate of ICICI is:"+i.getRateOfInterest());
		System.out.println("The interest rate of Axis is:"+a.getRateOfInterest());
	}

}
