import java.util.Scanner;
abstract class Vegitable{
	public String color;
	Vegitable(String color){
		this.color=color;
	}
	abstract String tostring();
} 
class potato extends Vegitable{
potato(){
	super("cream");
}
public String tostring(){
	return("potato: "+ color);
}
}
class brinjal extends Vegitable{
	brinjal(){
		super("Purpel");
	}
	public String tostring(){
	return("brinjal: "+ color);
}

}
class tomato extends Vegitable{
	tomato(){
	super("red");
	}

public String tostring(){
	return("tomto: "+ color);
}
}





public class Vegetabledemo{
	public static void main(String[] args) {
		Vegitable v = null;
			Scanner sc= new Scanner(System.in);
			String str= sc.next();
			System.out.println("Enter your string");
			switch(str){
			case(potato)
				v = new potato()
				break;
		
			case(potato)
				v = new potato()
			break;

			case(potato)
				v = new potato()
				break;
		
		}	
}
}