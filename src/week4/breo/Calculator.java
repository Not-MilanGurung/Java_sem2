package week4.breo;
/**
 * Provides addition, subtraction, multiplication and division operation between
 * two numbers
 */
public class Calculator {
    /**
     * 
     * @param a
     * @param b
     * @return the sum of a and b
     */
    public static int add(int a, int b){return a+b;}
    public static double add(double a, double b){return a+b;}
    /**
     * 
     * @param a
     * @param b
     * @return differenc of b from a
     */
    public static int subtract(int a, int b){return a-b;}
    public static double subtract(double a, double b){return a-b;}
    /**
     * 
     * @param a
     * @param b
     * @return product of a and b
     */
    public static int multiply(int a, int b){return a*b;}
    public static double multiply(double a, double b){return a*b;}
    /**
     * 
     * @param a
     * @param b
     * @return a divided by b
     * @throws Exception divide by zero error
     */
    public static double divide(int a, int b) throws Exception{
        if (b == 0) throw new Exception("Can not divide by zero");
        return a / b;
    }
    public static double divide(double a, double b) throws Exception{
        if (b == 0) throw new Exception("Can not divide by zero");
        return a / b;
    }
    /**
     * Testing the Calculator class' methods
     * @param args
     * @throws Exception Divide by zero exception
     */
    public static void main(String[] args) throws Exception{
        double num1 = 54.3;
        int num2 = 4;
        System.out.println("The sum of "+num1+" and "+num2+" is "+add(num1, num2));
        System.out.println("The differenc between "+num1+" and "+num2+" is "+subtract(num1, num2));
        System.out.println("The product of "+num1+" and "+num2+" is "+multiply(num1, num2));
        System.out.println("The division of "+num1+" by "+num2+" is "+divide(num1, num2));
    }
}
