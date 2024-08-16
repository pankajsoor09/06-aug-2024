package assignment;

public class CalcAverage1 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println("Entered num is : " + num);

			CalcAverage1 calc = new CalcAverage1();
			double average = calc.avgFirstN(num);

			System.out.println("Average of the first " + num + " natural numbers is: " + average);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid integer.");
		} catch (IllegalArgumentException e) {
			System.out.println("Enter a positive natural number greater than 0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Pass only one natural number");
			
		}
	}

	public double avgFirstN(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Enter a positive natural number greater than 0.");
		}

		double sum = n * (n + 1) / 2.; // Calculate sum of first N natural numbers sn = n*(n+1)/2
		return sum / n; // Return the average
	}
}
