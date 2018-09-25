package account;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import model.AccountLogic;
import model.BankAccount;

public class TestAccountLogic {
	AccountLogic accLogic = new AccountLogic();
	BankAccount account = new BankAccount("John");
	static Scanner in = new Scanner(System.in);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAssignMonthlyFee() {
		account.setChecking(100.00);
		account.setSavings(100.00);
		accLogic.assignMonthlyFee(account);
		assertEquals(50.00, account.getMonthlyFee(), 0.0);
	}
	
	@Test
	public void testAssignSavings() {
		account.setSavings(100.00);
		double deposit = 10.00;
		double newSavings = accLogic.assignToSavings(account, deposit);
		assertTrue(newSavings == 110.00);
	}

	@Test
	public void testAssignChecking() {
		account.setChecking(100.00);
		double deposit = 10.00;
		double newChecking = accLogic.assignToChecking(account, deposit);
		assertTrue(newChecking == 110.00);
	}
	
	@Test
	public void testTotalFunds() {
		account.setChecking(50.00);
		account.setSavings(50.00);
		double totalFunds = accLogic.totalFunds(account);
		assertTrue(100.00 == totalFunds);
		
	}
	
	@Test
	public void testWithDrawFromChecking() {
		account.setChecking(100.00);
		double withdraw = 7.0; 
		double newChecking = accLogic.withDrawFromChecking(account, withdraw);
		assertTrue(newChecking == 93.00);
		
		
	}
	
	
}
