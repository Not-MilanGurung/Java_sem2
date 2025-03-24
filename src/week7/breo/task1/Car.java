package week7.breo.task1;

public class Car extends Vehicle{

	public Car(String name){
		super(name);
	}
	public void startEngine(){
		System.out.println("Started car");
	}
	public void stopEngine(){
		System.out.println("Stopped car");
	}
}
