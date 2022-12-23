import java.util.Scanner;
public class Marksheet{
	public static void main(String[] args){
		System.out.println("Enter no.of Subject");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		float arr[]= new float[n],percent=0;
		for(int i=0;i<n;i++){
			arr[i] = scan.nextFloat();
			percent+=arr[i]/n;
		}
		if(percent>=60)
			System.out.println("First Class");
		else if(percent>=50)
			System.out.println("Second Class");
		else if(percent>=40)
			System.out.println("Third Class");
		else
			System.out.println("Fail");
	}
}