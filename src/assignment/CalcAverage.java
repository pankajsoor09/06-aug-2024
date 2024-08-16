package assignment;

public class CalcAverage {

	public static void main(String[] args) {
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter only one natural number");
		} catch (NumberFormatException e) {
			System.out.println("Enter number in digit format");
		}
		System.out.println("Entered natural number is : " + num);
		CalcAverage calc = new CalcAverage();// ExceptionPropagation
		double average = calc.avgFirstN(num);
		System.out.println();
		if (num != 0) {
			System.out.println("The average of first " + num + " natural numbers : " + average);
		}
	}

	public double avgFirstN(double num) {// need to take double .if int is taken the value after decimal is not printed
		double sum = 0;

		if (num <= 0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				System.out.println("Enter natural numbers only");
			}

		} else {
			sum = ((num * (num + 1) / 2)) / num;// sn = n*(n+1)/2  | sum of n num and average 
			// return (sum *num)/num;
		}
		return sum; // returns average

	}

}