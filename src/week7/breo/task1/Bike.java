package week7.breo.task1;

public class Bike extends Vehicle{

	public Bike(String name){
		super(name);
	}
	public void startEngine(){
		System.out.println("Started bike");
	}
	public void stopEngine(){
		System.out.println("Stopped bike");
	}
}

