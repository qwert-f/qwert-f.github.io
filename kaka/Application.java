public class Application{
	public static void main(String []argruments) {
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
	}
}
abstract class Animal{
	public abstract void cry();
	public abstract String getAnimalName(); 
}
class Cat extends Animal{
	public void cry() {
		System.out.println("meow meow meow!");
	}
	public String getAnimalName() {
		System.out.println("Cat");
		return "jie";
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("woof woof woof!");
	}
	public String getAnimalName(){
		System.out.println("Dog");
		return "jie";
	}
}
class Simulator{
	public void playSound(Animal animal) {
		animal.cry();
		animal.getAnimalName();
	}
}