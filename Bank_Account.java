import java.util.Scanner;
class Bank_Account{
	int accountNo, accountBalance;
	String userName, email, accountType;
	void getAccountDetails(){
		System.out.println("Set accountNo, accountBalance, userName, email and accountType");
		Scanner scan =new Scanner(System.in);
		accountNo=scan.nextInt();
		accountBalance=scan.nextInt();
		userName=scan.next();
		email=scan.next();
		accountType=scan.next();
		scan.close();
	}
	void displayAccountDetails(){
		System.out.println("Account no is "+accountNo+"\nAccount Balance is "+accountBalance+"\nUserName is "+userName+"\nEmail is "+email+"\nAccount Type is "+accountType);
	}
}