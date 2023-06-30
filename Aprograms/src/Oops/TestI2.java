package Oops;
interface Raj{
	void add();
	//java 1.8 feature
	default void name() {
		middleName();
		System.out.println("I am from java8 so please respect me");
	}
	//java 1.8 feature
	static void surname(){
		
		System.out.println("My surname is Sardeshmukh");
	}
	//java 1.9 version
	private void middleName() {
		System.out.println("My middle name is Ravindra");
	}
}
interface Rahul extends Raj{
	void subtract();
}
class Execute implements Raj,Rahul{

	@Override
	public void subtract() {
	int a=10,b=7;
	int c=a-b;
	System.out.println("Subtraction :"+c);
		
	}

	@Override
	public void add() {
		int a=10,b=7;
		int c=a+b;
		System.out.println("Addition :"+c);
		
	}
//	public void name() {
//		System.out.println("My name is virat");
//	}
	
}
public class TestI2 {
	public static void main(String[] args) {
		Rahul r=new Execute();
		r.add();r.subtract();
		r.name();
		Raj.surname();
	}
}
