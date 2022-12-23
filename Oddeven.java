import java.util.Scanner;
class Oddeven{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente value for odd evem number:");
		n=sc.nextInt();
		System.out.print(n%2==0?"Even number":"Odd number");
	}
}