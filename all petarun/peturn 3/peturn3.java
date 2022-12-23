import java.util.Scanner;
public class Peturn3{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("peturn3 is below");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	System.out.printf("enter your petaren ending number 'n':");
	int n=sc.nextInt();
	int num,i,j;
	for (i = 1; i <=n; i++)
	{
		num=1;
		for(j=1;j<=i;j++)
		{
			if(j%2==0)
			{
				num=0;
				System.out.printf(num+"");
			}
			else{
				System.out.printf(num+"");
			}
			num++;
		}
		System.out.printf("\n");
	}
	}
}