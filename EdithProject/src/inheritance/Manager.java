package inheritance;

public class Manager extends Employee{
	String dept;

	public Manager(String name, int age, int empId, String dept) {
		super(name, age, empId);
		this.dept = dept;
	}
	public void doSomthing() {
		System.out.println("Do something from manager");
	}
}

