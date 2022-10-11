package HandsOn_Lab;

class A{
	void display() {
		System.out.println("Hi i am Class A");
	}
}
class B extends A{
	
}
class C extends B{
	
}
/*
 * Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)
ans - This is known as multilevel inheritance,
here is an example
 */
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();
		ob.display();
	}

}
