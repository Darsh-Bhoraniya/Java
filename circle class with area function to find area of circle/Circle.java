package circledata;
// import java.util.Math;
import java.util.Scanner;
// import static System.out;
public class Circle{
	double redius;
	double diameter;
	double aera;

	public Circle(){
		redius=5;
		diameter=2*redius;
		aera=Math.PI*Math.pow(redius,2);
	}
	public Circle(double redius){
		
		this.redius=redius;
		this.diameter=2*redius;
		this.aera=Math.PI*Math.pow(redius,2);

	}
	public void setRedius(double redius){
		this.redius=redius;
		this.diameter=2*redius;
		this.aera=Math.PI*Math.pow(redius,2);
	}
	public void setDiameter(double diameter){
		this.diameter=diameter;
		this.redius=diameter/2.00;
		this.aera=Math.PI*Math.pow(redius,2);
	}
	public void getRedius(){
		System.out.println("Redius of circle = "+redius);
	}
	public void getDiameter(){
		System.out.println("Diameter of circle = "+diameter);
	}
	public void getCircleInfo(){
		System.out.println("================================");
		System.out.println("");
		System.out.println("Redius of circle = "+ redius);
		System.out.println("Diameter of circle = "+ diameter);
		System.out.println("aera of circle is = "+ aera);
		System.out.println("");
		System.out.println("================================");

	}

	public void printAera(){
		System.out.println("aera of circle is = "+aera);
		// System.out.println("aers = "+Math.PI);
	}
}