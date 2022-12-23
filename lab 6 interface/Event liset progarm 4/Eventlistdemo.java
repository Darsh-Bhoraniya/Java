// Create interface EventListener with performEvent() method. 
// Create MouseListener interface which inherits EventListener along 
// with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods.
//  Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased()
// methods. WAP to create EventDemo class which implements MouseListener and
// KeyListener and demonstrate all the methods of the interfaces


interface EventListerer {
	public void performEvent();
}
interface MouseListener extends EventListerer{
	public void mouseClicked();
	public void mousePressed();
	public void  mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListner extends EventListerer{
	public void keyPressed();
	public void keyReleased();
}
 class Eventdemo implements MouseListener,KeyListner{
	public void mouseClicked()
	{
		System.out.println("you get output");
	}
	public void mousePressed(){
		System.out.println("you get press");
	}
	public void  mouseReleased(){
		System.out.println("you get released ");
	}
	public void mouseMoved(){
		System.out.println("you youer courser is moved");
	}	
	public void mouseDragged(){
		System.out.println("you kerser is drag");
	}
	public void keyPressed(){
		System.out.println("you key is drag");
	}
	public void keyReleased(){
		System.out.println("you get key released000");
	}
	public void performEvent(){

	}
}
public class Eventlistdemo{
	public static void main(String[] args) {
		Eventdemo ev= new Eventdemo();
		ev.mouseClicked();
		ev.mousePressed();
		ev.mouseReleased();
		ev.mouseMoved();
		ev.mouseDragged();
		ev.keyPressed();
		ev.keyReleased();
		
	}
}