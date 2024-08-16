package assignment;

public class BankAccountTest  {
	public static void main(String[] args) throws LowBalanceException {

		try {
			BankAccount savingAcc = new BankAccount(50004984, "Raj", "Savings", 1000f);
			savingAcc.displayAccDetails();
			savingAcc.getBalance();
			savingAcc.deposit(450);
			savingAcc.withdraw(230);
			
			System.out.println();

			BankAccount currentAcc = new BankAccount(7057357, "Shiv", "Current", 5000f);
			currentAcc.displayAccDetails();
			currentAcc.getBalance();
			currentAcc.deposit(9081);
			currentAcc.withdraw(60);

		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
