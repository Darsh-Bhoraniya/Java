//Write a program to create two threads, one thread will print odd numbers and 
//second thread will print even numbers between 1 to 20 numbers.
// Write an application that executes two threads. One thread displays "Good Morning" every
//  1000 milliseconds & another thread displays "Good Afternoon" 
// every 3000 milliseconds. Create the threads by implementing the Runnable interface
class even implements Runnable{
	public void run(){
		for (int i =0;i<=20 ;i++) {
			if (i%2==0) {
			System.out.println(i);
		}
			
			try{
				// Thread.sleep(1000);
			}catch (Exception e){}
		}
	}
} 
class odd implements Runnable{
	public void run(){
		for (int i=0 ;i<=20;i++ ) {
			if (i%2!=0) {
				System.out.println(i);
			}
			try{
				// Thread.sleep(3000);
			}catch (Exception e){}
		}
	}
} 
public class Oddevenusingmultithreading{
	public static void main(String[] args) {
			even e1= new even();
			Thread th = new Thread(e1);
			th.start();	

			odd e2= new odd();
			Thread th2 = new Thread(e2);
			th2.start();
	}
}