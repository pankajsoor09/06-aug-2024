package exception_handling;

public class ThrowsDemo {

	public static void main(String[] args) {
		ThrowsDemo demo = new ThrowsDemo();
		try {
		demo.division(10, 0);//static
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is N.D in main");
		}
		System.out.println("End of Application");
	}
		  void division (int num1, int num2)throws ArithmeticException{// declare exception
			   System.out.println("Division Result"+num1/num2);//caller method will handle exception// exception on the line so it will not print hi 
			   System.out.println("Hi");
			   }  
	}


