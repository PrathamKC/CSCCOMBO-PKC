package expon;

public class expon {

	public static void main(String[] args) {
		double power = 1;
		double base= (1 +.10/12);
		double exponent = 60;
		for (int i = 1; i <= exponent; i++)   
			
			power = power * base;  
			
			System.out.printf("%.2f",power*1000);  

	}

}
