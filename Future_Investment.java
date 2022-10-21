package Assignments;

import java.util.Scanner;

public class Future_Investment {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int y,yr=1;
	float r,in,amn;
	System.out.println("Enter Amount:");
	amn=sc.nextFloat();
	System.out.println("Enter Rate of interest:");
	r=sc.nextFloat();
	System.out.println("Enter No of Years:");
	y=sc.nextInt();
	for(int i=1;i<=y;i++) {
	in=(amn*yr*r)/100;
	amn+=in;
	yr++;
	System.out.println(i+"Year  Futurevalue="+amn);
	}
	

}
}
