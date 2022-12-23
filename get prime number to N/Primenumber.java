import java.util.Scanner;

public class Primenumber{

	public static void main(String[] asdf){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter your number:: ");
		int num=sc.nextInt();
		// boolean flag=true;
		for (int i=2;i<=num ;i++ ) {
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(i+" is prime number");
			}
			// else{
			// 	System.out.println(i+" is not prime number");
			// }
		}
		



	}
}