package org.genericus;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOfThree<T extends Comparable<T>>
{
	
	public static <T extends Comparable <T>> T Max(T... elements)
	{
		if(elements == null || elements.length==0)
		{
			throw new IllegalArgumentException("At least one element is required");
		}
		Arrays.sort(elements);
		
		return elements[elements.length-1];
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
		System.out.println("Maximum of int is "+Max(10,20,30,40,50));
		
		//Test case 2: Max float
		System.out.println("Maximum of float is "+Max(10.34f,73.2f,23.4f,43.7f,54.90f));
		


        // Test case 3: Max string
      
		String[] words = {"apple", "banana", "pear", "kiwi"};
        System.out.println("Maximum of String is "+Max(words));
        
    }
	        
			

}
