package assignment;

public class Emp {

	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;

	public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	
		if (basic < 500) {
			throw new LowSalException("Basic cannot be less than 500");
		}
	}

	void displayDetails() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Designation : " + designation);
		System.out.println("Basic : " + basic);
		System.out.println("HRA : " + hra);
	}

	void calcHRA() {

		switch (designation.toLowerCase()) {
		case "manager":
			this.hra = basic * 0.10;
			break;
		case "officer":
			this.hra = basic * 0.12;
			break;
		case "clerk":
			this.hra = basic * 0.05;
			break;
		default:
			this.hra = 0;// HRA set to 0 if designation is unknown
			break;
		}

	}

}
