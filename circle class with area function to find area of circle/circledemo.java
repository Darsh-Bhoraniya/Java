import java.util.Scanner;
// import circleresource.circledata.Circle;
import circledata.Circle;
public class circledemo{
public static void main(String[] args) {
	Circle c1 = new Circle(35);
	c1.setRedius(45);
	c1.setDiameter(50);
	c1.getCircleInfo();
	c1.getRedius();
	c1.getDiameter();
	c1.printAera();
}
}