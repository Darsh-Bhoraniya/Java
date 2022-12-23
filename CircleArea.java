import java.util.Scanner;
class CircleArea{
	Double r,area;
	void setmethod(){
		Scanner scan =new Scanner(System.in);
		r= scan.nextDouble();
		scan.close();
		areaCalc area =new areaCalc();
		area.areaOfCirlce();
	}
	private class areaCalc{
		void areaOfCirlce(){
			area=Math.PI*Math.pow(r,2);
		}
	}
	void displayArea(){
		System.out.println(area);
	}
}