package dev.jaib.practice.ds.recursion;

public class BinarySearchUsingRecursion
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		final int number = findNumber(0, arr.length - 1, arr, 7);
		System.out.println("number: " + number);
	}

	public static int findNumber(int start, int end, int[] arr, int number)
	{
		int mid = (start + end) / 2;
		if( start == end )
		{
			if( arr[start] == number )
			{
				return start;
			}
			else
			{
				return -1;
			}
		}

		if( arr[mid] == number )
		{
			return mid;
		}
		else if( number < arr[mid] )
		{
			end = mid - 1;
		}
		else
		{
			start = mid + 1;
		}
		return findNumber(start, end, arr, number);
	}
}

