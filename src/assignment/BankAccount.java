package assignment;

public class BankAccount {

	public int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException  {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
		
		if(accType.equalsIgnoreCase("Savings") && balance < 1000) {
			throw new LowBalanceException("Saving account cannot be created.Minimum balance required is Rs.1000");
		}else if(accType.equalsIgnoreCase("Current") && balance < 5000) {
			throw new LowBalanceException("Current account cannot be created.Minimum balance required is Rs.5000");
		}
	}
	public void displayAccDetails() {
		
		System.out.println("Customer Name: " + custName);
		System.out.println("Account Number: " + accNo);
		System.out.println("Account Type: " + accType);
		
	}

	void deposit(float amt) throws NegativeAmountException {
		if (amt < 0) {
			throw new NegativeAmountException(" Negative amount cannot be deposited ");
		}
		balance = balance + amt;
		System.out.println(" Deposited amount : Rs." + amt + "\n Balance after amount deposited : Rs." + balance);

	}

	void withdraw(float amt) throws NegativeAmountException, InsufficientFundsException {
		if (amt <= 0) {
			throw new NegativeAmountException(" Negative amount cannot be withdraw ");
		}
		if (accType.equalsIgnoreCase("Savings") && (balance - amt) < 1000) {
			throw new InsufficientFundsException("Insufficient funds. Minimum balance of savings account must be Rs. 1000.");
		} else if (accType.equalsIgnoreCase("Current") && (balance - amt) < 5000) {
			throw new InsufficientFundsException("Insufficient funds. Minimum balance of current account must be Rs. 5000.");
		}
		balance = balance - amt;
		System.out.println(" Withdraw amount : Rs." + amt + "\n Balance after amount withdraw : Rs." + balance);
	}

	float getBalance() throws LowBalanceException {
		if (accType.equalsIgnoreCase("Savings") && balance < 1000) {
			throw new LowBalanceException(" ");
		} else if (accType.equalsIgnoreCase("Current") && balance < 5000) {
			throw new LowBalanceException(" ");
		}
		return balance;
	}
	      

}
