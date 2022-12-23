import java.util.Scanner;

public class peturn6{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter number of row's:  ");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			for(int k=n-1;k>i;k--){
				System.out.print(" ");
			}
			for (int j=0;j<i ;j++ ) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for (int i=n-2;i>0 ;i-- ) {
			for(int k=n-1;k>i;k--){
				System.out.print(" ");
			}
			for (int j=0;j<i ;j++ ) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}