package bankExceptions; //This java file is inside package named package1 inside src folder.
public class BankAtmException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Class declaration which is the child class of inbuilt class Exception.  
	
		public String toString()         //function to return string of Exception.
		{
			return "Generating BankATMException because either balance is less than 10000 or withdrawl amount is greater than balance available.";
					//returning String denoting that the Exception is happened.
		}
		
}//End of class