package HandsOn_Lab;
/*
 * Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.
 */
class Bank{
	int  getRate() {
		return 0;
	}
}
class Sbi extends Bank{
	int  getRate() {
		return 8;
	}
}
class Icici extends Bank{
	int  getRate() {
		return 7;
	}
}
class Axis extends Bank{
	int  getRate() {
		return 9;
	}
}
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("Sbi Rate of interest="+s.getRate());
		System.out.println("Icici Rate of interest="+i.getRate());
		System.out.println("Axis Rate of interest="+a.getRate());
	}

}
