package org.genericus;

public class MaxOfThree<T extends Comparable<T>>
{
	private  T a;
	private T b;
	private T c;
	
	
		
	public MaxOfThree(T a, T b, T c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public T testMaximum()
	{
		return testMaximum(a,b,c);
	}
	
	public static <T extends Comparable > T testMaximum(T a,T b,T c)
	{
		T max = a;
		if(b.compareTo(max)>0)
		{
			max = b;
		}
		if(c.compareTo(max)>0)
		{
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		//Test case 1: Max int
		MaxOfThree<Integer> m = new MaxOfThree<Integer>(87, 113, 191);
		System.out.println("Maximum of " + m.a + ", " + m.b + ", " + m.c + " is "+m.testMaximum());
		
		//Test case 2: Max float
		MaxOfThree<Float> floatFinder = new MaxOfThree<>(10.5f, 5.2f, 3.1f);
        System.out.println("Maximum of " + floatFinder.a + ", " + floatFinder.b + ", " + floatFinder.c + " is " + floatFinder.testMaximum());

        // Test case 3: Max string
        MaxOfThree<String> stringFinder = new MaxOfThree<>("zelda", "apple", "banana");
        System.out.println("Maximum of \"" + stringFinder.a + "\", \"" + stringFinder.b + "\", \"" + stringFinder.c + "\" is \"" + stringFinder.testMaximum() + "\"");
		
    }
	        
			

}
