public class ExceptionHandling {

	public static void main(String[] args) {
		int[] nums;
		
		try {
			nums = new int[] {1,2,3};
			System.out.println(nums[3]);
			setIndexTen(nums);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			//nums = new int[] {1,2,3,4};
			//System.out.println(nums[8]);

			System.out.println("Oops, you went way over the end of the array!" + "\nDid you really think that was gonna work?");
			
			//e.printStackTrace(); //having this line here will show the warning.
		
			//System.out.println(e.getMessage()); //shows error.	
			
			nums = new int[12];
			setIndexTen(nums);
			
		}
		
		try {
			int myNum = Integer.parseInt("s45");
		}
		
		catch (NumberFormatException e) {
			System.out.println("Letter are NOT numbers!");
		}
		
		finally {
			System.out.println("Carry on!");
		}
		
		System.out.println("Outside of the exception.");
	}
		
	public static void setIndexTen(int[] arr) {
		if (arr.length < 11) {
			throw new ArrayIndexOutOfBoundsException("That array is not big enough for 10 locations pal!");
		}
		arr[10] = 5;
	}
}