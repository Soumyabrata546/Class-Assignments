package PallabiMaam;

import java.util.Scanner;

public class noddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=");
		int n=sc.nextInt(),sum=0;
		for(int i=1;i<=n;i+=2) {
			sum+=i;
		}
		System.out.println("Sum of"+n+" odd numbers="+sum);
	}

}
