import java.util.Scanner;
public class paledromdemo{
	public static void main(String[] args) {
		System.out.print("enter your string ::  ");
		Scanner sc =new Scanner(System.in);
		String str1 = sc.nextLine();
		StringBuffer s1 =new StringBuffer(str1);
		StringBuffer s2 =new StringBuffer(s1.reverse());
		String str2=s2.toString();
		if(str1.equals(str2)){
			System.out.println("your enterde string is PALEDROM ");
		}
		else {
			System.out.println("your enterde string is NOT PALEDROM ");
		}

		

	}
}
