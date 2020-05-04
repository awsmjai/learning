package com.jai.practice.ds.array;

public class ArrayMain
{
	public static void main(String[] args)
	{
		System.out.println("ArrayMain");
		print2DArray();
	}

	public static void print2DArray()
	{
		int[][] arr1 = {{1,2,5,6}, {3,4,7,8}, {5,6,9,10}};
		for( int i = 0; i < 3; i++ )
		{
			for( int j = 0; j < 4; j++ )
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
