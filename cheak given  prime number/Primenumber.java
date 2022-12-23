import java.util.Scanner;

public class Primenumber{

	public static void main(String[] asdf){
		Scanner sc = new Scanner(System.in);
			System.out.printf("Enter your number:: ");
			int num=sc.nextInt();
			boolean flag=true;
			for (int i=2;i<num/2 ;i++ ) {
				if(num%i==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(num+" is prime number");
			}
			else{
				System.out.println(num+" is not prime number");
			}


	
}
}