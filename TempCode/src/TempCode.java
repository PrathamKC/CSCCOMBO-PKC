import java.util.Scanner;
public class TempCode 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double fahrenheit = 0, kelvin = 0, celsius = 0;
		
		System.out.println("What is the temp in Fahreneit? ");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * (0.55555555);
		kelvin = celsius + 273.15;
		System.out.println("Celsius: " + celsius + "\n" + "Kelvin : " + kelvin);
	}
}