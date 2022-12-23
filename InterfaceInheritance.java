import java.util.Scanner;
interface A{
	int a=10;
	void display();
}
interface A1 extends A{
	int a=20;
}
interface A2 extends A{
	int a=30;

}
interface A12 extends A1,A2{
	int a=40;

}
class B implements A12{
	B(){
		System.out.println("Enter A,A1,A2,A12 for 10,20,30,40 Value");
		display();
	}
	public void display(){
		Scanner scan=new Scanner(System.in);
		switch(scan.nextLine()){
			case "A" :
				System.out.println(A.a);
				break;
			case "A1" :
				System.out.println(A1.a);
				break;
			case "A2" :
				System.out.println(A2.a);
				break;
			case "A12" :
				System.out.println(A12.a);
				break;
			default :
				System.out.println("Enter valid input");
		
		}
	}
}
class InterfaceInheritance{
	public static void main(String[] args) {
		B b = new B();

	}
}