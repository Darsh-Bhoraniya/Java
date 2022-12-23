import java.util.Scanner;
class Matrix implements Runnable{
	int r,c,arr[][],thread;
	Thread t[];
	Matrix(){
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		c=scan.nextInt();
		arr=new int[r][c];
		for (int i=0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				arr[i][j]=scan.nextInt();
			}
		}
	}
	void threadmaker(Matrix m){
		t=new Thread[r];
		for (int i=0;i<r ;i++ )
			t[i]=new Thread(m,"Matrix"+(char)i);
	}
	public void run(){
		int sum=0;
		for (int j=0;j<c && thread<r ;j++ )
			sum+=arr[thread][j];
		System.out.println(sum);
	}
	void calls(){
		for(thread=0;thread<r;thread++)
			t[thread].start();
	}
}
class MatrixSum{
	public static void main(String[] args) {
		Matrix a=new Matrix();
		a.threadmaker(a);
		a.calls();
	}
}