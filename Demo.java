//Write a program to create circle class with area function to find area of circle.
import java.util.Scanner;
import java.util.*;
class circelarea{
 	double circelarea(double r){
 		double res;
 	 res=3.14*(r*r);
 	System.out.print("area"+res);
 	}
}



public class Demo{
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
 		System.out.print("Ente your radiousd");
 		double r =sc.nextFloat();
		circelarea c = new circelarea();
		c.circelarea(r);
	}
}