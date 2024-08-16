package assignment;

public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;

	public Employee(int empId, String empName, String designation, double basic) throws LowSalException {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;	
		this.hra=calculateHRA();
		//this.hra=calculateHRA();
		// this.calculateHRA();//method is called in the constructor so that the HRA is
		                      // calculated when the Employee object is created.
		if (basic < 500) {
			throw new LowSalException(" Basic cannot be less than 500");
		}
	}

	void printDetails() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Designation : " + designation);
		System.out.println("Basic : Rs." + basic);
		System.out.println("HRA : Rs." + hra);
	}

//	void calculateHRA() {		//this.hra=calculateHRA(); can be removed
//		if (designation.equalsIgnoreCase("Manager")) {
//			this.hra = this.basic * 0.10; // 10 % (percentage)=10/100 =1/10 = .1
//		} else if (designation.equalsIgnoreCase("Officer")) {
//			this.hra = this.basic * 0.12; // 12%
//		} else if (designation.equalsIgnoreCase("Clerk")) {
//			this.hra = this.basic * 0.05; // 5%
//		}
//	}
	
	
	double calculateHRA() {
		if (designation.equalsIgnoreCase("Manager")) {
			return basic * 0.10; // 10 % (percentage)=10/100 =1/10 = .1
		} else if (designation.equalsIgnoreCase("Officer")) {
			return basic * 0.12; // 12%
		} else if (designation.equalsIgnoreCase("Clerk")) {
			return basic * 0.05; // 5%
		}
		return basic;
	}

}
