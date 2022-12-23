import java.util.Scanner;

public class PatternRectangle
{
	char sysmbol;
	int lenth;
	int width;
	boolean isfilld;
Scanner sc = new Scanner(System.in);

	public PatternRectangle()
	{
		lenth=5;
		width=5;
		sysmbol='*';
		isfilld=true;
	}  
	public PatternRectangle(String ask)
	{
		// this(lenth,width,isfilld,sysmbol);
		String temp ;
		if(ask=="askuser" || ask=="AskUser" || ask=="ASKUSER"){
		System.out.print("enter lenth: ");
		lenth=sc.nextInt();
		System.out.print("enter width: ");
		width=sc.nextInt();
		System.out.print("enter sysmbol: ");
		sysmbol = sc.next().charAt(0);
		System.out.print("enter pattern is filled  yes or not : ");
		temp=sc.nextLine();
		if(temp=="yes")
			this.isfilld=true;
		}
		else{
			this.isfilld=false;
		}
	}
	public PatternRectangle(int lenth)
	{
		this();
		this.lenth=lenth;
		
	}
	public PatternRectangle(int lenth,int width)
	{
		this(lenth);
		this.width=width;
		
	}
	public PatternRectangle(int lenth,int width,boolean isfilld)
	{
		this(lenth,width);
		this.isfilld=isfilld;
		
	}
	public PatternRectangle(int lenth,int width,boolean isfilld,char sysmbol)
	{
		this(lenth,width,isfilld);
		this.sysmbol=sysmbol;
	}


	public void print()
	{
		for (int i=0;i<=lenth;i++) 
		{
			for (int j=0;j<=width;j++)
			{
				if (isfilld) {
				System.out.print(" "+sysmbol+" ");	
				}
				else if (i==0 || i==lenth || j==0 || j==width)
				{
					System.out.print(" "+sysmbol+" ");
				}
				else{
					System.out.print("   ");
				}
				

			}
			System.out.print("\n");
		}
		System.out.print("\n==================================================\n");
	}
	public void printarea(){
		System.out.println("the rectangle aerea is "+(lenth*width));
	}
	public void printtype(){
		if(lenth==width)
		{
			System.out.println("pattern type is SQUAR");
		}
		else if (lenth!=width) {
			System.out.println("pattern type is RECTANGLE");
		}
	}
}