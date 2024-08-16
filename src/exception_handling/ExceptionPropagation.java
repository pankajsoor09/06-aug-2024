package exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {

		ExceptionPropagation obj = new ExceptionPropagation();// for unchecked and if it was checked then need to handle and declare
		try {
			obj.division(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Division By zero not possible in main");
		}
	}

	void division(int num1, int num2) {
		System.out.println("Division Result : " + (num1 / num2));
	}

}
