import java.util.Arrays;
/*
 * Neil Dighe
 * April 1 2022
 * Searches.java
 * Contains code for the searches class for Project 2
 */

public class Searches<T extends Comparable<T>>
{	
	private T[] myArray;
	private boolean sorted;
	private int mySearchCounter;
	
	public Searches() //default constructor
	{
		mySearchCounter = 999;
	}
	
	public Searches(T[] input)
	{
		myArray = input;
		mySearchCounter = 0;
	}
	
	
	public int linearSearch(T target) 
	{
		if(myArray == null || myArray.length == 0) //check if data is valid
		{
			throw new NullPointerException("Array does not exist, cannot search");
		}
		
		for(int i = 0; i < myArray.length - 1; i++) //if a match is found
		{
			if(myArray[i].compareTo(target) == 0)
			{
				return i;
			}
			
			mySearchCounter++;
		}
		
		return -1; //you didn't find the value :(
	}
	
	public int binarySearch(T target) throws Exception
	{		
		if(myArray == null || myArray.length == 0) //check if data is valid
		{
			throw new NullPointerException("Array does not exist, cannot search");
		}
		
		if(!sorted())//if the data is not sorted you cannot binary search
		{
			throw new UnsortedException("Array is not sorted, cannot binary search");
		}
		
		int low = 0; 
		int high = myArray.length - 1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2; //find midpoint of array
			T midVal = myArray[mid];
			
			if(target.compareTo(midVal)== 0) //something something change the range appropriately,
											 //I only figured this out after a bunch of guesswork
			{                                //I dunno exactly what's going on here but it works so I don't question it
				return mid;
			}
			else if(target.compareTo(midVal) < 0)
			{
				high = mid - 1;
				mySearchCounter++;
			}
			else if(target.compareTo(midVal) > 0)
			{
				low = mid + 1;
				mySearchCounter++;
			}
		}
		
		return -1; //you didn't find the value :(
	}
	
	public int comparisons() //accessor for the number of comparisons
	{
		return mySearchCounter;
	}
	
	private boolean sorted() //returns true if data is sorted
	{
		for(int i = 1; i < myArray.length; i++ )
		{
			if(myArray[i].compareTo(myArray[i - 1]) < 0) //if the data at any point is unsorted, return false
			{
				return false;
			}
		}
		//if you're here then the data has no issues, and therefore is sorted
		return true;
	}

}
