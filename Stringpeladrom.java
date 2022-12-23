import java.util.Scanner;
public class Stringpeladrom{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String str= sc.nextLine();
		StringBuffer s1 = new StringBuffer(str);
		StringBuffer s2 =new StringBuffer(s1.reverse());
		String str2 = s1.toString();
		if (str.equals(str2)) {
			System.out.println("[eledrom");

		}
		else{
			System.out.println("npt peldrom");
		}
	}
}
