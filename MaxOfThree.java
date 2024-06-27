package org.genericus;

public class MaxOfThree 
{
		private static Integer a;
		private static Integer b;
		private static Integer c;
		
		
		public static Integer MaximumOfThree(Integer a,Integer b, Integer c)
		{
			Integer max =a;
			if(b.compareTo(max)>0)
			{
				max = b;
			}
			if(c.compareTo(max)>0)
			{
				max =c;
			}
			return max;	
		}
		
		public static void main(String[] args) 
		{
			// Test case 1: Max number at 1st position
	        Integer a = 10;
	        Integer b = 5;
	        Integer c = 3;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));
	        // Test case 2: Max number at 2nd position
	        a = 5;
	        b = 10;
	        c = 3;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));

	        // Test case 3: Max number at 3rd position
	        a = 5;
	        b = 3;
	        c = 10;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));
	    }
	        
			

}
