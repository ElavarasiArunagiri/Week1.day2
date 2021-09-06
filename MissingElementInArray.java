package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int startValue = arr[0];
		int stopValue = arr[arr.length - 1];
		
		System.out.println("Program is to identify the missing number in the below list: ");
		for (int a = 0; a < arr.length; a++) 
		{
			System.out.println(arr[a]);
		}
		System.out.println("Answer:");
		for (int j = 0; arr[j] < stopValue; j++) {
			if (startValue != arr[j]) 
			{
				System.out.println(startValue + " is missing");
				break;
			}
			startValue++;

		}

	}

}
