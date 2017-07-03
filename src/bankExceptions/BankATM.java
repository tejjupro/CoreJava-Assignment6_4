 
package bankExceptions; //This java file is inside package named package1 inside src folder.
public class BankATM {
	//Class declaration containing bank ATM details. 
	private int atmId;
	private String bankName;
	private String location;
	private double balance;


		
		public BankATM(int atmId, String bankName, String location, double balance)     //constructor.
		{
			//Initializing class variables by parameters.
			this.atmId = atmId;     
			this.bankName = bankName;
			this.location = location;
			this.balance = balance;
		}
		
		public void withdraw(double amt)  throws BankAtmException       //Withdraw function to withdraw the amount.
		{
			if(balance < 10000.0 || balance < amt)       //Checking weather the withdrawal can be possible or not according to given condition.
			{
				throw new BankAtmException();        //Throwing Exception if withdrawal is not possible.
			}
			else
			{
				balance = balance - amt;          //if withdrawal can be possible then reducing the balance.
				System.out.println("\n\nYou have withdrawn "+amt+" Rs. and your available balance is "+balance+" Rs.");     //Printing the statement.
			}
		}
		
		public void deposit(double amt)     //Depositing the amount. No need to throw exception because deposit is always possible.
		{
			balance = balance + amt;       //Increasing the value of balance.
			System.out.println("\n\nYou have deposited "+amt+" Rs. and available balance is "+balance+" Rs.");     //Printing the statement.
		}
		
		public void displayAtmDetails()           //Function will display the details of ATM.
		{
			//Displaying the details of ATM.
			System.out.println("\nThe ATM Id is "+atmId);
			System.out.println("The bank name of which ATM belongs is "+bankName);
			System.out.println("The location where ATM is situated is "+location);
			System.out.println("The available balance is "+balance);
		}
		
} //End of class