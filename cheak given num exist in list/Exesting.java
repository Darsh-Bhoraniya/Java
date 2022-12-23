import java.util.Scanner;
public class Exesting{
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
		int choise;
		System.out.print("enter your expectation number:: ");
		choise=sc.nextInt();
		boolean flag=false;
		System.out.println("============================================");
		for(int i=0;i<n;i++)
		{
			if(num[i]==choise)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("your enterd number "+choise+" is exist in your list...");
			System.out.println("============================================");
		}
		else
		{
			System.out.println("your enterd number "+choise+" IS NOT EXIST in your list...");
			System.out.println("============================================");
		}

	}
}