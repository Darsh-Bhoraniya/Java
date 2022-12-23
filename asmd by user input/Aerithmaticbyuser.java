import java.util.Scanner;

public class Aerithmaticbyuser{


	public static void main(String[] args){
		System.out.printf("enter your frist number= ");
		Scanner sc = new Scanner(System.in);
		float num1= sc.nextFloat();
		System.out.printf("enter your second number= ");
		float num2= sc.nextFloat();

		System.out.println("your input is num1="+num1+"\t\t"+"num2="+num2);
		System.out.println("what do you perfom operation on this number??");
		System.out.printf(" [1] Addision \n [2] Substrection \n [3] multiplication\n [4] division \n [5] Aevarage \n");
		System.out.printf(" PLEASE ENTER YOUR CHOSICE::  ");
		int uinput=sc.nextInt();
		switch(uinput){
			case 1:
				float ans1=num1+num2;
				System.out.println("YOUR Addision = "+ans1);
				break;
			case 2:
				float ans2=num1-num2;
				System.out.println("YOUR Substrection = "+ans2);
				break;
			case 3:
				float ans3=num1*num2;
				System.out.println("YOUR Multiplication = "+ans3);
				break;
			case 4:
				 float ans4=num1/num2  ;
				System.out.println("YOUR Division = "+ans4);
				break;
			case 5:
				float ans5=(num1+num2)/2;
				System.out.println("YOUR Aevarage = "+ans5);
				break;
			default:
				System.out.println("------INVALIDE INPUTE------");
				
			

		}
	}
}