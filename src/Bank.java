import java.util.*;

// can use more complexity for actual banking but only using Bank here
public class Bank {
	
	 HashMap<String, Account> accounts = new HashMap<String, Account>();
	 
	 public void createAccount(String user, String password)
	 {
		 accounts.put(user, new Account(user,password));
		 System.out.println("account Created");
	 }
	 public void createAccount(String user, String password, double cash)
	 {
		 accounts.put(user, new Account(user,password,cash));
		 System.out.println("account Created");
	 }
	 public double withdraw(String user, String password, double cash)
	 {
		 // need to test if this needs a null check;
		 if(accounts.get(user).passCheck(password))
		 {
			 // extra logic can be added for overdraw
			 return accounts.get(user).withdraw(cash);
		 }
		 else
		 {
			 System.out.println("invalid user or password");
			 return 0.0;
		 }
	 }
	 public double viewBalance(String user, String password)
	 {
		 if(accounts.get(user).passCheck(password))
		 {
			 return accounts.get(user).viewBalance();
		 }
		 else
		 {
			 System.out.println("invalid user or password");
			 return 0.0;
		 }
	 }
	 public void deposit(String user, String password, double cash)
	 {
		 if(accounts.get(user).passCheck(password))
		 {
			 accounts.get(user).deposit(cash);
			 System.out.println("cash deposited successfully");
		 }
		 else
		 {
			 System.out.println("invalid user or password");
		 }
	 }

}

