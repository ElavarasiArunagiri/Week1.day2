package week1.day2.assignments;

import java.util.Arrays;

public class FrequenciesOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		Arrays.sort(arr);
		int[] arr1 = arr;
		int[] vist = arr;
		int lenarr = arr.length;
		
		System.out.println("There are " + lenarr + " numbers in array.");
		for (int a = 0; a < lenarr; a++) 
		{
			System.out.println(arr[a]);
		}
		System.out.println("The frequencies of those:");
	
		for (int i = 0; (i < lenarr); i++) 
		{
			if (vist[i] != -1)
			{
				int count = 1;
				for (int j = i + 1; j < lenarr; j++) 
				{
					if ((vist[j] != -1) && (arr1[j] == arr[i]))
					{
						count++;
						vist[j] = -1;
					}
				}
				System.out.println(arr[i] + " occured " + count + " times");
			}
		}

	}

}
