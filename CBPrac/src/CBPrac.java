public class CBPrac 
{
	public static void main(String[] args) 
	{
		int [] x = {1, 2, 13, 2, 1, 13};
		int [] y =  {5, 2, 5, 2};
		
		
		//System.out.println(firstTwo("hello"));
		//System.out.println(bobThere("bob"));
		//System.out.println(sum13(x));
		System.out.println(has22(y));
	}
	
	public static boolean has22(int[] nums) 
	{
		for (int i = 0; i < nums.length-1; i++)
		{
			if (nums[i] == 2 && nums[i+1] == 2)
			{
				return true;
			}
			
		}
		return false;
	}

	public static String firstTwo(String str)
	{
		if (str.length() < 2)
		{
			return str;
		}
		
		else
		{
			str = str.substring(0,2);
			return str;
		}
	}
	
	public static boolean bobThere(String str)
	{
		for (int i =0; i <str.length(); i++)
		{
			if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
			{
				return true;
			}
		}
		return false;
	}
	
	public static int sum13(int[] nums) 
	{ 
	  int sum = 0;
	  
	  for (int i = 0; i < nums.length; i++)
	    {
	      if (nums.length == 0)
	      {
	        return 0;
	      }
	      if (nums[i] == 13)
	      {
	        i++;
	      }
	      else
	      {
	        sum += nums[i];
	      }
	    }
	  return sum;
	}
}