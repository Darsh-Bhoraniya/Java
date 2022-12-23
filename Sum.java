import java.io.*;
import java.util.Scanner;
class Sum{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter no.of no you want to add");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		float no[]=new float[n],sum=0;
		for (int i=0;i<n ;i++ ) {
			no[i]=scan.nextFloat();
			sum+=no[i];
		}
		System.out.println(sum);
	}
}