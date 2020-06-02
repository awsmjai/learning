package dev.jaib.practice.ds.recursion;

public class FindBiggestNumberUsingRecursion
{
	private static int biggestNumber = Integer.MIN_VALUE;

	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int[] arr = {5,2,17,8,1,12,0,3};
		final int biggestNumberUsingRecursion = findBiggestNumberUsingRecursion(arr, arr.length - 1);
		System.out.println("biggestNumber: "+ biggestNumberUsingRecursion);
	}

	public static int findBiggestNumberUsingRecursion(int[] arr, int n)
	{
		if( n < 0 )
		{
			return biggestNumber;
		}

		if( arr[n] > biggestNumber )
		{
			biggestNumber = arr[n];
		}

		return findBiggestNumberUsingRecursion(arr, n - 1);

	}
}
