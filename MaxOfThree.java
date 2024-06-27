package org.genericus;

public class MaxOfThree 
{
		private static String a;
		private static String b;
		private static String c;
		
		
//		 public static Float MaximumOfThree(float num1,float num2,float num3)
//		 {
//			float c = Math.max(Math.max(num1, num2), num3);
//			return c;
//		 }
		
		public static String MaximumOfThreeString(String a, String b, String c) 
		{
	       String max = a;
	       if(b.compareTo(max)>0)
	       {
	    	   max =b;
	       }
	       if(c.compareTo(max)>0)
	       {
	    	   max = c;
	       }
	       return max;   
	    }
		
		
		public static void main(String[] args) 
		{
			// Test case 1: Max string at 1st position
	        String a = "Peach";
	        String b = "Apple";
	        String c = "Banana";
	        System.out.println("Maximum of \"" + a + "\", \"" + b + "\", \"" + c + "\" is \"" + MaximumOfThreeString(a, b, c) + "\"");

	        // Test case 2: Max string at 2nd position
	        a = "Apple";
	        b = "Peach";
	        c = "Banana";
	        System.out.println("Maximum of \"" + a + "\", \"" + b + "\", \"" + c + "\" is \"" + MaximumOfThreeString(a, b, c) + "\"");

	        // Test case 3: Max string at 3rd position
	        a = "Apple";
	        b = "Banana";
	        c = "Peach";
	        System.out.println("Maximum of \"" + a + "\", \"" + b + "\", \"" + c + "\" is \"" + MaximumOfThreeString(a, b, c) + "\"");
			
		}

}
