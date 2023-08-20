import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Temperature Conversion Tool! \n Select an option");
     System.out.println(" 1. Convert Celsius to Fahrenheit ");

     System.out.println(" 2. Convert Fahrenheit to Celsius ");
     System.out.println(" Enter your choice: ");
     int num = scan.nextInt();

     
     if(num == 1) {
    
    	 System.out.println("Enter the temperature in celsius");
         double celsius = scan.nextDouble();
         double res1 = celsiusToFahrenheit(celsius);
         System.out.println(celsius + " \u00B0C is equivalent to " + res1 + " °F");
     
     } else {
    	 
    	 System.out.println("Enter the temperature in fehrenheit");
         double fahrenheit = scan.nextDouble();
         double res2 = celsiusToFahrenheit(fahrenheit);
         System.out.println(fahrenheit + " °F is equivalent to " + res2 + " °c");
     }
     

	}
	
	public static double celsiusToFahrenheit(double celsius) {
		double  fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}
   
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		 double celsius = (fahrenheit - 32) * 5/9;
		 return celsius;
	}
}