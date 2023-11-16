public class BiRec 
{
	public static void main(String[] args) 
	{
		binary(96); //decimal to binary
	}
	
	public static void binary (int n)
	{
		if (n == 0)
		{
			return;
		}
		
		binary(n/2);
		System.out.print(n%2);
	}
}