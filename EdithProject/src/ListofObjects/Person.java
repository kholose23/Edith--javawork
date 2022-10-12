package ListofObjects;

import java.util.ArrayList;
	
public class Person {	

	public Person(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList();
		list.add(new Person("Upasana", 32, "Trainer"));
		list.add(new Person("Hilda", 22, "Manager"));
		list.add(new Person("Kev", 23,"Team Leader"));
		list.add(new Person("Arifi", 20, "Designer"));
		
		System.out.println(list);

	}

}
