package model;

public class AccountLogic {
	
	public void assignMonthlyFee(BankAccount account) {
		double monthlyFee = 0.0;
		if (account.getSavings() > 0.0) {
			monthlyFee = monthlyFee + 25.00;
			}
		if (account.getChecking() > 0.0) {
			monthlyFee = monthlyFee + 25.00;
		};
		account.setMonthlyFee(monthlyFee);
	}
	
	public double assignToSavings(BankAccount account, double deposit) {
		double result;
		result = account.getSavings() + deposit;
		return result;
	}
	
	public double assignToChecking(BankAccount account, double deposit) {
		double result = account.getChecking() + deposit;
		return result;
	}
	
	public double totalFunds(BankAccount account) {
		double result = account.getChecking() + account.getSavings();
		return result;
	}

	
	public double withDrawFromChecking(BankAccount account, double withdraw) {
		double result = 0; 
		if (withdraw > account.getChecking()) {
			System.out.println("Insufficient funds to withdraw.");
		} else {
			result = account.getChecking() - withdraw;
		}
		return result;
	}
	
	
}