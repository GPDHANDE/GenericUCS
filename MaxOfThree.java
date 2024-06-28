package org.genericus;

public class MaxOfThree
{
		
		public static <T extends Comparable<T>> T MaximumOfThree(T a, T b,T c)
		{
			T max = a;
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
	        
	        // Test case 1: Max float at 1st position
	        Float a1 = 10.5f;
	        Float b1 = 5.2f;
	        Float c1 = 3.1f;
	        System.out.println("Maximum of " + a1 + ", " + b1 + ", " + c1 + " is " + MaximumOfThree(a1, b1, c1));
	        
	        String a2 = "zelda";
	        String b2 = "apple";
	        String c2 = "banana";
	        System.out.println("Maximum of \"" + a2 + "\", \"" + b2 + "\", \"" + c2 + "\" is \"" + MaximumOfThree(a2, b2, c2) + "\"");


	        
	    }
	        
			

}
