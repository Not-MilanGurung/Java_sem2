package week7.breo.task1;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new Car("Hellcat");
		Vehicle v2 = new Bike("Ducati");

		v1.startEngine();
		v2.startEngine();

		v2.stopEngine();
		v1.stopEngine();
	}
}
