package exception_handling;

public class DivisionDemo {

	public static void main(String[] args) {
System.out.println("Hello");
		try {
			int num1 = Integer.parseInt(args[0]);//if we get exception it will get out of try and find a suitable catch
			int num2 = Integer.parseInt(args[1]);
			System.out.println("Division Result : " + (num1 / num2));
		} catch (ArithmeticException e) {// e is variable here to store above line
			System.out.println("Division By Zero not Possible");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass 2 command line arguments");
		}
		catch(NumberFormatException e){
			System.out.println("Please pass 2 proper numbers from command line");
		}
		catch(RuntimeException e) {
		// when multiple catch block for single try .you have to write catch block for handling sub type first and then super type
			//System.out.println("check");
		}
		System.out.println("End of Application");

	}
	
}