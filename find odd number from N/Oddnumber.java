import java.util.Scanner;
public class Oddnumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter your number::");
		int num=sc.nextInt();
		for (int i=1;i<=num ;i++ ) {
			if(i%2!=0){
				System.out.println(i+" is odd number");
			}
		}
	}
}