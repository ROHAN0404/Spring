package student;

public class Employee {
	int a=10;
	int b=20;
	int c=0;
	
	int addition() {
		c=a+b;
		System.out.println("Addition= "+c);
		return c;
	}
	void subtraction(int a) {
		Employee e1=new Employee();
		c=e1.addition()-a;
		System.out.println("Subtraction= "+c);
		
	}
	private void multiply(int a) {
		Employee e1=new Employee();
		int c=e1.addition()*a;
		System.out.println("Multiplication= "+c);
//		return 0;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.subtraction(10);
		e1.multiply(10);
	}
}
