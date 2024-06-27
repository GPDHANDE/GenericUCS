package org.genericus;

public class MaxOfThree 
{
		private static float a;
		private static float b;
		private static float c;
		
		
//		 public static Float MaximumOfThree(float num1,float num2,float num3)
//		 {
//			float c = Math.max(Math.max(num1, num2), num3);
//			return c;
//		 }
		
		public static Float MaximumOfThree(Float a, Float b, Float c) {
	        Float max = a;
	        if (b.compareTo(max) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        return max;
	    }
		public static void main(String[] args) 
		{
	        // Test case 1: Max number at 1st position
		    a=10.0f;
		    b=5.15f;
		    c=3.41f;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));

	        // Test case 2: Max number at 2nd position
	        a = 5.15f;
	        b = 10.0f;
	        c = 3.41f;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));

	        // Test case 3: Max number at 3rd position
	        a = 5.15f;
	        b = 3.41f;
	        c = 10.0f;
	        System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + MaximumOfThree(a, b, c));
			
		}

}
