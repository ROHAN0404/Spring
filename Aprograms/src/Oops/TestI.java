package Oops;

interface CustomerRohan
{
	int amt=5;
	void purchase();
}
class sellerRamu implements CustomerRohan
{

	@Override
	public void purchase() {
		System.out.println("Rohan needs "+amt+" kg rice");
		
	}
	
}
public class TestI {

	public static void main(String[] args) {
		CustomerRohan cr=new sellerRamu();
		cr.purchase();
		System.out.println(sellerRamu.amt);
		System.out.println(cr.amt);

	}

}
