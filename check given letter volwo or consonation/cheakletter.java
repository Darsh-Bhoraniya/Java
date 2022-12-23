import java.util.Scanner;
public class cheakletter{

	public static void main(String[] args) {
		
		System.out.printf("Enter your string:");
		Scanner sc = new Scanner(System.in);
		char s1= sc.next().charAt(0);

		if(s1=='a'|| s1=='e' || s1=='i' || s1=='o' || s1=='u' || s1=='A'|| s1=='E' || s1=='I' || s1=='O' || s1=='U')
		{
			System.out.printf("Given charecter is vowael...\n");

		}
		else{
			System.out.printf("Given charecter is consonant...\n");
		}


	}
}