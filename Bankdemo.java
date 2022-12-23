import java.util.Scanner;
class Bank{
	int actno,actamount;
	String username,email,acttype;
		void setactdetail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter actno");
		actno=sc.nextInt();
		System.out.println("Enter username");
		username=sc.next0();
		System.out.println("Enter actamoun");
		actamount=sc.nextInt();
		System.out.println("Enter acttype");
		acttype=sc.next();	
		System.out.println("Enter email");
		email=sc.next();

	} 
	void getacountdetail(){
		System.out.println("actno="+actno);
		System.out.println("username="+username);
		System.out.println("actamount="+actamount);
	}
}


class Bankdemo{
	public static void main(String[] args) {
		Bank s1 = new Bank();




		Bank s2 = new Bank();
		s1.setactdetail();
		s2.setactdetail();

		s1.getacountdetail();
		s2.getacountdetail();

	}
}