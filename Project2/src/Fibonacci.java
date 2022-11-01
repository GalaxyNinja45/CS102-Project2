import java.util.Arrays;

/*
 * Neil Dighe
 * March 29 2022
 * Fibonacci.java
 * Contains code for Fibonacci class for Project 2
 * 
 */
public class Fibonacci 
{
	private int myFibIndex; //not used, but I'm scared the program will break if I delete it so it sits here now and provides moral support
	private int[] myFibArray;
	
	public Fibonacci() //default constructor
	{
		myFibIndex = 1;
	}
	
	public Fibonacci(int x) //constructor with a given value
	{
		myFibIndex = x; //not used, but I'm scared the program will break if I delete it so it sits here now and provides moral support
		myFibArray = new int[x + 1];	
		
		//populate the array 
		for(int i = 0; i <= x; i++) 
		{
			myFibArray[i] = giveInt(i);
		}
		
	}
	
	public int giveInt(int x) //recursively generate a Fibonacci number, the constructor will populate the array
	{
		if(x == 0) //Fibonacci sequence always starts with 0 and 1
		{
			return 0;
		}
		
		if(x == 1) 
		{
			return 1;
		}
		
		return giveInt(x - 1) + giveInt(x - 2); //outside of the first two values, sequence adds the previous 2 numbers to get the next value
	}

	public int last() //returns the appropriate Fibonacci number
	{
		return myFibArray[myFibArray.length - 1]; //should just be at the end of the array
	}
	
	public String toString() //prints the entire Fibonacci sequence
	{
		return Arrays.toString(myFibArray);
	}
}
