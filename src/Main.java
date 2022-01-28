import java.util.*;




public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank();
	
	
	
	public static void main(String[] args) {
		
		Room room = new Room();
		room.wallArea();
		
		int userInput = -1;
		
		while (userInput != 0)
		{
			System.out.println("1: room \n 2: bank accounts\n 0: exit\n");
			userInput = InputVerifier.verifyInt(scanner,userInput);
	        switch (userInput) 
	        {
	            case 1:  
	            	
	            	userInput = -1;
	                break;
	            case 2:  
	            	bankHandler();
	        		userInput = -1;
	                break;
	            case 0:  
	                break;
	        }
		}
	}
	
	public static void bankHandler()
	{
		int userInput = -1;
		String user;
    	String password;
    	int amount;
		while (userInput != 0)
		{
			System.out.println(" 1: Create account\n 2: Deposit\n 3: Withdraw\n 4: View Balance\n 0:Go Back");
			userInput = InputVerifier.verifyInt(scanner,userInput);
	        switch (userInput) 
	        {
	        	
	            case 1:  
	            	System.out.println("Enter user");
	            	user = scanner.nextLine();
	            	System.out.println("Enter password");
	            	password = scanner.nextLine();
	            	
	            	bank.createAccount(user, password);
	            	userInput = -1;
	                break;
	            case 2: 
	            	System.out.println("Enter user");
	            	user = scanner.nextLine();
	            	System.out.println("Enter password");
	            	password = scanner.nextLine();
	            	System.out.println("Enter Amount");
	            	amount = InputVerifier.verifyInt(scanner);
	            	bank.deposit(user, password, amount);
	        		userInput = -1;
	                break;
	            case 3: 
	            	double withdrawn;
	            	System.out.println("Enter user");
	            	user = scanner.nextLine();
	            	System.out.println("Enter password");
	            	password = scanner.nextLine();
	            	System.out.println("Enter Amount");
	            	amount = InputVerifier.verifyInt(scanner);
	            	withdrawn = bank.withdraw(user, password, amount);
	            	if(withdrawn != amount)
	            	{
	            		System.out.println("insufficiant funds, withdrawing remainder");
	            	}
	        		userInput = -1;
	                break;
	            case 4: 
	            	double balance;
	            	System.out.println("Enter user");
	            	user = scanner.nextLine();
	            	System.out.println("Enter password");
	            	password = scanner.nextLine();
	            	balance = bank.viewBalance(user, password);
	            	System.out.println("Balance: " + balance);
					userInput = -1;
				    break;
	            case 0:  
	                break;
	        }
		}
	}

}
