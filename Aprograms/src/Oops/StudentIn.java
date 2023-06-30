package Oops;
class Rohan {
	
	Rohan(){
		System.out.println("im parent contructer");
	}
	int roll,marks;
	String name;
	void input()
	{
		System.out.println("Enter rollno, marks, name");
	}
}
public class StudentIn extends Rohan{
	String clg;
	StudentIn(){
		System.out.println("im child contructer");
	}
	StudentIn(String clg){
		this.clg=clg;
	}
	void display() {
		roll=50;marks=92;name="rohan";
		System.out.println(roll+" "+marks+" " + name+" "+clg);
	}

	public static void main(String[] args) {
		StudentIn stu = new StudentIn();
		stu.input();stu.display();
		Rohan r = new Rohan();
		r.input();

	}

}
