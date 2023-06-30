package Oops;
abstract class Animal{
	abstract void eat();
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat pedegree");
	}
}
class Lion extends Animal{
	public void eat() {
		System.out.println("Lion eat dog");
	}
}
public class TestA {
	public static void main(String[] args) {
		Dog d=new Dog();
		Lion l=new Lion();
		d.eat();l.eat();
		Animal a=new Dog();
		a.eat();
	}
	
	
}
