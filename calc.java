import java.io.*;
import java.util.Scanner;

class calc{
	public static void main(String[] args) {
		float no1,no2;
		char opr;
		System.out.println("Enter 2 no. and operation");
		Scanner n= new Scanner(System.in);
		no1=n.nextFloat();
		no2=n.nextFloat();
		String str= n.next();
		opr= str.charAt(0);
		switch(opr){
		case '*':
			System.out.println(no1*no2);
			break;
		case '-':
			System.out.println(no1-no2);
			break;
		case '+':
			System.out.println(no1+no2);
			break;
		case '/':
			System.out.println(no1/no2);
			break;
		case '%':
			System.out.println(no1%no2);
			break;
		default :
			System.out.println("Enter Valid OPeration");
		}
	}
}