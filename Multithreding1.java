// Write an application that executes two threads. One thread displays "Good Morning" every(
//  1000 milliseconds & another thread displays "Good Afternoon" 
// every 3000 milliseconds. Create the threads by implementing the Runnable interface

class run2 extends Runnable{
	public void run(){
			for (; ; ) {
					System.out.println("Good mot=rnig");
					try{
						Thread.sleep(1000);	
					}catch(Exception e){}
			}
	}
}

class run2 extends Runnable{
	public void run(){
			for (; ; ) {
					System.out.println("Good Afteer=nono");
					try{
						Thread.sleep(3000);	
					}catch(Exception e){}
			}
	}
}


public class Multithreading1{
	public static void main(String[] args) {
		run1  r1= new run1();
			Thread th = new Thread(r1);
			th.start();	

			run2  r2= new run2();
			Thread th2 = new Thread(r2);
			th2.start();

	}
}