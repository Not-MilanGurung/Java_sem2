package week7.march5;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		PersonCRUD2 v2 = new PersonCRUD2();
		PersonCRUD3 v3 = new PersonCRUD3();

		// v2.insert();
		// v2.insert();
		// v2.insert();
		v2.displayAll();

		Person p1 = new Person(201, "Allen", "allen@hotmail.com");
		Person p2 = new Person(202, "Dyane", "ggit@hotmail.com");
		Person p3 = new Person(203, "Work", "work@gmail.com");

		v3.insert(p1.getPid(), p1.getFullName(), p1.getEmail());
		v3.insert(p2.getPid(), p2.getFullName(), p2.getEmail());
		v3.insert(p3.getPid(), p3.getFullName(), p3.getEmail());
		List<Person> out =  v3.getAll();

		for (Person p : out){
			System.out.println(p.toString());
		}
		
		Person p = v3.getByID(202);
		System.out.println(p.toString());

		v3.update(202, "Hulk", "bruce@yahoo.us");
		v3.deleteRecord(203);

		out =  v3.getAll();

		for (Person per : out){
			System.out.println(per.toString());
		}

	}
}
