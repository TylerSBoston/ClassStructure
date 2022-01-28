
public class Account {
	int userID; // not needed or used in the example but there in more real world applications
	String user;
	String password;// normally more security here but this will do for now
	double cash;
	
	
	public Account(String newUser, String newPassword)
	{
		user = newUser;
		password = newPassword;
		cash = 0;
	}
	public Account(String newUser, String newPassword, double openingBalance)
	{
		user = newUser;
		password = newPassword;
		cash = openingBalance;
	}
	
	
	public double withdraw(double amount)
	{
		if(cash>amount)
		{
			cash = cash - amount;
			return amount;
		}
		// withdraws all thats left on overdraw.
		else
		{
			amount = cash;
			cash = 0;
			return amount;
		}
	}
	// relies on the security check being outside, this can be moved entirely within the class or be attached to actual security
	public boolean passCheck(String enteredPassword)
	{
		if(enteredPassword.equals(password))
			return true;
		else
			return false;			
	}
	public void deposit(Double inputedCash)
	{
		cash = inputedCash;
	}
	public double viewBalance()
	{
		return cash;
	}
	
	
}
