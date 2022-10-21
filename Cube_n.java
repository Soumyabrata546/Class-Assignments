package Assignments;

import java.util.Scanner;

public class Cube_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Enter nth term:");

		num1=sc.nextInt();
		System.out.println("Cube upto n numbers:");
		for(int i=1;i<=num1;i++)
			System.out.println(i+"power 3: "+(i*i*i));
	}

}
