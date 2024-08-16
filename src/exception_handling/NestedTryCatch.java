package exception_handling;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int num1 = Integer.parseInt(args[0]);// if we get exception it will get out of try and find a suitable catch
			int num2 = Integer.parseInt(args[1]);

			try {
				System.out.println("Division Result : " + (num1 / num2));
			} // catch (ArithmeticException e) {// e is variable here to store above line
				// System.out.println("Division By Zero not Possible");
				// }

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Please pass 2 command line arguments");

			} finally {
				System.out.println("finally block execute always");
			}
			System.out.println("Hi");

		}

		catch (ArithmeticException e) {// e is variable here to store above line
			System.out.println("Division By Zero not Possible outer catch");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass 2 command line arguments outer catch");

		}

		catch (NumberFormatException e) {
			System.out.println("Please pass 2 proper numbers from command line");

		} catch (RuntimeException e) {
			// when multiple catch block for single try .you have to write catch block for
			// handling sub type first and then super type
			// System.out.println("check");

		} finally {
			System.out.println("outer finally ");
			int num1 = 2;
			int num2 = 0;// if org num1 and num2 are declared in try then need to re initialize local
							// variables
							// if command line args were pass before try then no need to declare local
							// variables
			try {
				System.out.println("try in outer finally : "+num1 / num2);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException division by zero N.D ");
			}
		}
		System.out.println("End of Application");

	}

}