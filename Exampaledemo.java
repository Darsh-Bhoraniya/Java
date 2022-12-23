import java.util.Scanner;
class Exampale{
	int a,b;
	 Exampale()
	{
		a=1;
		b=2;
	}
	Exampale(int x , int y){
		a=x;
		b=y;
	}
	void displaydata(){
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
 class Exampaledemo{
 	public static void main(String[] args) {
 	Exampale obj1=new Exampale();
 	Exampale obj2=new Exampale(5,2);

 		//constructur no calling 
 		
 		obj1.displaydata();
 		obj2.displaydata();
 		
  	}

}