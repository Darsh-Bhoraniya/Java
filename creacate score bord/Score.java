import java.util.Scanner;
public class Score{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value1,value2;
		System.out.print("enter how many over in your matech: ");
		value1=sc.nextInt();
		System.out.print("enter how many bol: ");
		value2=sc.nextInt();
		int total=0;
		int matechdeatail[][]= new int[value1][value2];

		for(int i=0;i<value1;i++)
		{
			for(int j=0;j<value2;j++)
			{
				System.out.print("enter RUN of over["+(i+1)+"] onball["+(j+1)+"]  ::");
				matechdeatail[i][j]=sc.nextInt();
				total=total+matechdeatail[i][j];
			}
			System.out.printf("\n");
		}
		System.out.printf("============================================\n");
		for(int i=0;i<value1;i++)
		{
			for(int j=0;j<value2;j++)
			{
				System.out.println(" RUN of over["+(i+1)+"] onball["+(j+1)+"] ::"+matechdeatail[i][j]);

			}
			System.out.println("============================================");
			
		}
		System.out.printf("============================================\n");
		System.out.printf("total RUN= "+total);
	}
}