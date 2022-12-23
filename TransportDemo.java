interface Transport{
	void deliver();
}
abstract class Animal{
	abstract void animalName();
}
class Tiger extends Animal{
	Tiger(){
		animalName();
	}
	void animalName(){
		System.out.println("Tiger");
	}
}
class Camel extends Animal implements Transport{
	Camel(){
		animalName();
		deliver();
	}
	void animalName(){
		System.out.println("Camel");
	}
	public void deliver(){
		System.out.println("Camel is delivered");
	}
	
}
class Deer extends Animal{
	Deer(){
		animalName();
	}
	void animalName(){
		System.out.println("Deer");
	}
}
class Donkey extends Animal implements Transport{
	Donkey(){
		animalName();
		deliver();
	}
	void animalName(){
		System.out.println("Donkey");
	}
	public void deliver(){
		System.out.println("Donkey is delivered");
	}
}
class TransportDemo{
	public static void main(String[] args) {
		Tiger obj=new Tiger();
		Camel obj1 =new Camel();
		Deer obj2 =new Deer();
		Donkey obj3 =new Donkey();
	}
}