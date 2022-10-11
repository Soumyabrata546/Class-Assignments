package HandsOn_Lab;
/*
 * Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.
 */
class Bank{
	int  getRate(String s) {// a method which will return the rate of interest
		if(s=="sbi") {
			return 8;
		}
		else if(s=="icici")
			return 7;
		else if(s=="axis")
			return 9;
		else
			return 0;
	}
}
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		int rate=b.getRate("icici");
		System.out.println("Rate of interest= "+rate+"%");
	}

}
