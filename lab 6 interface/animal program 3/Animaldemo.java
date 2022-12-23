// package Abstract_class_and_interface; 
interface transepot{
	public void deliver();
}
abstract class Animal{
	String name;

	public void deliver(){
	// 	System.out.println("")
	 }
}
class tiger extends Animal{
	public void deliver(){
	System.out.println("Tiger in Jungel");
	}
}
class donkey extends Animal implements transepot{
		public void deliver(){
	System.out.println("donkey use  in village");
	}
}
class camel extends Animal implements transepot{
	public void deliver(){
	System.out.println("camel use in desert");
	}
}
class deer extends Animal{
	public void deliver(){
	System.out.println("deer rinning in jungel");
	}
}

public class Animaldemo{
	public static void main(String[] args) {
		tiger t =new tiger();
		donkey de=new donkey();
		camel c=new camel();
		deer d= new deer();
		t.deliver();
		de.deliver();
		c.deliver();
		d.deliver();
	}
}