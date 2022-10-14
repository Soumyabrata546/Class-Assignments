package PallabiMaam;
//class calculator
class Calculator{
	void addition(int a,int b){
		System.out.println("Addition ="+(a+b));
	}
	void subtraction(int a,int b){
		System.out.println("Subtraction ="+(a-b));
	}
	void multiplication(int a,int b){
		System.out.println("Multiplication="+(a*b));
	}
}
public class mainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.addition(3, 5);
		c.subtraction(10, 3);		
		c.multiplication(4, 5);
	}

}
