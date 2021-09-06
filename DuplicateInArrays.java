package week1.day2.assignments;

import java.util.Arrays;

public class DuplicateInArrays {

	public static void main(String[] args) {
		int[] arr = { 14,12,13,11,15,14,18,16,17,19,18,17,20 };
		Arrays.sort(arr);
		int[] arr1 = arr;
		int lenarr = arr.length;
		
		System.out.println("Program is to identify the duplicated numbers in the below list: ");
		for (int a = 0; a < lenarr; a++) 
		{
			System.out.println(arr[a]);
		}
		System.out.println("****Findings****");
		System.out.println("Listed below are the numbers that are duplicated :");
	
		for (int i = 0; (i < lenarr); i++) 
		{
				for (int j = i + 1; j < lenarr; j++) 
				{
					if (arr1[j] == arr[i])
					{
						System.out.println(arr[i]);
						break;
						// Usage of "break" jumping statement under j loop.
					}
				}
		}

	}

}
