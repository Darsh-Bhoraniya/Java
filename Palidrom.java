import java.util.Scanner;
public class Palidrom{
	public static void main(String[] args) {
		System.out.println("Enter no. Now");
		Scanner scan= new Scanner(System.in);
		int no= scan.nextInt(),temp=no,temp2=0;
		while(temp!=0){
			temp2= temp%10 +(temp2*10);
			temp/=10;
		}
		if(temp2== no)
			System.out.println("Entered no. is a Palindrom no.");
		else
			System.out.println("Entered no. is not a Palindrom no.");
	}
}