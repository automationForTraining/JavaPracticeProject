package JavaPackage;

class Student {
	
	int rollNo;
	String name;
	
	public void studentDetails(int r, String n) {
		rollNo=r;
		name=n;
		
		System.out.println(rollNo+" "+name);
	}
}

public class ObjectsAndClasses {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.studentDetails(101, "Ram");
		s.studentDetails(102, "Ravi");
		s.studentDetails(103, "Rohan");
		s.studentDetails(104, "Shruthi");

	}

}
