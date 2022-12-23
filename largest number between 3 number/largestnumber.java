import java.util.Scanner;
public class largestnumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.printf("enter your number("+(i+1)+"): ");
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.printf(" your number("+(i+1)+"):"+a[i] +"\n");
			// int a[i]=sc.nextInt();
		}
		if(a[0]>a[1] && a[0]>a[2])
		{

			System.out.printf(a[0]+" is largest number \n");

		}
		else if (a[1]>a[0]&&a[1]>a[2]) {
			System.out.printf(a[1]+" is largest number \n");
		}
		else{
			System.out.printf(a[2]+" is largest number \n");
		}
	}
}