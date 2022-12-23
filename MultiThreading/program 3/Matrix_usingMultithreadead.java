/*Write a complete multi-threaded program to meet following requirements:
a. Read matrix [A] m x n
b. Create m number of threads
c. Each thread computes summation of elements of one row, i.e.
 ith row of the matrix is processed by ith thread. Where 0 <= i< m.
d. Print the results*/
import java.util.Scanner;
class sumArry implements Runnable{
		static int[][] a;
		static int col;
		static int raw;
		static int y=0;
		public void readarry(int n, int m,Scanner sc ){
			a= new int[n][m];
			col=m;raw=n;
			for (int i = 0;i<n ;i++ ) {
				for (int j=0;j<m ;j++ ) {
					a[i][j]=sc.nextInt();
				}
				
			}
		}
		public void run(){
			int sum =0;

			for (int i=0;i<col ;i++ ) {
				sum = sum +a[y][i];
			}
			y++;
			System.out.println("sum"+sum);
		}
	}

public class Matrix_usingMultithreadead{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter you colum & raw");
		int n =sc.nextInt();
		int m =sc.nextInt();
		sumArry a1= new sumArry();
		a1.readarry(n,m,sc);

		sumArry[] b1;
		b1=new sumArry[n];
		for (int i=0;i<n ;i++ ) {
			b1[i]= new sumArry();
			Thread t1 =new Thread(b1[i]);
			t1.start();
			
		}

	}
}
