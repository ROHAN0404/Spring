package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("We are in main method");
		
		//using class
//		MyInter impl = new MyInterImpl();
//		imp/l.sayHello();
		
		//using anonymous class
//		MyInter i= new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("I am in myinter main");
//				
//			}
//		};
//		
//		i.sayHello();
		
		//using our interface with help of lambda expression
		
		
		MyInter i=()->{
			System.out.println("I am in lambda expression");
		};
		MyInter i2=()->System.out.println("I am in second myinterimpl");
		i.sayHello();i2.sayHello();
		
//		SumIntern s1=(int a,int b)->{
//			return a+b;
//		};
		SumIntern s1=(a,b)->a+b;
		System.out.println(s1.sum(12,34));
	}

}
