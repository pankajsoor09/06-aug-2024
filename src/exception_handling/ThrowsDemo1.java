package exception_handling;

import java.io.IOException;

public class ThrowsDemo1 {

	public static void main(String[] args) throws IOException {
		ThrowsDemo1 demo = new ThrowsDemo1();
		try {
			demo.division(10, 0);// static//so throws is used to handle exception in main method
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is N.D in main");
		}
		System.out.println("End of Application");
	}

	void division(int num1, int num2) throws ArithmeticException, IOException {// declare exception//here IOE is checked Exception
		try {
																				
			System.out.println("Division Result" + (num1 / num2));// caller method will handle exception
																	
		} catch (ArithmeticException e) {
			System.out.println("Division by zero not possible");// the exception is handled here ..so it will not go to main
		}
		
		System.out.println("Hi");//here hi will be printed because it is handled in caller method//and end of application will be printed
	}
}

//if any method declaring (throws clause )any checked exception then compiler will force you to either handle it (try catch)or declare it in caller method