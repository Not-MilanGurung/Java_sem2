package week7.breo.task1;

public abstract class Vehicle{
	private String name;

	public abstract void startEngine();
	public abstract void stopEngine();

	public void displayInfo(){
		System.out.println(name);
	}

	public Vehicle(String name) {this.name = name;}
}