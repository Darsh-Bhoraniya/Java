import java.util.Scanner;

// a method for computing xy doing repetitive multiplication.
// X and y are of type integer and are
// to be given as command line arguments.
// Raise and handle exception(s) for invalid values of x and y.

public class ExeptoionalDemo{
	public static void main(String[] args) {
	boolean flag=true;
	while(flag){	
		try{
		Scanner sc = new Scanner(System.in);
		int x ,y,ans;
			System.out.println("enter value of {X}");
			x= sc.nextInt();
			System.out.println("enter value of {Y}");
			y= sc.nextInt();
			ans=x*y;
			System.out.println("multiplication of X * Y = "+ans);
			flag=false;
		}catch(Exception e){
			System.out.println("Enter Intiger value");
			// e.printStackTrace();
		}
	}

	} 
}