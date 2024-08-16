package assignment;

public class EmployeeTest {

	public static void main(String[] args) {
 try {
	 Employee emp1 = new Employee(111, "Arjun", "Manager", 1000);
	 //emp1.calculateHRA();//can be written in constructor so no need to call every time after object is created
	 emp1.printDetails();
	 
	 System.out.println();
	 
	 Employee emp2 = new Employee(112, "Abhi", "Officer", 2000);
	// emp2.calculateHRA();
	 emp2.printDetails();
	 
	 System.out.println();
	 
	 Employee emp3 = new Employee(113, "Karan", "Clerk", 500);
	// emp3.calculateHRA();
	 emp3.printDetails();


  }catch(LowSalException e){
	 System.out.println(e.getMessage());
 }
		
	}

}
