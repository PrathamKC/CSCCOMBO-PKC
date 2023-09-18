import java.util.Scanner;
public class TempCode 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double fahrenheit, kelvin = 0, celsius = 0;
		
		//System.out.println("What is the temp in Fahreneit? ");
		fahrenheit = getTemp();
		
		celsius = (fahrenheit - 32) * (5/9.0);
		outputTemp("Celsius: ", celsius);
		
		kelvin = celsius + 273.15;
		outputTemp("Kelvin: ", kelvin);

		//System.out.println("Celsius: " + celsius + "\n" + "Kelvin : " + kelvin);
		
		//outputTemp("Celsius: ", celsius, kelvin);
	}
	
	public static void outputTemp(String scale, double temp) 
	{
		System.out.println(scale + temp);	
	}
	
	public static double getTemp() //you can only return one variable with a double
	{
		Scanner input = new Scanner(System.in);
		//Scanner keyboard;
		double temp;
		//keyboard = new Scanner(System.in); if you remove these two "//", then u have to delete the scanner thing in this ps double.
		System.out.println("What is the temp in Fahreneit? ");
		temp = input.nextDouble();
		return temp;
	}
	
}