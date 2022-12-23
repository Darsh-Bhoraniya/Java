import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		System.out.println("Enter no.of Now");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt(),i;
		for(i=2;i<=n/2;i++){
			if(n%i==0)
				break;
		}
		if(i!=n/2)
			System.out.println("not Prime");
		else
			System.out.println("Prime");
	}
}