package org.genericus;

public class MaxOfThree 
{
		private static Integer num1;
		private static Integer num2;
		private static Integer num3;
		
		
		 public static Integer MaximumOfThree(Integer num1,Integer num2,Integer num3)
		 {
			Integer max = num1;
			if(num2.compareTo(max)>0)
			{
				max = num2;
			}
			else if(num3.compareTo(max)>0)
			{
				max = num3;
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
