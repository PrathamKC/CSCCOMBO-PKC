import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		float proAvg=0, avg=0, proData, regData, count1=0, count2=0;
		Scanner input = new Scanner(System.in);
		
		while (count1 < 5) {
			System.out.println("Enter your data: ");
			proData = input.nextInt();
			avg += proAvg;
			proAvg += proData;
			count1++;
		}
		
		proAvg = proAvg/5;
		
		while(count2 < 195) {
			System.out.println("Enter your data: ");
			regData = input.nextInt();
			avg += regData;
			
			if (regData > proAvg * 0.75 || regData < proAvg * .75) {
				System.out.println("Your data will NOT be used as it is more than 25% greater/smaller than the average of the professionals");
			}
			count2++;
		}
		
		avg = avg/200;
		System.out.println("Average for the city of Fort Collins: " + avg);
		
	}

}