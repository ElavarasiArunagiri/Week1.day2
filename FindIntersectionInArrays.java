package week1.day2.assignments;

public class FindIntersectionInArrays {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int[] arr1 = {1,2,8,4,9,7};
		System.out.println("Listed below are the intersecting numbers of {3,2,11,4,6,7} and {1,2,8,4,9,7}:");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if (arr1[j] == arr[i])
				{
					System.out.println(arr[i]);
					
				}
			}
			
		}

	
	}

}
