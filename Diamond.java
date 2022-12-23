import java.util.Scanner;
class Diamond{
	public static void main(String[] args) {
		System.out.println("Enter no.of rows Now:");
		Scanner scan= new Scanner(System.in);
		int row=scan.nextInt();
		for(int i=0;i<=(int)Math.ceil(row/2);i++){
			for (int j=(int)Math.ceil(row/2)-i;j>0 ;j--) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i=0;i<=(int)Math.floor(row/2);i++) {
			for (int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for (int j=(int)Math.floor(row/2);j>i;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}