package week7.breo.task3;

public class Student {
	public int id;
	public String name;

	public Student(int id, String name){
		this.id = id;
		this.name =name;
	}

	@Override
	public String toString(){
		return id +"\t" + name;
	}

	@Override
	public boolean equals(Object s){
		Student o = (Student) s;
		return this.id == o.id;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Hulk");
		Student s2 = new Student(1, "Bruce");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
	}
}
