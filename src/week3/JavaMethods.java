package week3;

public class JavaMethods {
	/**
	 * @brief Calculates the area of the given circle
	 * 
	 * Calculates the area of a circle using the built-in 
	 * Math.PI value and multiplying it with the square of the 
	 * input radius
	 * 
	 * @param radius Radius of the circle
	 * @return area Area of the circle
	 */
	public static double areaOfCircle(double radius) {
		double area;
		area = Math.PI * Math.pow(radius, 2.0);		
		return area;
	}
}
