import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest {
	Account c = new Account();
	

	@Test
	public void testGetId() {
		c.SetId(1122);
	assertEquals("ID number",(long)c.GetId(),(long)1122);
	}
	@Test
	public void testGetBalance() {
		c.SetBalance(20000);
	assertEquals("Balance number",(long)c.GetBalance(),(long)20000);
	}

	@Test
	public void testGetAnnualInterestRate() {
		c.SetAnnualInterestRate(4.5);
	assertEquals("AnnualInterestRate",(long)c.GetAnnualInterestRate(),(long)4.5);
	}
	
	@Test
	public void testWithdraw() {
		c.SetBalance(20000);
		assertEquals("Withdraw",(long)c.Withdraw(2500),(long)17500);
	}

	@Test
	public void testDeposit() {
		c.SetBalance(20000);
		assertEquals("Deposit",(long)c.Deposit(3000.00),(long)23000);
	}
	@Test
	//Overdraw test
	public void InsufficientFundsException() {
		c.SetBalance(20000);
		assertEquals("Exception-Overwithdraw",(long)c.Withdraw(25000),(long)5000);
	}
	

}
