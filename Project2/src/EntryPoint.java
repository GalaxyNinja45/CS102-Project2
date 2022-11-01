import java.util.Arrays;
public class EntryPoint {
	
	public static void recursionTester()
	{
		for(int z = 0; z < 21; z++) 
		{
			System.out.println("Now testing Fibonacci Sequence " + z);
			Fibonacci test = new Fibonacci(z);
			System.out.println("Fibonacci value = " + test.last());
			System.out.println(test.toString());
			System.out.println("[--------------------------------] \n");
		}

	}
	
	public static void searchTester() throws Exception
	{
		Integer[] sorted = {1, 2, 3, 4, 5};
		Integer[] unsorted = {2, 1, 3, 4, 5};
		
		Searches<Integer> searcher = new Searches<Integer>(sorted);
		Searches<Integer> searcher2 = new Searches<Integer>(unsorted);
		
		System.out.println("Testing searcher");
		System.out.println("Searching 4 " + searcher.linearSearch(4));
		System.out.println("Total comparisons made = " + searcher.comparisons());
		System.out.println("Searching 4 " + searcher.binarySearch(4));
		System.out.println("Total comparisons made = " + searcher.comparisons());
		System.out.println("Searching 7 " + searcher.linearSearch(7));
		System.out.println("Total comparisons made = " + searcher.comparisons());
		System.out.println("Searching 7 " + searcher.binarySearch(7));
		System.out.println("Total comparisons made = " + searcher.comparisons());
		
		System.out.println("-----------------------");
		
		System.out.println("Testing searcher2");
		System.out.println(searcher2.linearSearch(4));
		System.out.println("Total comparisons made = " + searcher2.comparisons());
		System.out.println("The following should fail");
		System.out.println(searcher2.binarySearch(4));
		System.out.println(searcher2.comparisons());
	}
	
	public static void main(String args[]) throws Exception 
	{
		recursionTester();
		
		searchTester();
		
	}
}
