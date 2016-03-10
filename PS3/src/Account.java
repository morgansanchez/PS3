import java.util.Date;


public class Account {
	//A private integer data field named id, balance, annualInterestRate, withdraw, 
	// deposit for the account (default 0).
	//private Date data field
	private int Id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double withdraw = 0;
	private double deposit = 0;
	private Date dateCreated;

	//	A no-arg constructor that creates a default account
	public Account(){
	 }
	//A constructor that creates an account with the specified id and initial balance.
	public Account(int specificID, double initialBalance, double newWithdraw, double newDeposit){
		this.Id = specificID;
		this.balance = initialBalance;
		this.withdraw = newWithdraw;
		this.deposit = newDeposit;
	
	}
	//The accessor and mutator methods for id, balance, and annualInterestRate. 
	public int SetId(int SpecificID){
		return this.Id = SpecificID;
	}
	//Sets balance
	public double SetBalance(double newbalance){
		return this.balance = newbalance;
	}
	//Sets annualInterestRate
	public double SetAnnualInterestRate(double NewAnnualInterestRate){
		return this.annualInterestRate = NewAnnualInterestRate;
	}
	//Sets date
	public Date SetdateCreated(){
		return dateCreated;
	}
	
	public double SetWithdraw(double newWithdraw){
		return this.withdraw = newWithdraw;
	}
	
	public double SetDeposit(double newDeposit){
		return this.deposit = newDeposit;
	}
	
	//accessor  method for Id
	public int GetId(){
		return this.Id;
	}
	//accessor  method for balance
	public double GetBalance(){
		return this.balance;
	}
	//accessor method for AnnualInterestRate
	public double GetAnnualInterestRate(){
		return this.annualInterestRate;
	}
	//method for MonthlyInterestRate
	double GetMonthlyInterestRate(){
		return balance * (annualInterestRate / 1200) ;
		
	}
	//method for Withdraw
	double Withdraw(double newWithdraw){
		return balance -=  newWithdraw;

	}
	//method for Deposit
	double Deposit(double newDeposit){
		return balance += newDeposit  ;

	}

	//Exception for overdraw
	public class InsufficientFundsException extends Exception
	{
	   private double Withdraw;
	   /**
	    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
	    * @param amount
	    */
	   public InsufficientFundsException(double Withdraw)
	   {
	      this.Withdraw = Withdraw;
	   } 
	   public double GetBalance()
	   {
	      return Withdraw;
	   }
	}
}

