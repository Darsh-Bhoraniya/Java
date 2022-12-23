import java.util.Scanner;
class CountVowels{
	public static void main(String[] args) {
		
	int countVowelNo;
	String str;
		public void setmethod(){
		System.out.println("Enter Your String");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
	
	public void counts(){
		for (int i=0;i<str.length() ;i++)
			if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u')
				countVowelNo++;
		}
		}
	}
}