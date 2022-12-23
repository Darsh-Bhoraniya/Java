import java.util.Scanner;
public class Primedemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		boolean falg=false;
		for (int i = 2 ;i<=num ;i++ ) {
			if(num%i==0){
			falg = true;
			break;
			}
			if(falg) {
				System.out.println("primw");
			}	
			else{
				System.out.println("noit");
			}

		}
	}
}