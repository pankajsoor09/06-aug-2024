package assignment;

public class EmpTest {

	public static void main(String[] args) {
		try {
			Emp em1 = new Emp(101, "Raj", "manager", 10000);
			em1.calcHRA();
			em1.displayDetails();
			System.out.println();
			Emp em2 = new Emp(102, "Ichigo", "officer", 7000);
			em2.calcHRA();
			em2.displayDetails();
			System.out.println();
			Emp em3 = new Emp(103, "Divya", "clerk", 5000);
			em3.calcHRA();
			em3.displayDetails();
		} catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
	}

}
