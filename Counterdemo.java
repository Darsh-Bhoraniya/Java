class counter{
	int count=0;
	counter(){
		count++;
	}
		void displaydata(){
			System.out.println("count:"+count);
		
	}
}



public class Counterdemo{
	public static void main(String[] args) {
		counter c1 = new counter();
		c1.displaydata();

		counter c2 = new counter();
		c2.displaydata();

		counter c3 = new counter();
		c3.displaydata();
	}
}