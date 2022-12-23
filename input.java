import java.io.*;
import java.util.*;
class input{
	public static void main(String args[]){
		System.out.print("Enter no.of input in integer You want to take ");
		Scanner input = new Scanner(System.in);
		int x=input.nextInt(),n;
		for (int i=0; i<x ;i++ ) {
			n=input.nextInt();
			System.out.println(n);
		}
		}
}