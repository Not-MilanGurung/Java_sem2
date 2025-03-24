package week3.extra;
import java.util.Scanner;

enum Bool{
	TRUE, FALSE;
}
public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.err.print("How many measurments: ");
        int num = console.nextInt();
        for(int i = 0; i < num; i++){
            userInput(console);
        }
        System.out.println("Exiting..\n");
        console.close();
    }
    /**
     * Asks the user for the unit to convert from and unit to convert to as well 
     * as the temperature value. This is done using nested switch statements.
     * @param console is the scanner object used to take input 
     */
    static void userInput(Scanner console){
        System.out.print("\nAre you entering 1)Celsius 2) Fahrenheit or 3)Kelvin measurment: ");
        int srcUnit = console.nextInt();
        System.out.print("Enter the temperature value: ");
        double srcTemp = console.nextDouble();
        int targetUnit;
        double resTemp;
        String resUnit, srcUniString;
        switch (srcUnit) {
            case 1:
                srcUniString = "Celsius";
                System.out.print("Convert to 1)Fahrenheit or 2)Kelvin:");
                targetUnit = console.nextInt();
                switch (targetUnit) {
                    case 1:
                    resTemp = toFahrenheit(srcTemp, Bool.FALSE);
                    resUnit = "Fahrenheit";
                    break;
                    case 2:
                        resTemp = toKelvin(srcTemp, Bool.TRUE);
                        resUnit = "Kelvin";
                        break;
                    default:
                        System.err.println("Invalid temperature to convert to");
                        return;
                    }
                    break;
                    
            case 2:
                srcUniString = "Fahrenheit";
                System.out.print("Convert to 1)Celsius or 2)Kelvin:");
                targetUnit = console.nextInt();
                switch (targetUnit) {
                    case 1:
                        resTemp = toCelsius(srcTemp, Bool.FALSE);
                        resUnit = "Celsius";
                        break;
                    case 2:
                        resTemp = toKelvin(srcTemp, Bool.FALSE);
                        resUnit = "Kelvin";
                        break;
                    default:
                        System.err.println("Invalid temperature to convert to");
                        return;
                }
                break;

            case 3:
                srcUniString = "Kelvin";
                System.out.print("Convert to 1)Celsius or 2)Fahrenheit:");
                targetUnit = console.nextInt();
                switch (targetUnit) {
                    case 1:
                        resTemp = toCelsius(srcTemp, Bool.TRUE);
                        resUnit = "Celsius";
                        break;
                    case 2:
                        resTemp = toFahrenheit(srcTemp, Bool.TRUE);
                        resUnit = "Fahrenheit";
                        break;
                    default:
                        System.err.println("Invalid temperature to convert to");
                        return;
                }
                break;
        
            default:
                System.err.println("Invalid option");
                return;
        }
        System.out.printf("%f %s is %f %s",srcTemp,srcUniString, resTemp,resUnit);
    }

     /**
     * Converts from Celsius or Fahrenheit to Kelvin
     * @param temp The temperature value
     * @param fromCelsisu True if converting from Celsius, false if converting from Fahrenheit
     * @return Temperature in Kelvin
     */
    static double toKelvin(double temp, Bool fromCelsius){
        switch (fromCelsius) {
            case TRUE:
                return temp + 273.15;
            default:
                return (temp - 32.0) * (5.0/9.0) + 273.15;
        }
    }
    /**
     * Converts from Kelvin or Fahrenheit to Celsius
     * @param temp The temperature value
     * @param fromKelvin True if converting from Kelvin, false if converting from Fahrenheit
     * @return Temperature in Celsius
     */
    static double toCelsius(double temp, Bool fromKelvin){
        switch (fromKelvin) {
            case TRUE:
                return temp - 273.15;
            default:
                return (temp - 32.0) * (9.0/5.0);
        }
    }
     /**
     * Converts from Kelvin or Celsius to Fahrenheit
     * @param temp The temperature value
     * @param fromKelvin True if converting from Kelvin, false if converting from Celsius
     * @return Temperature in Fahrenheit
     */
    static double toFahrenheit(double temp, Bool fromKelvin){
        switch (fromKelvin) {
            case TRUE:
                return (temp - 273.15) * (9.0/5.0) + 32;
            default:
                return (temp * (9.0/5.0)) + 32.0;
        }
    }
}
