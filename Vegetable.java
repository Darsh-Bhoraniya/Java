abstract class Vegetable{
	String colour="";
	abstract String tostring();
	void colour(){
		System.out.println(colour);
	}
}
class Potato extends Vegetable{
	Potato(){
		colour="Brown";
	}
	String tostring(){
		return (" Vegetable is Potato and Colour is "+colour);
	}
}
class Brinjal extends Vegetable{
	Brinjal(){
		colour="Purple";
	}
	String tostring(){
		return (" Vegetable is Brinjal and Colour is "+colour);
	}
}
class Tomato extends Vegetable{
	Tomato(){
		colour="Red";
	}
	String tostring(){
		return (" Vegetable Tomato is and Colour is "+colour);
	}
}