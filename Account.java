import java.util.Scanner;
class BankAccount{
	private int x;
	BankAccount(int x){
		this.x=x;
	}
	void display(){
		System.out.println(x);
	}
	void deposit(int x){
		this.x+=x;
		display();
	}
	void withdraw(int x){
		try{
			if(x>this.x){
				throw new Exception("withdraw "+ x);
			}
			this.x-=x;
		}catch(Exception withdraw){
			System.err.println(withdraw + " is greater than deposit which is "+this.x);
		}
		display();
	}
}
class Account{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BankAccount b = new BankAccount(scan.nextInt());
		b.deposit(scan.nextInt());
		b.withdraw(scan.nextInt());
	}
}