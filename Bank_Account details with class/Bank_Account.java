package Bank_AccountDetail;

public class Bank_Account{
	String bankname;
	String bankbranch;
	String userName;
	String email;
	long accountNo;
	float accountBalance;
	boolean accountType;


	public Bank_Account(){
		bankname="bank of india";
		bankbranch="nekanam";
		userName="abcde";
		email="xyz123@gmail.com";
		accountNo=123456789012l;
		accountBalance=1000.00f;
		accountType=false;

	}
	public Bank_Account(String bankname){
		this();
		this.bankname=bankname;

	}
	public Bank_Account(String bankname,String bankbranch){
		this(bankname);
		this.bankbranch=bankbranch;


	}
	public Bank_Account(String bankname,String bankbranch,String userName){
		this(bankname,bankbranch);
		this.userName=userName;

	}
	public Bank_Account(String bankname,String bankbranch,String userName,String email){
		this(bankname,bankbranch,userName);
		this.email=email;

	}
	public Bank_Account(String bankname,String bankbranch,String userName,String email,long accountNo){
		this(bankname,bankbranch,userName,email);
		this.accountNo=accountNo;

	}
	public Bank_Account(String bankname,String bankbranch,String userName,String email,long accountNo,float accountBalance){
		this(bankname,bankbranch,userName,email,accountNo);
		this.accountBalance=accountBalance;

	}
	public Bank_Account(String bankname,String bankbranch,String userName,String email,long accountNo,float accountBalance,boolean accountType){
		this(bankname,bankbranch,userName,email,accountNo,accountBalance);
		this.accountType=accountType;

	}

	 public String getAccountDetails(){
	 	System.out.println("==================================================");
	 	if (accountType)
		{
			System.out.println("account Type:: "+"saving account");
		}
		else{
			System.out.println("account Type:: "+"current account");
		}
	 	return "Bank name:: "+bankname.toUpperCase()+"\n"+"Branch name:: "+bankbranch.toUpperCase()+"\n"+"user Name:: "+userName.toUpperCase()+"\n"+"email ID:: "+email.toLowerCase()+"\n"+"account Balance:: "+accountBalance+"\n";
	}
	public void displayAccountDetails()
	{
		System.out.println("==================================================");
		System.out.println("Bank name:: "+bankname);
		System.out.println("Branch name:: "+bankbranch);
		System.out.println("user Name:: "+userName);
		System.out.println("email ID:: "+email);
		if (accountType)
		{
			System.out.println("account Type:: "+"saving account");
		}
		else{
			System.out.println("account Type:: "+"current account");
		}
		System.out.println("account Balance:: "+accountBalance);

		System.out.println("==================================================");
	}
}
