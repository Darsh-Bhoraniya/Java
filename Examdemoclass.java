import javca.util.Scanner;
calss Examdemo{
	int hh;
	int mm;
	Examdemo(int x, int y){
			hh=x;
			mm=y;

	}
	Examdemo(){
		hh=0;
		mm=0;
	}
	void displaydata(){
		System.ot.println("hour "+hh);
		System.out.println("minit "+mm);
	}
		Examdemo add(Examdemo b){
			Examdemo temp =new Examdemo();
			temp.mm=this.mm+b.mm;
		temp.hh=this.hh+b.mm+(temp.mm/60);
		temp.mm=temp.mm%60;
		return temp;	
	}
}
class Examdemoclass{
	public static void main(String[] args) {
		Examdemo t1=new Examdemo(3,35);
		Examdemo  t2= new Examdemo(6,45);
    
        Examdemo t3 = new Examdemo();
        t3 = t1.add(t2);
        t1.displaydata();
        t2.displaydata();
        t3.displaydata();
	}
}