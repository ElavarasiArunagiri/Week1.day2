package week1.day2.assignments;

public class ArmstrongNumberWhileLoop {

	public static void main(String[] args) {
		int num = 153;
		int cal = 0, rem, original;
		original = num;
		while (num!=0) {
			rem = num%10;
			cal = cal +(rem*rem*rem);
			num = num/10;
		}
		
		if(cal == original)
		{
			System.out.println("The number " +original+ " is an Armstrong Number");
		}
		else
		{
			System.out.println("The number " +original+ " is not an Armstrong Number");
		}
	}
}
