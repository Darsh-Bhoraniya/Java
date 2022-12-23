package countvowel;
import java.util.Scanner;
public class countvowel
{
	String line[];
	int vowelcounter;
	int consonantcounter;

	public countvowel()
	{
		Scanner sc =new Scanner(System.in);
		String quit ="quit";
		String temp;
		vowelcounter=0;
		consonantcounter=0;
		this.line = new String[500];
		for(int i=0;i<500;i++) 
		{
			System.out.print("enter your line: ");
			line[i]=sc.nextLine();
			temp=line[i];
			if(quit.compareToIgnoreCase(temp)==0)
			{
				break;
			}
		}
	}
	public void countvowel()
	{
		int countlinesize=0;
		String temp2= null;
		for (int j=0;j<500;j++) 
		{
			if(line[j]!=temp2)
			{
				countlinesize++;
			}
		}
		for (int i=0;i<=countlinesize-2 ;i++ ) 
		{
			for(int j=0;j<=line[i].length()-1;j++)
			{
				if (line[i].charAt(j)=='a'|| line[i].charAt(j)=='e' || line[i].charAt(j)=='i' || line[i].charAt(j)=='o' || line[i].charAt(j)=='u' || line[i].charAt(j)=='A'|| line[i].charAt(j)=='E' || line[i].charAt(j)=='I' || line[i].charAt(j)=='O' || line[i].charAt(j)=='U')
				{
					vowelcounter++;
				}
				// else
				// {
				// 	consonantcounter++;
				// }
			}
		}
		System.out.println("total vowel's in all entered line is = "+vowelcounter);
		// System.out.println("total consonant's in all entered line is = "+consonantcounter);

	}

} 
