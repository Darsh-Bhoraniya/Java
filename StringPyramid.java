import java.util.Scanner;
class StringPyramid{
	public static void main(String[] args) {
		System.out.println("Enter string Now:");
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++){
			for (int j=str.length()-i-1;j>0 ;j--) {
				System.out.print(" ");
			}
			for (int j=0;j<=i ;j++ ) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println("");
		}
	}
}