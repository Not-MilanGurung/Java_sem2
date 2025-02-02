package week2;

public class Task2 {
	private String name;
	
	void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("[ERROR]: Name can not be null or empty");
		}
		this.name = name;
	}
	
	void displayName() {
		System.out.println("The name is "+this.name);
	}
	
	public static void main(String[] args) {
		Task2 me = new Task2();
		me.displayName();
		me.setName("");
		me.displayName();
		
		Task2 you = new Task2();
		you.displayName();
		you.setName("Bayonetta");
		you.displayName();
		me.displayName();
	}
}
