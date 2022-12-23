import java.util.Scanner;
class Factory{
	String fname;
	String addresh;
	String mobileno;

void setdata(){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Factory name");
	fname=sc.next();
	System.out.println("Enter addresh");
	addresh=sc.next();
	System.out.println("Enter mobile no");
	mobileno=sc.next();

}
void displaydata(){
		System.out.println("fname="+fname);
		System.out.println("addresh="+addresh);
		System.out.println("mobileno="+mobileno);
}
}
class Factorydemo{
	public static void main(String[] args) {
		Factory f1 = new Factory();




		Factory f2 = new Factory();
		f1.setdata();
		f2.setdata();

		f1.displaydata();
		f2.displaydata();

	}
}