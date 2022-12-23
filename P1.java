/*Pattern 
      *
     * *
    *   *
   * * * *
*/
import java.io.*;
import java.util.Scanner;
class P1{
	public static void main(String[] args) {
		System.out.println("Enter line of triangle");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=n-1-i;j>=0;j--)
				System.out.print(" ");
			if(i!=1)
				System.out.print("*");
			for (int j=2;j<2*i-1;j++)
				System.out.print(" ");
			System.out.print("*\n");
			
		}
		for (int i=0;i<n ;i++ )
			System.out.print("* ");
	}
}