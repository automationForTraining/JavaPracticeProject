package JavaPackage;

class Employee {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(727378);
		emp.setName("Ram");
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}

}
