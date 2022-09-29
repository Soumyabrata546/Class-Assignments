package Fresh;

public class Rectangle{
	private int length,breadth;
	Rectangle(){
	length=5;
	breadth=10;
	}
	public Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
		
	}
//	void display() {
//		System.out.println("length="+length+" "+"breadth="+breadth);
//	}
	public int calculate() {
		return length*breadth;
	}
}