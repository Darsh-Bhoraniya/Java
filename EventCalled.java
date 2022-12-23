interface EventListener{
	void performEvent();
}
interface MouseListener extends EventListener{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}
interface KeyListener extends EventListener{
	void keyPressed();
	void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
	EventDemo(){
		performEvent();
		mouseClicked();
		mousePressed();
		mouseReleased();
		mouseMoved();
		mouseDragged();
		keyPressed();
		keyReleased();
	}
	public void performEvent(){
		System.out.println("performEvent called");
	}
	public void mouseClicked(){
		System.out.println("mouseClicked called");
	}
	public void mousePressed(){
		System.out.println("mousePressed called");
	}
	public void mouseReleased(){
		System.out.println("mouseReleased called");
	}
	public void mouseMoved(){
		System.out.println("mouseMoved called");
	}
	public void mouseDragged(){
		System.out.println("mouseDragged called");
	}
	public void keyPressed(){
		System.out.println("keyPressed called");
	}
	public void keyReleased(){
		System.out.println("keyReleased called");
	}
}
class EventCalled{
	public static void main(String[] args) {
		EventDemo obj = new EventDemo();
	}
}