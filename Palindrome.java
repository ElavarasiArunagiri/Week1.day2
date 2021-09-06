package week1.day2.assignments;

public class Palindrome {

	public int reverse(int num) 
	{
		int remainder, reverse = 0;

		while (num != 0) 
		{
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) 
	{
		int num = 454;
		int temp = num;
		System.out.println("Number = " + num);
		//assigning an object(toreverse) to access a method(reverse) within the class
		Palindrome toreverse = new Palindrome();
		int reverse1 = toreverse.reverse(num);
		System.out.println("By reversing we get = " + reverse1);
		
		if (temp == reverse1)
			System.out.println("The number " + temp + " is a Palindrome number");
		else
			System.out.println("The number " + temp + " is not a Palindrome number");

	}
}
