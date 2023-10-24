import java.util.Arrays;

public class StringKnowledge {

	public static void main(String[] args)
	{
		System.out.println(howManyCat("abc cat ho"));
		System.out.println(endOther("abc", "abXabc"));
	}

	public static  int howManyCat(String str)
	{
		int cat = 0;
	
		for (int i = 0; i < str.length()-3; i++)
		{
			if(str.substring(i, i+3).equals("cat"))
			{
				cat++;	
			}
		}
		return cat;
	}
	
	public static boolean endOther(String a, String b)
	{
		a = a.toLowerCase();
		b = b.toLowerCase();
		return (a.endsWith(b) || (b.endsWith(a)));
	}
	
}