import java.util.Scanner;
public class dby{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter how manny number you want to enter????");
		int n=sc.nextInt();
		int num[]=new int[n];

		for (int i=0;i<n;i++ ) {
		System.out.print("enter your num["+(i+1)+"] ::");
		num[i]=sc.nextInt();			
		}
		System.out.println("============================================");
		// int choise;
		// System.out.print("enter your expectation number:: ");
		// choise=sc.nextInt();
		// boolean flag=false;
		System.out.println("============================================");
		for(int i=0;i<n;i++)
		{
			if(num[i]%5==0 || num[i]%7==0)
			{
				System.out.println("the number "+num[i]+" which index is["+(i+1)+"] is divided by 5 or 7::...");
			}
		}
		

	}
}