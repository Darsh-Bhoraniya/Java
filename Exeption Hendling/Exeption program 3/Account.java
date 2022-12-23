import java.util.Scanner;
// WAP to create Account class, which is representing a bank account
// where we can deposit and withdraw money.
// if we want to withdraw money which exceed our bank balance? 
// We will not be allowed, create InSufficientFundException to handle
// above situation and display proper error message.

class Account{
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in); 
			int Balance,Widarawal,pendingamount=0;
			System.out.println("Enter your balance ");
			Balance = sc.nextInt();

			try{
				System.out.println("Enter your Widarawal Value ");
				Widarawal= sc.nextInt();
				if (Balance < Widarawal){
				throw new Exception ("plese Enter less then value of your amount");
				}
				pendingamount =Balance-Widrawal;
				System.out.println("your balance ="+ pendingamount);
			}catch(Exception e){
				e.printStackTrace();
		}
			
	}
}