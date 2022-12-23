import java.util.Scanner;
public class PalindromString{
	public static void main(String[] args) {
		System.out.println("Enter no. Now");
		Scanner scan= new Scanner(System.in);
		String str= scan.nextLine(),str1="";
		for(int i=str.length()-1;i>=0;i--)
			str1+= str.charAt(i);
		if(str.equals(str1))
			System.out.println("Entered no. is a Palindrom no.");
		else
			System.out.println("Entered no. is not a Palindrom no.");
	}
}