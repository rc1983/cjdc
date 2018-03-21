/**
 * This class will validate input from the user
 * @author Patch
 *
 */


public class InputValidation
{
	/**
	 * If the phone number is valid, the method returns true, else false
	 * 
	 * @param userInput
	 * @return
	 */
	public static boolean validPhoneNumber(String userInput)
	{
		boolean isValid = false;
		
		if (userInput.length() < 10 || userInput.length() > 10)
		{
			isValid = false;
		}
		
		else
		{
//			Easy way to check if a string contains numbers
			for (char c : userInput.toCharArray())
			{
				if (!Character.isDigit(c))
				{
					isValid = false;
				}
				else
				{
					isValid = true;
				}
			}
		}
		
		return isValid;
	}
	
	public static boolean validTransmission(String transmissionType)
	{
		boolean isValid = false;
		
		if ((transmissionType.equalsIgnoreCase("manual")) || transmissionType.equalsIgnoreCase("auto") || transmissionType.equalsIgnoreCase("m") || transmissionType.equalsIgnoreCase("a"))
		{
			isValid = true;
		}
		
		else
		{
			isValid = false;
		}
		
		return isValid;
	}
}
