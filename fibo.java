import java.io.*;
import java.util.*;
class fibo{
	public static int fibo(int x){
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		return fibo(x-1)+fibo(x-2);
	}
	public static void main(String args[]){
		System.out.print("Enter fibonacii no. \n");
		Scanner n=new Scanner(System.in);
		int x=n.nextInt();
		System.out.print(fibo(x));
	}
}