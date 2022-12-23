import java.util.Scanner;
public class Voweldemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Sentence");
		String str= sc.nextLine();
		int vowel=0;
		char ch;
		while()
		{
				System.out.println("Enter You Sentence");
				str= sc.nextLine();
				for (int i=0;i<str.length();i++) {
					ch=str.charAt(i);
					if (ch=='a'|| ch=='u'||ch=='o'||ch=='i'||ch=='e') {
						vowel++;
					}		
				}
					}
				System.out.println("vowel="+vowel);

	}
}



