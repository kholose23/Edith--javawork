package inheritance;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person constructor");
	}
	public void doSomthing() {

		System.out.println("Do something from person");
	}

	
	
}
