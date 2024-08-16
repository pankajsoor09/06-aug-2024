package exception_handling;

public class TestThrow {

	static void division(int num1, int num2) {
		if (num2 == 0) {
			try {
				throw new ArithmeticException();// only one exception not like throws
				// System.out.println("HI");// it will never execute ..after throw no instant statement
				
			} catch (ArithmeticException e) {
				System.out.println("Division by zero not possible");
			}
			System.out.println("Hi");
		} else {
			System.out.println("Division Result : " + (num1 / num2));
		}
		System.out.println("End of Division");
	}

	public static void main(String[] args) {
		try {
			division(10, 0);
		} catch (ArithmeticException e) {//if division method do not have try catch then this try will be used
			System.out.println("Division by zero not possible in main");
		}
		System.out.println("End of application");
	}

}
