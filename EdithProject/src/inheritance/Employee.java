package inheritance;

public class Employee extends Person {
	int empId;

	public Employee(String name, int age, int empId) {
		super(name, age);
		this.empId = empId;
	}
	public void doSomthing() {
		System.out.println("Do something from employee");
	}
	
}

