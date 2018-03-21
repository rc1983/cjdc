import java.util.Scanner;

public class BAMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		BankAccount ba = new BankAccount();
		
		System.out.println("Enter the name of the account holder: ");
		ba.setName(input.nextLine());
		System.out.println("Name of the account holder: " + ba.getName());
		
		System.out.println("Enter the email address of the account holder: ");
		ba.setEmail(input.nextLine());
		System.out.println("Email address of the account holder: " + ba.getEmail());
		
		System.out.println("Enter the account number: ");
		ba.setAccountNnumber(input.nextInt());
		System.out.println("Account number: " + ba.getAccountNumber());
		
		System.out.println("Enter the balance: ");
		ba.setBalance(input.nextDouble());
		System.out.println("Balance is: " + ba.getBalance());
		
		System.out.println("Enter the phone number: ");
		ba.setPhoneNo(input.next());
		System.out.println("The phone number is: " + ba.getPhoneNo());
		
		System.out.println("Deposit the following amount: ");
		ba.deposit(input.nextDouble());
		
		System.out.println("Withdraw the following amount: ");
		ba.withdraw(input.nextDouble());
		
		System.out.println("\n********************");
		System.out.println("Now calling the constructor");
		
		BankAccount ba2 = new BankAccount(9999, 123.45, "patch2", "patch2@patch.com", "1234567890");
		System.out.println("Account number : " + ba2.getAccountNumber());
		System.out.println("Balance: " + ba2.getBalance());
		System.out.println("Name: " + ba2.getName());
		System.out.println("Email: " + ba2.getEmail());
		System.out.println("Phone number: " + ba2.getPhoneNo());
		
		System.out.println("\n******************\n");
		BankAccount ba3 = new BankAccount();
		System.out.println("Account number : " + ba3.getAccountNumber());
		System.out.println("Balance: " + ba3.getBalance());
		System.out.println("Name: " + ba3.getName());
		System.out.println("Email: " + ba3.getEmail());
		System.out.println("Phone number: " + ba3.getPhoneNo());
		
		System.out.println("\n******************\n");
		BankAccount ba4 = new BankAccount("patch4", "alskdjf@laskdjf", "999999999");
		System.out.println("Account number : " + ba4.getAccountNumber());
		System.out.println("Balance: " + ba4.getBalance());
		System.out.println("Name: " + ba4.getName());
		System.out.println("Email: " + ba4.getEmail());
		System.out.println("Phone number: " + ba4.getPhoneNo());
		
		
	}

}
