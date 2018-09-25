package model;

public class BankAccount {
	private String name;
	private double savings;
	private double checking;
	private double monthlyFee;
	
	
	public BankAccount(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSavings() {
		return savings;
	}


	public void setSavings(double savings) {
		this.savings = savings;
	}


	public double getChecking() {
		return checking;
	}


	public void setChecking(double checking) {
		this.checking = checking;
	}


	public double getMonthlyFee() {
		return monthlyFee;
	}


	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	
	
	

}
