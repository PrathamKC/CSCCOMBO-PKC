import java.util.Arrays;
public class ArrayKnowledge {

	public static void main(String[] args) 
	{
		char [] x = {'x','x','c'};
		
		System.out.println(hasxx(x));
		System.out.println(Arrays.toString(fromToArray(1,3)));
	}
	
	public static boolean hasxx(char[] characters)
	{
		for (int i =0; i< characters.length-1;i++)
		{
			if (characters[i] =='x' && characters [i+1] == 'x')
			{
				return true;
			}
		}
		return false;
	}
	
	public static int[] fromToArray(int start, int end)
	{
		int size = end-start;
		int [] arr = new int [size];
		
		for(int i = 0; i < arr.length; i++)
			{
				arr[i] += start+i;
			}
		return arr;
	}
}